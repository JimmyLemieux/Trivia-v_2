/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MikesQuestionScratch;

import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author lemij7026
 */
public class TVQA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {


        //||||THIS IS FOR A SINGLE OBJECT||||\\
        Scanner sin = new Scanner(System.in);
        String sInput;
        FileReader readerObj = new FileReader("H:\\NetBeansProjects\\Trivia Quiz\\Trivia\\src\\QuestionScratch\\TVq&a.json");
        JSONParser parserObj = new JSONParser();
        JSONObject jsonObject = (JSONObject) parserObj.parse(readerObj);

            String sQuestion = (String) jsonObject.get("question");
            System.out.println(sQuestion);
            for (int i = 1; i < 5; i++) {  //this is a loop
                String sAnswer = (String) jsonObject.get("a" + i);
                System.out.println(sAnswer);

            }
        sInput = sin.next();
        if (sInput.equals("c")) {
            System.out.println("Correct!");
        }
    }
}
