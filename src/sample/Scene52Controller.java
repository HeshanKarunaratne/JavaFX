package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene52Controller {

    @FXML
    Label nameLabel;

    public void displayName(String username) {
        nameLabel.setText("Hello: " + username);
    }

}