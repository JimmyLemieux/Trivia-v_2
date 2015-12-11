/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArRadioButtonsScratch;


import javax.swing.JFrame;

/**
 *
 * @author burtm5944
 */
public class FraMain extends JFrame{
    
    public FraMain(){
        PanMain panMain = new PanMain();
        add(new PanMain());
        setTitle("TV Scratch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(500, 500); //1370, 730 for fullscreen for laptop        
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
