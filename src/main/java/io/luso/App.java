/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.luso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        final Scene scene = new Scene(stackPane, 1920,1080);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Re7");
    }

}
