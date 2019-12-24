/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.luso.ui.di;

import dagger.Module;
import dagger.Provides;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class AppUiModule {

    @Provides
    @Singleton
    @Named("pane")
    public Pane providesPane() {
        return new Pane();
    }

    @Provides
    @Singleton
    public Scene providesScene(@Named("pane") Pane pane) {
        StackPane stackPane = new StackPane();
        pane.setStyle("-fx-background-color:blue");
        stackPane.getChildren().add(pane);
        return new Scene(stackPane, 1920, 1080);
    }
}
