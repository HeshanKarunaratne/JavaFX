package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * @author Heshan Karunaratne
 */
public class CheckBoxController {
    @FXML
    private CheckBox myCheckBox;

    @FXML
    private Label myLabel;

    public void change(ActionEvent event){

        if(myCheckBox.isSelected()){
            System.out.println("ON");
            myLabel.setText("ON");
        }else {
            System.out.println("OFF");
            myLabel.setText("OFF");
        }
    }
}
