/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesMainFunc;

import javax.swing.JFrame;

/**
 *
 * @author burtm5944
 */
public class FraMain extends JFrame {
    
    public FraMain() throws Exception {
         //PanMain pan = new PanMain();
        //setLayout(new BorderLayout());
        add(new PanMain());
        setTitle("Main Func");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);      
    }   
}