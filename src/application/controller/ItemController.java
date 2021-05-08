package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import application.Main;
import application.model.Items;

/**
 * @author Christopher Ackerley kfx631
 *Contains means to update values dynamically, though i have been unable to get them to work.  Tend to get null exception errors when executing.
 *Resorted to static data allocation.  Yay 500 fxml files.
 */

public class ItemController {

	/*
	private ArrayList<Items> itemList;
	private String itemFileLocation;
	private int i = 0;
	*/
	
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
     * @param ActionEvent event - on button press, this event will set the pane to the next character in line (20)
     */
    @FXML
    void NextPressed(ActionEvent event) {
    	Main.set_pane(20);
    }
    
    /**
     * 
     * @param ActionEvent event - on button press, this event will set the pane to the previous character in line (28)
     */
    @FXML
    void PreviousPressed(ActionEvent event) {
    	Main.set_pane(28);
    }

}