/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TriviaGame;

/**
 *
 * @author adeea0332
 */
//import static Trivia.FraMain.panMain;
//import static Trivia.FraMain.panMainGame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class FraMain extends JFrame implements ActionListener {

    public static PanMain panMain = new PanMain();
    public static PanMainSports panMainSports;
    public static PanMainHistory panMainHistory;
    public static PanMainTVShows panMainTVShows;
    public static PanMainPolitics panMainPolitics;
    public static PanMainMovies panMainMovies;

    public FraMain() throws Exception {
        panMainSports = new PanMainSports();
        panMainHistory = new PanMainHistory();
        panMainTVShows = new PanMainTVShows();
        panMainPolitics = new PanMainPolitics();
        panMainMovies = new PanMainMovies();
        setVisible(true);
        panMain.setVisible(true);
        add(panMain);
        setTitle("Trivia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        setSize(1200, 400); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        panMain.btn.addActionListener(this);
        panMain.btn2.addActionListener(this);
        panMain.btn3.addActionListener(this);
        panMain.btn4.addActionListener(this);
        panMain.btn5.addActionListener(this);
        panMainSports.btnBack.addActionListener(this);
        panMainHistory.btnBack.addActionListener(this);
        panMainTVShows.btnBack.addActionListener(this);
        panMainMovies.btnBack.addActionListener(this);
        panMainPolitics.btnBack.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == panMain.btn) {
            remove(panMain);
            add(panMainSports);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn2) {
            remove(panMain);
            add(panMainTVShows);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn3) {
            remove(panMain);
            add(panMainHistory);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn4) {
            remove(panMain);
            add(panMainPolitics);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMain.btn5) {
            remove(panMain);
            add(panMainMovies);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMainSports.btnBack) {
            remove(panMainSports);
            add(panMain);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMainTVShows.btnBack) {
            remove(panMainTVShows);
            add(panMain);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMainHistory.btnBack) {
            remove(panMainHistory);
            add(panMain);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMainPolitics.btnBack) {
            remove(panMainPolitics);
            add(panMain);
            repaint();
            revalidate();
        }
        if (event.getSource() == panMainMovies.btnBack) {
            remove(panMainMovies);
            add(panMain);
            repaint();
            revalidate();
        }
    }
}
