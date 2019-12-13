package io.luso.ui.di;

import dagger.Component;
import javafx.scene.Scene;

import javax.inject.Singleton;

@Component(modules=AppUiModule.class)
@Singleton
public interface AppUiComponent {

    Scene scene();
}
