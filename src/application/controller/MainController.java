package application.controller;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/*
 * Contains the functions needed to call each view window based on button action.
 * 
 * IF YOU MAKE A FUNCTION, JAVADOC IT WITH YOUR NAME AS AUTHOR
 * IF YOU MODIFY A FUNCTION, GREEN COMMENT WHAT YOU CHANGED AND 
 * 		ADD YOUR NAME TO THE JAVADOC AUTHOR
 * 
 */

/**
 * 
 * 
 * 
 * @author Zachary Bowman & Christopher Ackerley
 *
 */
public class MainController {

	
	

    @FXML
    private Button StoryButton;
	
    @FXML
    private Button ZonesButton;

    @FXML
    private Button CharacterButton;

    @FXML
    private Button ItemsButton;
    
    @FXML
    void StoryButtonPressed(ActionEvent event) {
    	Main.set_pane(1);
    	
    }
	
    @FXML
    void CharacterPressed(ActionEvent event) {
    	//Main.set_pane(X) replace X when this is added to the stack 
    }


    @FXML
    void ItemsPressed(ActionEvent event) {
    	//Main.set_pane(X) replace X when this is added to the stack 
    }


    @FXML
    void ZonesPressed(ActionEvent event) {
    	//Main.set_pane(X) replace X when this is added to the stack 
    }



	
	
	
	
	
	
	
	
}
