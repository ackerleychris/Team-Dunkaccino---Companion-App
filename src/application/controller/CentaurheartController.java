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

public class CentaurheartController {

	
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
    	

    /**
     * 
     * @param ActionEvent event - on button press, this event will return to the main menu pane (0)
     */
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }
    
    /**
     * 
     * @param ActionEvent event - on button press, this event will set the pane to the next character in line (22)
     */
    @FXML
    void NextPressed(ActionEvent event) {
    	Main.set_pane(22);
    }
    
    /**
     * 
     * @param ActionEvent event - on button press, this event will set the pane to the previous character in line (20)
     */
    @FXML
    void PreviousPressed(ActionEvent event) {
    	
    	Main.set_pane(20);
    }

}