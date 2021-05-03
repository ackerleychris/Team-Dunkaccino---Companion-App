package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


/*
 * AUTHOR: DAVID KENT
 */



public class WeaponsController 
{
	 @FXML
	    private Button BackButton; //BACK BUTTON
	 @FXML
	    private Button SBButton; //STYGIAN BLADE
	 @FXML
	    private Button ESButton; //ETERNAL SPEAR
	 @FXML
	    private Button SOCButton; //SHIELD OF CHAOS
	 @FXML
	    private Button HSBButton; //HEART SEEKING BOW
	 @FXML
	    private Button TFButton; //TWIN FISTS
	 @FXML
	    private Button ARButton; //ADAMANT RAIL
	
	
	
	
	
	 @FXML
	    void BackPressed(ActionEvent event) {
	    	Main.set_pane(0); //sets pane back to initial
	    }
	 @FXML
	    void SBPressed(ActionEvent event) {
	    	Main.set_pane(10); 
	    }
	 @FXML
	    void ESPressed(ActionEvent event) {
	    	Main.set_pane(11);
	    }
	 @FXML
	    void SOCPressed(ActionEvent event) {
	    	Main.set_pane(12);
	    }
	 @FXML
	    void HSBPressed(ActionEvent event) {
	    	Main.set_pane(13);
	    }
	 @FXML
	    void TFPressed(ActionEvent event) {
	    	Main.set_pane(14);
	    }
	 @FXML
	    void ARPressed(ActionEvent event) {
	    	Main.set_pane(15);
	    }
}
