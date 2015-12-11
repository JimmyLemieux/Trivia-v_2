/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TimerScratch;

import java.awt.BorderLayout;
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
    JLabel gameOverLabel;
    int counter = 0;
    String labelTxt;
    public PanMain() {
        
        //The label
        label = new JLabel();
        label.setSize(400,400);
        add(label, BorderLayout.CENTER);
        
        
        //a
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            
            @Override
            public void run() {
                counter+=10;
                label.setText(String.valueOf(counter));
                label.repaint();
                label.revalidate();
                
                if("0".equals(label.getText())){
                    
                }
                    
            }
        }, 0, 1);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
