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
import java.util.*;

public class PanMain extends JPanel implements ActionListener {

    Scanner sin = new Scanner(System.in);
    String filePath = "H:\\NetBeansProjects\\Trivia\\src\\MainFunctionality\\JSON.json";
    JLabel label;
    JButton[] btn;
    //int i;
    JSONObject object;
    JSONArray jsonArr;

    public PanMain() throws Exception {
        label = new JLabel();
        btn = new JButton[3];
        FileReader reader = new FileReader(filePath);
        JSONParser parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);
        //For the array of answers
        //  JSONObject jsonObjArr = (JSONObject) parser.parse(reader.toString());

        //Loop through the questions
        for (int i = 1; i <= 5;) {
            String questions = (String) object.get("Q" + i);
            System.out.println(questions);
            jsonArr = (JSONArray) object.get("Answers" + i);
            String A1 = (String) jsonArr.get(0).toString();
            System.out.println(A1);

            //For The answers
         //   System.out.println(jsonArr);
            i++;
        }

        //The Answers

/*
        for (int j = 0; j < jsonArr.size(); j++) {
            JSONObject jsonOut = (JSONObject) jsonArr.get(j);
            String S1 = (String) jsonOut.get(j).toString();
            /*     String O1 = (String) jsonOut.get("O1");
             String O2 = (String) jsonOut.get("O2");
             String O3 = (String) jsonOut.get("O3");
             System.out.println(O1);
             System.out.println(O2);
             System.out.println(O3);
            System.out.println(S1);

        }
 */



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int j = 0; j < btn.length; j++) {
            if (e.getSource() == btn[j]) {

                int index = j;
                if (btn[j] == object.get("Answer")) {
                    System.out.println("CORRECT");
                }
                break;
            }

        }
    }
}
