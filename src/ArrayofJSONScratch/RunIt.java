
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;


public class RunIt {
    

    public static void main(String[] args) throws Exception {
        

       
        FileReader readerArr = new FileReader("H:\\NetBeansProjects\\Trivia Quiz\\Trivia\\src\\ArrayofJSONScratch\\Q & A.json");
        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(readerArr);
        JSONArray theStuff = (JSONArray) jsonObj.get("employees");
        
        for (int i = 0; i < theStuff.size(); i++) {
            JSONObject jsonOut = (JSONObject) theStuff.get(i);
            String firstName = (String) jsonOut.get("firstName");
            String lastName = (String) jsonOut.get("lastName");
            System.out.println(firstName);
            System.out.println(lastName);

        }


    }
}