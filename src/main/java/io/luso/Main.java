package io.luso;

import io.luso.domain.Recipe;
import io.luso.ui.di.DaggerAppUiComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = DaggerAppUiComponent.builder().build().scene();
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Re7");
    }
}
