/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONImages;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.net.URL;

public class PanMain extends JPanel {

    //LoadImages into labels
    JLabel LblImage;
    ImageIcon imgIc;
    //URL
    URL url;

    public PanMain() throws Exception {

        String filePath = "";
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse("");
        
        


    }
}
