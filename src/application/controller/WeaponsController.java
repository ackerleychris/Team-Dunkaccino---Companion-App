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
	
	
	 /**
	  * this function "BackPressed" takes the user back to the main window (main.fxml) when it is clicked, relating to the "BackButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void BackPressed(ActionEvent event) {
	    	Main.set_pane(0); 
	    }
	 
	 /**
	  * this function "SBPressed" takes the user forward to the Stygian Blade weapons page(StygianBlade.fxml) when it is clicked, relating to the "SBButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void SBPressed(ActionEvent event) {
	    	Main.set_pane(29); 
	    }
	 
	 /**
	  * this function "ESPressed" takes the user forward to the Eternal Spear weapons page(EternalSpear.fxml) when it is clicked, relating to the "ESButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void ESPressed(ActionEvent event) {
	    	Main.set_pane(30);
	    }
	 
	 /**
	  * this function "SOCPressed" takes the user forward to the Shield Of Chaos weapons page(ShieldOfChaos.fxml.fxml) when it is clicked, relating to the "SOCButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void SOCPressed(ActionEvent event) {
	    	Main.set_pane(31);
	    }
	 
	 /**
	  * this function "HSBPressed" takes the user forward to the Heart-Seeking Bow weapons page(HeartSeekingBow.fxml) when it is clicked, relating to the "HSBButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void HSBPressed(ActionEvent event) {
	    	Main.set_pane(32);
	    }
	 
	 /**
	  * this function "TFPressed" takes the user forward to the Twin Fists of Malphon weapons page(TwinFists.fxml) when it is clicked, relating to the "TFButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void TFPressed(ActionEvent event) {
	    	Main.set_pane(33);
	    }
	 
	 /**
	  * this function "ARPressed" takes the user forward to the Adamant Rail weapons page(AdamantRail.fxml) when it is clicked, relating to the "ARButton"
	  * @param ActionEvent event - occurs when the element is interacted with by the user on button press
	  */
	 @FXML
	    void ARPressed(ActionEvent event) {
	    	Main.set_pane(34);
	    }
}