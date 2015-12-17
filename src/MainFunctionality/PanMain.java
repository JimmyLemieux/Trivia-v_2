/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFunctionality;

import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.awt.event.*;
import java.io.FileReader;
import java.util.*;

public final class PanMain extends JPanel implements ActionListener {

    Scanner sin = new Scanner(System.in);
    String filePath = "H:\\NetBeansProjects\\Trivia\\src\\MainFunctionality\\JSON.json";
    JLabel label;
    JButton[] btn;
    //int i;
    JSONObject object;
    JSONArray jsonArr;
    String Options;
    String placeHolderOption = "";
    int i = 1;
    
    FileReader reader;
    JSONParser parser;

    public PanMain() throws Exception {
        label = new JLabel();

        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);


        btn = new JButton[3];
        for (int g = 0; g < btn.length; g++) {
            btn[g] = new JButton("Question");
        }
        //init buttons
        updateButton();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //This would represent correct answer
        if (e.getSource() == btn[0]) {
            //Increrment by 1 when answer in correct
            i++;
            System.out.println(i);
            updateButton();
        }
    }

    //The Refresh button function
    public void updateButton() {
        String questions = (String) object.get("Q" + i);
        System.out.println(questions);
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
}
