/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBoxScratch;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
public class PanMain extends JPanel implements ActionListener, ItemListener {

    JCheckBox box;
    JCheckBox box1;

    public PanMain() {
        this.setLayout(new GridLayout(2, 3));
        box = new JCheckBox();
        box.setText("The question");
        box.addItemListener(this);
        //   add(box,BorderLayout.NORTH);    
        add(box);

        box1 = new JCheckBox();
        box1.setText("Question2");
        add(box1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
