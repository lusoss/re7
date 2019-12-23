/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.luso.ui.di;

import dagger.Module;
import dagger.Provides;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import javax.inject.Singleton;

@Module
public class AppUiModule {

    @Provides
    @Singleton
    public Scene providesScene(){
        StackPane stackPane = new StackPane();
        return new Scene(stackPane, 1920,1080);
    }
}
