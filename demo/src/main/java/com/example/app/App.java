package com.example.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage palco) {
        Label label = new Label("Digite seu nome: ");
        TextField campoTexto = new TextField();
        Button botao = new Button("Concluir");
        VBox layout = new VBox(label, campoTexto, botao);

        Scene cena = new Scene(layout, 300, 200);
        
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

