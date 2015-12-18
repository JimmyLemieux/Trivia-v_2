/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trivia;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author adeea0332
 */
class PanMainGame extends JPanel  {
    JButton btnBack;
    
    public PanMainGame() {
        btnBack = new JButton("Back");
        add(btnBack);
    }
}
