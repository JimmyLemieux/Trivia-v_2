/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trivia;

/**
 *
 * @author adeea0332
 */
import static Trivia.FraMain.panMain;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class FraMain extends JFrame implements ActionListener {

    public static PanMain panMain = new PanMain();
    public static PanMainGame panMainGame = new PanMainGame();

    public FraMain() {
        setVisible(true);
        panMain.setVisible(true);
        add(panMain);
        setTitle("Trivia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        panMain.btn.addActionListener(this);
        panMain.btn2.addActionListener(this);
        panMain.btn3.addActionListener(this);
        panMain.btn4.addActionListener(this);
        panMain.btn5.addActionListener(this);
        panMainGame.btnNext.addActionListener(this);
        panMainGame.btnBack.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == panMain.btn) {
            remove(panMain);
            add(panMainGame);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn2) {
            remove(panMain);
            add(panMainGame);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn3) {
            remove(panMain);
            add(panMainGame);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn4) {
            remove(panMain);
            add(panMainGame);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn5) {
            remove(panMain);
            add(panMainGame);
            repaint();
            revalidate();
        }
        if(event.getSource() == panMainGame.btnBack) {
            add(panMain);
            remove(panMainGame);
            repaint();
            revalidate();
        }
        if(event.getSource() == panMainGame.btnNext) {
            remove(panMainGame);
            panMainGame = new PanMainGame();
            add(panMainGame);
            repaint();
            revalidate();
        }
    }
}