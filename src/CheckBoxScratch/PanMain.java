/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBoxScratch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author lemij7026
 */
public class PanMain extends JPanel implements ActionListener {

    JCheckBox box;
    public PanMain(){
        box = new JCheckBox();
        box.setText("The question");
        box.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
            System.out.println(box.getText());
        } else {//checkbox has been deselected
            System.out.println("The item is not selected!");
        };
    }
});
        add(box);     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
