package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author Heshan Karunaratne
 */
public class ImageController {

    @FXML
    ImageView myImageView;

    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("app2.PNG"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }
}
