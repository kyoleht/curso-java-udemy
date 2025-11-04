package com.example.app;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage palco) {
        FileChooser selector = new FileChooser();
        Button openButton = new Button("Abrir arquivo");
        
        openButton.setOnAction(e -> {
            File selectedFile = selector.showOpenDialog(palco);
            if(selectedFile != null) {
                selectedImage(selectedFile, palco);
            }
        });

        VBox layout = new VBox(openButton);
        Scene cena = new Scene(layout, 800, 800);
        palco.setTitle("Testando FileChooser");
        palco.setScene(cena);
        palco.show();
    }

    private void selectedImage(File file, Stage palcoSelectedFile) {
        Image image = new Image(file.toURI().toString());
        ImageView imageView = new ImageView(image);

        VBox layout;

        //obtendo o layout atual
        layout = (VBox) palcoSelectedFile.getScene().getRoot();

        //adicionando imagem ao layout 
        layout.getChildren().add(imageView);

        //ajustando tamanho da imagem
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);

        palcoSelectedFile.setTitle("File Selector");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

