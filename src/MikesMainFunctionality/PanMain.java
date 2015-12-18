/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesMainFunctionality;

import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.awt.event.*;
import java.io.FileReader;
import java.util.*;

public class PanMain extends JPanel implements ActionListener {

    Scanner sin = new Scanner(System.in);
    String filePath = "src\\MikesMainFunctionality\\JSON.json";
    JLabel lblAnswer;
    JButton[] btnAnswer;
    //int i;
    JSONObject object;
    JSONArray jsonArr;
    String Options;
    String placeHolderOption = "";
    int i = 1;
    
    FileReader reader;
    JSONParser parser;

    public PanMain() throws Exception {
        lblAnswer = new JLabel();

        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);


        btnAnswer = new JButton[4];
        for (int g = 0; g < btnAnswer.length; g++) {
            btnAnswer[g] = new JButton("Question");
        }
        //init buttons
        updateButton();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //This would represent correct answer
        if (e.getSource() == btnAnswer[0]) {
            //Increrment by 1 when answer in correct
            i++;
            System.out.println(i);
            updateButton();
        }
    }

    //The Refresh button function
    public void updateButton() {
        String questions = (String) object.get("a" + i);
        System.out.println(questions);
        jsonArr = (JSONArray) object.get("Answers" + i);
        //JSONObject options = (JSONObject) parser.parse(reader);
        //   btn = new JButton[3];
        for (int i = 0; i < btnAnswer.length; i++) {
            //Remove old buttons and make new buttons based on new options
            remove(btnAnswer[i]);
            btnAnswer[i] = new JButton(jsonArr.get(i).toString());
            
            btnAnswer[i].addActionListener(this);
            add(btnAnswer[i]);
        }
        repaint();
        revalidate();
    }
}
