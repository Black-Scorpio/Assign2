package com.example.comp1011ass2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("joke-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Random Jokes");
        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/images/clown.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        launch();
    }
}