package com.example.comp1011ass2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;



public class SceneChanger {

    // Create a static method that will change scenes

    public static void changeScenes(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Random Jokes");
        stage.getIcons().add(new Image(String.valueOf(SceneChanger.class.getResource("/images/clown.png"))));
        stage.setScene(scene);
        stage.show();
    }
}
