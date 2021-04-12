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
 * 
 * 
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

    @FXML
    void BackPressed(ActionEvent event) {

    	Main.set_pane(0);
    }
    
    
}
