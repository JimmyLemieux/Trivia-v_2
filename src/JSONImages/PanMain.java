/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONImages;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class PanMain extends JPanel {

    //LoadImages into labels
    JLabel LblImage;
    ImageIcon imgIc;
    //URL
    URL url;

    public PanMain() throws Exception {

        BufferedImage image = null;
        url = new URL("H:\\NetBeansProjects\\Trivia-heyJSON\\donald.jpg");
        image = ImageIO.read(url);

        LblImage = new JLabel("WHERE THE LABEL IS");
        imgIc = new ImageIcon(image);
        LblImage.setIcon(imgIc);
        add(LblImage);



    }
}
