package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ZoneSelectController {

    @FXML
    private Button HoHButton;
    
    @FXML
    private Button BackButton;
    
    
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }

    @FXML
    void HoHPressed(ActionEvent event) {

    	Main.set_pane(3);   	
    }

}

