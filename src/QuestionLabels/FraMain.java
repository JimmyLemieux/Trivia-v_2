/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionLabels;

import java.awt.GridLayout;
import javax.swing.*;
public class FraMain extends JFrame {
    
    public FraMain(){
        PanMain pan = new PanMain();
        setLayout(new GridLayout());
        add(new PanMain());
        setTitle("Questions");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        
    }
    
    
}
