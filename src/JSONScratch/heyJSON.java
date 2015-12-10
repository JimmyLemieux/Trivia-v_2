/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONScratch;

//import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;

//!!!!!!!!HEY JSON!!!!!!!!\\

public class heyJSON {
    //private static final String filepath = "H:\\NetBeansProjects\\Trivia\\src\\JSONScratch\\jsonFileArray.json";
    public static void main(String[] args) throws Exception {
        //Gain access to the file
        
        //||||THIS IS FOR THE ARRAY OF JSON||||\\
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
