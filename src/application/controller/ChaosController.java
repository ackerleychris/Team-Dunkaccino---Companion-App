package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;


/*
 * author: David Kent
 */


public class ChaosController 
{
	 @FXML
	    private Button BackButton; //BACK BUTTON
	
	 @FXML
	    private TextArea ChaosText;
	    
	 @FXML
	 	private Pane BG;
	 
	 @FXML
	    void BackPressed(ActionEvent event) {
	    	Main.set_pane(9);
	    }
}
