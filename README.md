# JavaFX

- How stages work in JavaFX

~~~java
package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

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
~~~

- Added various components
~~~java
package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);

        Text text = new Text();
        text.setText("Hi!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(200);
        rectangle.setWidth(200);
        rectangle.setX(400);
        rectangle.setY(400);

        root.getChildren().add(text);
        root.getChildren().add(rectangle);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
~~~

- CSS
~~~java
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("example3.fxml"));
        stage.setTitle("Hello World");

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
~~~

- Close click implementation
~~~java
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("example6.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(event -> {
                logout(stage);
                event.consume();
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
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
~~~

- KeyEvents
~~~java
package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("example13.fxml"));
            Parent root = loader.load();

            KeyEventsController controller = loader.getController();
            Scene scene = new Scene(root);

            scene.setOnKeyPressed(keyEvent -> {
                switch (keyEvent.getCode()){
                    case UP:
                        controller.moveUp();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                    case LEFT:
                        controller.moveLeft();
                        break;
                    case RIGHT:
                        controller.moveRight();
                        break;
                    default:
                        break;
                }
            });

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(event -> {
                logout(stage);
                event.consume();
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args) {
        launch(args);
    }
}
~~~

- Example list
    1. example1: Scene Builder intro with some buttons
    2. example2: Using buttons to move a Circle obj
    3. example3: Adding CSS to obj
    4. example4-1 and example4-2: Switching between scenes
    5. example5-1 and example5-2: Passing value between controllers(not working)
    6. example6: Logout functionality
    7. example7: Image Changing with Button click
    8. example8: Input validation
    9. example9: Checkbox usage
    10. example10: ListView
    11. example11: TreeView
    12. example12: MenuBars
    13. example13: Key Events  