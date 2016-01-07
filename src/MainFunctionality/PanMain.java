/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFunctionality;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO; 
import java.awt.Toolkit;


public final class PanMain extends JPanel implements ActionListener {

    //Scanner sin = new Scanner(System.in);
    String filePath;
    JButton[] btn;
    JSONObject object;
    JSONArray jsonArr;
    String sJson;
    JSONObject obj;
    //JSONArray jsonArr2;
    public int i = 1;
    
    FileReader reader;
    JSONParser parser;
    
    //Question Label
    JLabel qlbl;
    
    //The timer label
    JLabel timerLbl;
    int t = 30;
    
    //For the images
    
    JSONArray jsonImages;
    JLabel imgLbl;
    ImageIcon imgIc;
   
    
    public PanMain() throws Exception {
       // filePath = "H:\NetBeansProjects\Trivia\src\MainFunctionality\JSON.json";
        filePath  = "H:\\NetBeansProjects\\Trivia-heyJSON\\src\\MainFunctionality\\MainJSON.json";
        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);
        sJson = object.toString();
       // obj = new JSONObject(sJson);
        btn = new JButton[3];
        for (int g = 0; g < btn.length; g++) {
            btn[g] = new JButton("Question");
        }
             
        //init buttons
        updateButton();
        updateQuestion();
        updateAnswer();
        updateImage();
        
        
        timerLbl = new JLabel();      
        //The timer for the Game
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {
                t--;
                timerLbl.setText(String.valueOf(t));
                repaint();
                revalidate();
                
            }
            
        }, 0, 1000);
       //timerLbl.setBounds(100, 100, 20 , 20);
        timerLbl.setBounds(100, 100, 20, 20);
       add(timerLbl);
        
        
       
       
    }
    
    //Ill work on the answers tomorrow

    @Override
    public void actionPerformed(ActionEvent e) {
        //This would represent correct answer
        if (e.getSource() == btn[updateAnswer()]) {
            //Increrment by 1 when answer in correct
            t = 30;
            i++;
            remove(qlbl);
            repaint();
           
                updateButton();
                updateQuestion();
                updateAnswer();
            try {
                updateImage();
            } catch (IOException ex) {
                Logger.getLogger(PanMain.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }
    }

    //The Refresh button function
    public void updateButton() {
       
        jsonArr = (JSONArray) object.get("Answers" + i);
        //   btn = new JButton[3];
        for (int j = 0; j < btn.length; j++) {
            //Remove old buttons and make new buttons based on new options
            remove(btn[j]);
            String sQ = jsonArr.get(j).toString();
            
            
            //Here use the substring method, then make a nre String starting from the start of the substring to the end of the substring you created
            String sSub = sQ.substring(7, sQ.length() - 2);
            int nInd = (int) sQ.indexOf(sSub);
            System.out.println(sSub);
            btn[j] = new JButton(sSub);
            btn[j].addActionListener(this);
            add(btn[j]);
        }
        repaint();
        revalidate();
    }

    
    public void updateQuestion() {
        String question = (String) object.get("Q"+i);
         qlbl = new JLabel(question);
        add(qlbl);
        repaint();
        revalidate();
    }
    
    public int updateAnswer() {
       jsonArr = (JSONArray) object.get("AnswerKey");
        String s = jsonArr.get(i - 1).toString();
        //Basically a string within a string
        String newString = s.substring(7, s.length() - 1);
        int nAns = Integer.parseInt(newString);
        System.out.println("The new Answer is " + nAns);
        return nAns;
        
        
    }
    
    public void updateImage() throws IOException{
        jsonArr = (JSONArray) object.get("Images");
        String a = jsonArr.get(i - 1).toString();
        System.out.println(a.length());
        String newString = a.substring(11, a.length() - 2);
        System.out.println(newString);
        //BufferedImage
         //img = Toolkit.getDefaultToolkit().getImage(newString);
        Image img = ImageIO.read(new File(newString));
        imgLbl = new JLabel("ImageGoeshere");
        imgIc = new ImageIcon(newString);
        imgLbl.setIcon(imgIc);
        
        
         
    }

  
}