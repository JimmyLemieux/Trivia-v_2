
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;

public class RunIt {

    public static void main(String[] args) throws Exception {
        FileReader readArr = new FileReader("H:\\NetBeansProjects\\Trivia Quiz\\Trivia\\src\\ArrayofJSONScratch\\Q & A.json");
        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(readArr);
        JSONArray Question1 = (JSONArray) jsonObj.get("question1");
        for (int i = 1; i < Question1.size(); i++) {
            JSONObject jsonOut = (JSONObject) Question1.get(i);
            String sAnswer = (String) jsonOut.get("a" + i);
            System.out.println(sAnswer);
        }
    }
}