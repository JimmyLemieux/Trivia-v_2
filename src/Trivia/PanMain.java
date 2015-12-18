/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trivia;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author adeea0332
 */
public class PanMain extends JPanel {

    public static PanMainGame panMainGame = new PanMainGame();
    JButton btn;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btnback;

    public PanMain() {
        btn = new JButton("Sports");
        btn2 = new JButton("TV Shows");
        btn3 = new JButton("Movies");
        btn4 = new JButton("History");
        btn5 = new JButton("Science");
        add(btn);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
    }
}
