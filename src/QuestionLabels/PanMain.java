/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionLabels;

import javax.swing.*;


public class PanMain extends JPanel {

    JLabel[] label;
    
    public PanMain(){
        
        label = new JLabel[4];
        for(int i = 0;i<label.length;i++){
            label[i].setText("Hello");
            add(label[i]);
        }
        
    }
    
}
