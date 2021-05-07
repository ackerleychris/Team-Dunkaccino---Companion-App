package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


/**
 * @author Zachary Bowman raq506
 *		
 */

public class ZoneSelectController {

    @FXML
    private Button HoHButton;
    
    @FXML
    private Button BackButton;
    
    @FXML
    private Button ElysiumButton;
    
    @FXML
    private Button TartarusButton;
    
    @FXML
    private Button AsphodelButton;   

    
    @FXML
    private Button GreeceButton;    
    
    
    /**
     * 
     * This Function relates to the button BackButton, which can be -clicked- to return to the Main Menu (Main.fxml)
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }

    
    /**
     * 
     * This Function relates to the button HoHButton, which can be -clicked- to go to HouseOfHades.fxml
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void HoHPressed(ActionEvent event) {

    	Main.set_pane(3);   	
    }
    
    
    /**
     * 
     * This Function relates to the button ElysiumButton, which can be -clicked- to go to Elysium.fxml
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void ElysiumPressed(ActionEvent event) {
    	Main.set_pane(7); 
    }
    
    
    
    /**
     * 
     * This Function relates to the button TartarusButton, which can be -clicked- to go to Tartarus.fxml
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void TartarusPressed(ActionEvent event) {
    	Main.set_pane(5); 
    }
    
    
    /**
     * 
     * This Function relates to the button AsphodelButton, which can be -clicked- to go to Asphodel.fxml
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void AsphodelPressed(ActionEvent event) {
    	Main.set_pane(6);
    } 
    

    
    
    /**
     * 
     * This Function relates to the button GreeceButton, which can be -clicked- to go to Greece.fxml
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    @FXML
    void GreecePressed(ActionEvent event) {
    	Main.set_pane(8);
    }    

}

