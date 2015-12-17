/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TimerScratch;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author lemij7026
 */
public class FraMain extends JFrame {
    
    public FraMain(){
        PanMain pan = new PanMain();
        setLayout(new FlowLayout());
        add(new PanMain());
        setTitle("The Timer");
        setVisible(true);
        setSize(1000,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        
    }

   
    
    
    
}
