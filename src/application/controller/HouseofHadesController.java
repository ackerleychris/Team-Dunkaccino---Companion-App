package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


/**
 * 
 * 
 * 
 * @author Zachary Bowman raq506
 *
 */

public class HouseofHadesController {

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
