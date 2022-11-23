package com.example.comp1011ass2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PunchlineController implements Initializable {

    @FXML
    private Button jokeBtn;

    @FXML
    private Label punchlineLbl;

    @FXML
    private Label punchlineTitleLbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        punchlineTitleLbl.setText("\uD83D\uDE02 \uD83D\uDE02");

    }


    @FXML
    void switchToJokeView(ActionEvent event) throws IOException {

    }

    //get joke info
    public void getPunchline(String punchline){
        punchlineLbl.setText(punchline);
    }


}
