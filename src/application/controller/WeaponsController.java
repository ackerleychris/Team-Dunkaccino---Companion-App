package application.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
/*
 * AUTHOR: DAVID KENT
 */


import application.Main;
import javafx.event.ActionEvent;

/*
 * author: David Kent keg229
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
	    	Main.set_pane(29); 
	    }
	 @FXML
	    void ESPressed(ActionEvent event) {
	    	Main.set_pane(30);
	    }
	 @FXML
	    void SOCPressed(ActionEvent event) {
	    	Main.set_pane(31);
	    }
	 @FXML
	    void HSBPressed(ActionEvent event) {
	    	Main.set_pane(32);
	    }
	 @FXML
	    void TFPressed(ActionEvent event) {
	    	Main.set_pane(33);
	    }
	 @FXML
	    void ARPressed(ActionEvent event) {
	    	Main.set_pane(34);
	    }
}