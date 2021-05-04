package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import application.Main;

/**
 * @author Christopher Ackerley kfx631
 *
 */

public class DiamondController {

	
	@FXML
    private Button BackButton;
    
    @FXML
    private Button NextButton;
    
    @FXML
    private Button PreviousButton;
    
    @FXML
    private ImageView itemImage;
    
    @FXML
    private TextArea itemDescription;
    
    @FXML
    private Text itemName;
    	

    
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }
    
    @FXML
    void NextPressed(ActionEvent event) {
    	Main.set_pane(27);
    }
    
    @FXML
    void PreviousPressed(ActionEvent event) {
    	
    	Main.set_pane(25);
    }

}