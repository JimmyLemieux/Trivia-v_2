/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFunctionality;

import java.awt.BorderLayout;
import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.Timer;
import javax.imageio.ImageIO;

public final class PanMain extends JPanel implements ActionListener {

    Scanner sin = new Scanner(System.in);
    String filePath = "JSON.json";
    JButton[] btn;
    JSONObject object;
    JSONArray jsonArr;
    int i = 1;
    
    FileReader reader;
    JSONParser parser;
    
    //Question Label
    JLabel qlbl;
    
    //The timer label
    JLabel timerLbl;
    int t = 30;
    
    //For the images
    ImageIcon icn;
    JSONArray jsonImages;
   
    
    public PanMain() throws Exception {
        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);


        btn = new JButton[3];
        for (int g = 0; g < btn.length; g++) {
            btn[g] = new JButton("Question");
        }
        //init buttons
        updateButton();
        updateQuestion();
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
       add(timerLbl);
        
        
       
       
    }
    
    //Ill work on the answers tomorrow

    @Override
    public void actionPerformed(ActionEvent e) {
        //This would represent correct answer
        if (e.getSource() == btn[0]) {
            //Increrment by 1 when answer in correct
            t = 30;
            i++;
            //System.out.println(i);
            remove(qlbl);
            repaint();
            updateButton();
            updateQuestion();
            updateImage();
            
        }
    }

    //The Refresh button function
    public void updateButton() {
       
        //This is for the text in the button
        jsonArr = (JSONArray) object.get("Answers" + i);
         //JSONObject options = (JSONObject) parser.parse(reader);
        //   btn = new JButton[3];
        for (int j = 0; j < btn.length; j++) {
            //Remove old buttons and make new buttons based on new options
            remove(btn[j]);
            btn[j] = new JButton(jsonArr.get(j).toString());
            btn[j].addActionListener(this);
             
            add(btn[j]);
        }
        repaint();
        revalidate();
    }
    
    public void updateQuestion(){
        
        String question = (String) object.get("Q"+i);
         qlbl = new JLabel(question);
        add(qlbl);
        repaint();
        revalidate();
    }
    
    public void updateImage(){
        
        jsonImages = (JSONArray) object.get("Images");
        //System.out.println(jsonImages);
        //now loop through
        //Then extract the actual String Item
        for(int j = 0;j<jsonImages.size();j++){
            System.out.println(jsonImages.get(j));
            
        }
        //System.out.println(str);
        
        
        //System.out.println(str);
        
        
        //Use a buffered Image
        //And an ImageIO.read();
        //AYYYY
    }

 
   
}
