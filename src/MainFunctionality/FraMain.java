
package MainFunctionality;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author lemij7026
 */
public class FraMain extends JFrame {
    
    public FraMain() throws Exception {
         //PanMain pan = new PanMain();
        setLayout(new BorderLayout());
        add(new PanMain());
        setTitle("Main Fuinc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        
    }
    
}
