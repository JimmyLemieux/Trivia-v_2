
package CheckBoxScratch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FraMain extends JFrame {
    
    public FraMain(){
        PanMain pan = new PanMain();
        //setLayout(new BorderLayout());
        add(new PanMain());
        setTitle("checkBox Scratch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    
    }
}
