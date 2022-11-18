package com.example.comp1011ass2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JokeViewController implements Initializable {

    @FXML
    private Button punchlineBtn;

    @FXML
    private Label setupLbl;

    @FXML
    private Label titleLbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        JokeResponse joke = createJokeObject();
        titleLbl.setText("Here's a Joke!");
        assert joke != null; // asserting that the joke is not null in the JSON response
        setupLbl.setText(joke.getSetup());


    }

    private JokeResponse createJokeObject(){
        try {
            JSONObject jObject = new JSONObject(APIUtility.getJsonString());
            int id = jObject.getInt("id");
            String type = jObject.getString("type");
            String setup = jObject.getString("setup");
            String punchline = jObject.getString("punchline");
            return new JokeResponse(id,type,setup,punchline);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
