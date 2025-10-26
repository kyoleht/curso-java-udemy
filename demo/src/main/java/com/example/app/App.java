package com.example.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage palco) {
        Button botao1 = new Button("Botão 1");
        Button botao2 = new Button("Botão 2");
        Button botao3 = new Button("Botão 3");
        Button botao4 = new Button("Botão 4");

        HBox hbox = new HBox(botao1, botao2);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(botao3, botao4);
        vbox.setAlignment(Pos.CENTER);

        BorderPane borderpane = new BorderPane();
        borderpane.setTop(hbox);
        borderpane.setCenter(vbox);

        Scene cena = new Scene(borderpane, 300, 300);
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

