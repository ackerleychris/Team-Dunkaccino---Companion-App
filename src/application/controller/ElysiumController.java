package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import application.Main;

/**
 * @author Zachary Bowman raq506
 *
 */

public class ElysiumController {

	
	
	
    @FXML
    private Button BackButton;

    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(2);
    }
    
    

}
