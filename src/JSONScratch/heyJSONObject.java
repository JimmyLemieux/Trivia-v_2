/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONScratch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author lemij7026
 */
public class heyJSONObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
       
        
        //||||THIS IS FOR A SINGLE OBJECT||||\\
        FileReader readerObj = new FileReader("H:\\NetBeansProjects\\Trivia\\src\\JSONScratch\\jsonFileObject.json");
        JSONParser parserObj = new JSONParser();
        JSONObject jsonObject = (JSONObject) parserObj.parse(readerObj);
        String sName = (String) jsonObject.get("OBJECT");
        //You have to use a long for some reason :(
        long sAge =  (long) jsonObject.get("AGE");
        System.out.println(sName);
        System.out.println(sAge);
        
    }
}
