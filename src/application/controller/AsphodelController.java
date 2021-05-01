package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import application.Main;

public class AsphodelController {

    @FXML
    private Button BackButton;

    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(2);
    }

}
