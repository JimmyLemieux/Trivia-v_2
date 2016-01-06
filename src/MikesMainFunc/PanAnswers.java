/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesMainFunc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author burtm5944
 */
class PanAnswers extends JPanel implements ActionListener {

    Scanner sin = new Scanner(System.in);
    String filePath = "src\\MikesMainFunc\\JSON.json";
    JLabel lblAnswer;
    JRadioButton[] rbtnAnswer;
    JSONObject object;
    JSONArray jsonArr;
    String Options;
    String placeHolderOption = "";
    int i = 1;
    FileReader reader;
    JSONParser parser;

    public PanAnswers() throws Exception {
        lblAnswer = new JLabel();
        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);
        rbtnAnswer = new JRadioButton[4];
        for (int g = 0; g < rbtnAnswer.length; g++) {
            rbtnAnswer[g] = new JRadioButton("Question");
        }
        //init buttons
        updateButton();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //This would represent correct answer
        if (e.getSource() == rbtnAnswer[0]) {
            //Increrment by 1 when answer in correct
            i++;
            
            updateButton();
        }
    }

    //The Refresh button function
    public void updateButton() {
        String questions = (String) object.get("Q" + i);
        jsonArr = (JSONArray) object.get("Answers" + i);
        //JSONObject options = (JSONObject) parser.parse(reader);
        //   btn = new JButton[3];
        for (int i = 0; i < rbtnAnswer.length; i++) {
            //Remove old buttons and make new buttons based on new options
            remove(rbtnAnswer[i]);
            rbtnAnswer[i] = new JRadioButton(jsonArr.get(i).toString());

            rbtnAnswer[i].addActionListener(this);
            add(rbtnAnswer[i]);
        }
        repaint();
        revalidate();
    }
}
