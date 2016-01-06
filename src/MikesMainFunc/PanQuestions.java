/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesMainFunc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
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
class PanQuestions extends JPanel implements ActionListener {

    Scanner sin = new Scanner(System.in);
    String filePath = "src\\MikesMainFunc\\JSON.json";
    JLabel lblQuestion;
    JSONObject object;
    JSONArray jsonArr;
    String Options;
    String placeHolderOption = "";
    int i = 1;
    FileReader reader;
    JSONParser parser;
    String sQuestion;

    public PanQuestions() throws Exception {
        lblQuestion = new JLabel();

        reader = new FileReader(filePath);
        parser = new JSONParser();
        object = (JSONObject) parser.parse(reader);
        //init buttons
        updateButton();



    }

    //The Refresh button function
    public void updateButton() {
        String questions = (String) object.get("Q" + i);
        lblQuestion.setText(questions);
        add(lblQuestion);
        jsonArr = (JSONArray) object.get("Answers" + i);
        //JSONObject options = (JSONObject) parser.parse(reader);
        //   btn = new JButton[3];

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }