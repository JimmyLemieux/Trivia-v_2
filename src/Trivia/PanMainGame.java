/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trivia;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author adeea0332
 */
class PanMainGame extends JPanel implements ActionListener {

    JButton btnBack, btnNext, btn;
    JRadioButton[] radioButton = new JRadioButton[4];
    public static PanMainGame panMainGame = new PanMainGame();
    public static PanMain panMain = new PanMain();
    int i = 0;

    public PanMainGame() {
        btnBack = new JButton("Back");
        btnNext = new JButton("Next");;
        btn = new JButton("btn");
        btnBack.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnBack);
        add(btnNext);
        radioButton[0] = new JRadioButton("Question A");
        radioButton[1] = new JRadioButton("Question B");
        radioButton[2] = new JRadioButton("Question C");
        radioButton[3] = new JRadioButton("Question D");
        ButtonGroup bG = new ButtonGroup();
        for (int i = 0; i < radioButton.length; i++) {
            bG.add(radioButton[i]);
            this.add(radioButton[i]);
        }
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnNext) {
            add(btn);
        }
    }
}