package com.example.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage palco) throws IOException {
        palco.setTitle("Meu Aplicativo JavaFX");
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}