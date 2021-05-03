package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



/**
 * @author Zachary Bowman raq506
 *
 */
public class WeaponsController 
{
	 @FXML
	    private Button BackButton;
	
	
	
	
	
	 @FXML
	    void BackPressed(ActionEvent event) {
	    	Main.set_pane(0);
	    }
}
