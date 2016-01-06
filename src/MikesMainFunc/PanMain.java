/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesMainFunc;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author burtm5944
 */
class PanMain extends JPanel {

    PanQuestions panQuestions;
    PanAnswers panAnswers;
    
    public PanMain() throws Exception {
        this.panQuestions = new PanQuestions();
        this.panAnswers = new PanAnswers();
        setLayout(new BorderLayout());
        add(panQuestions, BorderLayout.NORTH);
        add(panAnswers, BorderLayout.CENTER);
        
    }
    
}
