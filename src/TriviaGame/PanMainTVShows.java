/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TriviaGame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Toolkit;

public final class PanMainTVShows extends JPanel implements ActionListener {

    String filePath;
    JPanel panel;
    private JButton[] btn;
    JButton btnBack;
    JSONObject object;
    JSONArray jsonArr;
    String sJson;
    JSONObject obj;
    public int i = 1, nRight;
    FileReader reader;
    JSONParser parser;
    JLabel qlbl;
    JLabel timerLbl, lbl, lbl2;
    int t = 30;
    JSONArray jsonImages;
    JLabel imgLbl;
    ImageIcon imgIc;

    public PanMainTVShows() throws Exception {
        filePath = "src\\TriviaGame\\TVShows.json";
        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);
        sJson = object.toString();
        btn = new JButton[4];
        btnBack = new JButton("Back");
        add(btnBack);
        for (int g = 0; g < btn.length; g++) {
            btn[g] = new JButton("Question");
        }
        updateButton();
        updateQuestion();
        updateAnswer();
        try {
            updateImage();
        } catch (IOException ex) {
            Logger.getLogger(PanMainSports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn[updateAnswer()]) {
            t = 30;
            t--;
            i++;
            nRight++;
            remove(qlbl);
            remove(imgLbl);
            repaint();
        } else {
            t = 30;
            t--;
            i++;
            remove(qlbl);
            remove(imgLbl);
            repaint();
        }
        if (i == 6) {
            removeAll();
            add(btnBack);
            repaint();
            String sRight = Integer.toString(nRight);
            lbl = new JLabel("Your score is " + sRight + "/" + "5");
            add(lbl);
            repaint();
            revalidate();
        } else {
            updateButton();
            updateQuestion();
            updateAnswer();
            remove(btnBack);
        }

        try {
            updateImage();
        } catch (IOException ex) {
            Logger.getLogger(PanMainSports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateButton() {
        jsonArr = (JSONArray) object.get("Answers" + i);
        for (int j = 0; j < btn.length; j++) {
            remove(btn[j]);
            String sQ = jsonArr.get(j).toString();
            String sSub = sQ.substring(7, sQ.length() - 2);
            int nInd = (int) sQ.indexOf(sSub);
            btn[j] = new JButton(sSub);
            btn[j].addActionListener(this);
            add(btn[j], BorderLayout.CENTER);
        }
        repaint();
        revalidate();
    }

    public void updateQuestion() {
        String question = (String) object.get("Q" + i);
        qlbl = new JLabel(question);
        add(qlbl);
        qlbl.setFont(new Font("Serif", Font.PLAIN, 24));
        repaint();
        revalidate();
    }

    public int updateAnswer() {
        jsonArr = (JSONArray) object.get("AnswerKey");
        String s = jsonArr.get(i - 1).toString();
        String newString = s.substring(6, s.length() - 1);
        int nAns = Integer.parseInt(newString);
        return nAns;
    }

    public void updateImage() throws IOException {
        jsonArr = (JSONArray) object.get("Images");
        String a = jsonArr.get(i - 1).toString();
        System.out.println(a.length());
        String newString = a.substring(11, a.length() - 2);
        System.out.println(newString);
        try {
            Image img = ImageIO.read(new File(newString));
        } catch (IOException ex) {
            Logger.getLogger(PanMainSports.class.getName()).log(Level.SEVERE, null, ex);
        }

        imgLbl = new JLabel("");
        imgIc = new ImageIcon(newString);
        imgLbl.setIcon(imgIc);
        add(imgLbl, BorderLayout.CENTER);
    }
}
