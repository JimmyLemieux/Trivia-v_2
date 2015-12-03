/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TimerScratch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author lemij7026
 */
public class PanMain extends JPanel implements ActionListener {

    JLabel label;
    Timer timer = new Timer();
    

    public PanMain() {
        timer.scheduleAtFixedRate(new TimerTask() {
            int time = 0;
            @Override
            public void run() {
                time++;
                System.out.println(time);
            }
        }, 0, 1000);
      

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
