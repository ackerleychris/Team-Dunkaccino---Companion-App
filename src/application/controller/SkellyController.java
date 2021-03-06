package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/*
 * author Andrew Mares yxi042
 */

public class SkellyController {
	@FXML
    private Button BackButton;
    
    @FXML
    private Button NextButton;
    
    @FXML
    private Button PreviousButton;
    
    @FXML
    private ImageView charImage;
    
    @FXML
    private TextArea charDescription;
    
    @FXML
    private Text charName;
    	
    
    
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }
    
    @FXML
    void NextPressed(ActionEvent event) {
    	Main.set_pane(53);
    }
    
    @FXML
    void PreviousPressed(ActionEvent event) {
    	Main.set_pane(51);
    }
}
