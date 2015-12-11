/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutScratch;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author burtm5944
 */
class PanBoxes extends JPanel {
    JCheckBox[] checkBox = new JCheckBox[4];
    
    public PanBoxes(){
        setLayout(new GridLayout(1, 4));
        checkBox[0] = new JCheckBox("Question A");
        checkBox[1] = new JCheckBox("Question B");
        checkBox[2] = new JCheckBox("Question C");
        checkBox[3] = new JCheckBox("Question D");
        

        for (int i = 0; i < checkBox.length; i++) {
            add(checkBox[i]);
           
        }
    }
    
}
