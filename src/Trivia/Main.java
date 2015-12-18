/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trivia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author adeea0332
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
       FraMain fraMain = new FraMain();
       FileReader readerArr = new FileReader( "H:\\NetBeansProjects\\Trivia\\src\\JSONScratch\\jsonFileArray.json");
        JSONParser parser = new JSONParser();
        JSONObject jsonArr = (JSONObject) parser.parse(readerArr);
        JSONArray theStuff = (JSONArray) jsonArr.get("employees");
        //Iterate through the Array
        for(int i = 0;i<theStuff.size();i++){
            JSONObject jsonOut = (JSONObject) theStuff.get(i);
            System.out.println(jsonOut);
        }     
    }
}
