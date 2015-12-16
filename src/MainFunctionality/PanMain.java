/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFunctionality;

import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;

public class PanMain extends JPanel implements ActionListener {

    String filePath = "H:\\NetBeansProjects\\Trivia\\src\\MainFunctionality\\JSON.json";
    JLabel label;
    JButton[] btn;
    //int i;

    JSONObject object;
    public PanMain() throws Exception {
        label = new JLabel();
        btn = new JButton[3];
        FileReader reader = new FileReader("H:\\NetBeansProjects\\Trivia Quiz\\Trivia\\src\\QuestionScratch\\TVq&a.json");
        JSONParser parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);

        //Options array
        String[] OPTIONS = new String[3];


        //Loop through the questions
        for (int i = 1; i <= 3;i++) {
           String questions = (String) object.get("Q" + i);
            System.out.println(questions);
        }


       

        //The Options
        for (int o = 0; o < 3; o++) {
            btn[o] = new JButton((String) object.get("O" + o));
            btn[o].addActionListener(this);
            add(btn[o]);
            
            
        }

    }



    @Override
        public void actionPerformed(ActionEvent e) {
        for(int j = 0;j<btn.length;j++){
            if(e.getSource() == btn[j]){
                
                int index=j;
                if(btn[j] == object.get("Answer")){
                    System.out.println("CORRECT");
                }
                break;
            }
            
        }
    }
}
