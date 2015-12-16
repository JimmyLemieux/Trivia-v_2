/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesMultiCheckBoxesScratch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author burtm5944
 */
class PanMain extends JPanel implements ActionListener {

    JCheckBox[] checkBox = new JCheckBox[4];

    public PanMain() {
        checkBox[0] = new JCheckBox("Question A");
        checkBox[1] = new JCheckBox("Question B");
        checkBox[2] = new JCheckBox("Question C");
        checkBox[3] = new JCheckBox("Question D");

        for (int i = 0; i < checkBox.length; i++) {
            add(checkBox[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
