/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONImages;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.net.MalformedURLException;
public class FraMain extends JFrame{
    public FraMain() throws MalformedURLException{
        setLayout(new BorderLayout());
        add(new PanMain());
        setTitle("HeyJSONImages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    
}
