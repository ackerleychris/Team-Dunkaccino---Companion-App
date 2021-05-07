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

    
    
    /**
     * 
     * This Function relates to the button BackButton, which can be -clicked- to return to ZoneSelect
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(2);
    }
    
    

}
