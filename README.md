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

- Example list
    1. example1: Scene Builder intro with some buttons
    2. example2: Using buttons to move a Circle obj
    3. example3: Adding CSS to obj
    4. example4-1 and example4-2: Switching between scenes
    