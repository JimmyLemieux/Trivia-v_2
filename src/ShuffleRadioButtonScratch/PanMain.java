/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ShuffleRadioButtonScratch;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author burtm5944
 */
public class PanMain extends JPanel {

    JRadioButton[] radioButton = new JRadioButton[4];

    public PanMain() {

        radioButton[0] = new JRadioButton("Question A");
        radioButton[1] = new JRadioButton("Question B");
        radioButton[2] = new JRadioButton("Question C");
        radioButton[3] = new JRadioButton("Question D");

        ButtonGroup bG = new ButtonGroup();
        FischerYates(radioButton);

        for (int i = 0; i < radioButton.length; i++) {
            bG.add(radioButton[i]);
            this.add(radioButton[i]);
        }
    }

    static void FischerYates(JRadioButton[] radioButton) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = radioButton.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
//            String a = radioButton[index];
//            radioButton[index] = radioButton[i];
//            radioButton[i] = a;
        }
    }
}
