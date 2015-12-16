/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesRadioButtonsScratch;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author burtm5944
 */
public class PanMain extends JPanel {
    
    
    public PanMain(){
        
     JRadioButton rb1 = new JRadioButton("Question 1");
     JRadioButton rb2 = new JRadioButton("Question 2");
     JRadioButton rb3 = new JRadioButton("Question 3");
     JRadioButton rb4 = new JRadioButton("Question 4");
     
     ButtonGroup bG = new ButtonGroup();
     bG.add(rb1);
     bG.add(rb2);
     bG.add(rb3);
     bG.add(rb4);
     this.add(rb1);
     this.add(rb2);
     this.add(rb3);
     this.add(rb4);
     this.setVisible(true);
    }
}
