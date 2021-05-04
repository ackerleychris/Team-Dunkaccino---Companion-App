package application.controller;
import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
 * @author Zachary Bowman & Christopher Ackerley & Andrew Mares & David Kent
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
    void CharacterPressed(ActionEvent event) throws IOException {
    	/*FXMLLoader loader = new FXMLLoader(getClass().getResource("Character.fxml"));
    	CharacterController newController = new CharacterController();
    	newController.initialize("src/data/characters/characters.csv");
    	loader.setController(newController);*/
    	Main.set_pane(4);
    }


    @FXML
    void ItemsPressed(ActionEvent event) {
    	/*FXMLLoader loader = new FXMLLoader(getClass().getResource("Item.fxml"));
    	ItemController newController = new CharacterController();
    	newController.initialize("src/data/characters/items.csv");
    	loader.setController(newController);*/
    	Main.set_pane(10);
    }
    
    @FXML
    void WeaponsPressed(ActionEvent event) {
    	Main.set_pane(9);
    	//Main.set_pane(X) replace X when this is added to the stack 
    }


    @FXML
    void ZonesPressed(ActionEvent event) {
    	Main.set_pane(2);
    }



	
	
	
	
	
	
	
	
}
