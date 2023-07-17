package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

//    @Override
//    public void start(Stage stage) {
//        try {
//
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("example13.fxml"));
//            Parent root = loader.load();
//
//            KeyEventsController controller = loader.getController();
//            Scene scene = new Scene(root);
//
//            scene.setOnKeyPressed(keyEvent -> {
//                switch (keyEvent.getCode()){
//                    case UP:
//                        controller.moveUp();
//                        break;
//                    case DOWN:
//                        controller.moveDown();
//                        break;
//                    case LEFT:
//                        controller.moveLeft();
//                        break;
//                    case RIGHT:
//                        controller.moveRight();
//                        break;
//                    default:
//                        break;
//                }
//            });
//
//            stage.setScene(scene);
//            stage.show();
//
//            stage.setOnCloseRequest(event -> {
//                logout(stage);
//                event.consume();
//            });
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    private ObservableList<String> suggestions = FXCollections.observableArrayList(
            "Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Jackfruit"
    );

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        ListView<String> listView = new ListView<>();

        // Set up the list view with the suggestions
        listView.setItems(suggestions);

        // Event handler to filter the suggestions based on the user's input
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            String filter = newValue.toLowerCase();
            ObservableList<String> filteredList = FXCollections.observableArrayList();

            for (String suggestion : suggestions) {
                if (suggestion.toLowerCase().contains(filter)) {
                    filteredList.add(suggestion);
                }
            }

            listView.setItems(filteredList);
        });

        VBox root = new VBox(textField, listView);
        Scene scene = new Scene(root, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Auto Suggestion ListView Example");
        primaryStage.show();
    }

    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout");
        alert.setContentText("Do you want to save before exiting?");

        if (alert.showAndWait().get() == ButtonType.OK) {

            System.out.println("Logout initiated");
            stage.close();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
