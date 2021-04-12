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
    void StoryButtonPressed(ActionEvent event) {
    	Main.set_pane(1);
    	
    }
	




	
	
	
	
	
	
	
	
}
