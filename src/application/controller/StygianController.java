package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;



/*
 * author: David Kent keg229
 */


public class StygianController 
{
	 @FXML
	    private Button BackButton; //BACK BUTTON
	
	 @FXML
	    private TextArea StygianText;
	    
	 @FXML
	 	private Pane BG;
	
	 
	 /**
	  * this function "BackPressed" takes the user back to the weapon select screen (weapons.fxml) when it is clicked, relating to the "BackButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */

	 @FXML
	    void BackPressed(ActionEvent event) {
	    	Main.set_pane(9);
	    }
}
