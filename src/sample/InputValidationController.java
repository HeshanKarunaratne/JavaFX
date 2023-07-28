package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

            try {
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Show the error in an Alert
                showErrorAlert(e);
            }

        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers");
            myLabel.setText("Enter only numbers");
        }
    }

    private void showErrorAlert(Exception e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("An unexpected error occurred");
        alert.setContentText("Error details: " + e.getMessage());
        alert.showAndWait();
    }
}
