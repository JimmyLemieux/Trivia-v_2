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

    public PanMain() throws Exception {
        label = new JLabel();
        btn = new JButton[3];
        FileReader reader = new FileReader(filePath);
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(reader);
        String sQuestion = (String) object.get("Question1");
        String sAnswer1 = (String) object.get("wAns");
        String sAnswer2 = (String) object.get("wAns1");
        String sAnswer3 = (String) object.get("Answer");
        System.out.println(sQuestion);
        label.setText(sQuestion);
        add(label);


        btn[0] = new JButton(sAnswer1);
        btn[1] = new JButton(sAnswer2);
        btn[2] = new JButton(sAnswer3);

        for (int i = 0; i < 3; i++) {
            btn[i].addActionListener(this);
            add(btn[i]);
        }



    }

 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn[0] || e.getSource() == btn[1] ){
             System.out.println("Wrong");
         } else {
             
             System.out.println("CORRECT!!");
         }
    }
}
