/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesLayoutScratch;

/**
 *
 * @author burtm5944
 */

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author burtm5944
 */
class PanMain extends JPanel {

    PanBoxes panBoxes = (new PanBoxes());

    public PanMain() {
        setLayout(new BorderLayout());
        add(panBoxes, BorderLayout.NORTH);
        
    }
}
