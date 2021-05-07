package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import application.Main;

/**
 * @author Zachary Bowman
 *
 */

public class StoryController {

	
    @FXML
    private Pane BG;
    

    @FXML
    private TextArea StoryText;

    @FXML
    private Button BackButton;

    
    /**
     * 
     * This Function relates to the button BackButton, which can be -clicked- to return to the Main Menu (Main.fxml)
     * @param ActionEvent event - occurs when the element is interacted with by the user on button press
     */
    
    @FXML
    void BackPressed(ActionEvent event) {

    	Main.set_pane(0);
    }
    
    
}
