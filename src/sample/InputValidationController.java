package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author Heshan Karunaratne
 */
public class InputValidationController {
    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField;

    @FXML
    private Button myButton;

    int age;

    public void submit(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
            System.out.println("Age is:" + age);

            if (age >= 18) {
                myLabel.setText("You  are now signed up!!");
            } else {
                myLabel.setText("You must be 18 years old");
            }

        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers");
            myLabel.setText("Enter only numbers");
        }
    }
}
