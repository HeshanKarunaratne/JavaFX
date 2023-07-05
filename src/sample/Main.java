package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        stage.setWidth(500);
        stage.setHeight(500);

        stage.setX(200);
        stage.setY(200);

        stage.setResizable(true);
        stage.setScene(scene);
        stage.setTitle("Staging Demo");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
