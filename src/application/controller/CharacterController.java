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
import application.model.Characters;

/**
 * @author Christopher Ackerley kfx631
 *
 */

public class CharacterController {

	private ArrayList<Characters> characterList;
	private String charFileLocation;
	private int i = 0;
	
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
    
    
	
    /*
    public void initialize(String newFileLocation) throws IOException
    {
    	this.characterList = new ArrayList<>();
    	this.charFileLocation = newFileLocation;
    	try(BufferedReader br = new BufferedReader(new FileReader(newFileLocation)))
    	{
    		String bufferLine;
    		while ((bufferLine = br.readLine()) != null)
    		{
    			String[] readLine = bufferLine.split(",");
				Characters character = new Characters(Arrays.asList(readLine));
				characterList.add(character);
    		}
    	}
    	catch (IOException e)
    	{
    		e.printStackTrace();
    	}
    	
    	File file = new File(characterList.get(i).getImageLocation());
        Image image = new Image(file.toURI().toString());
        charImage.setImage(image);
        charDescription.setText(characterList.get(i).getDescription());
        charName.setText(characterList.get(i).getName());

    	
    }
    */
    
    @FXML
    void BackPressed(ActionEvent event) {
    	Main.set_pane(0);
    }
    
    @FXML
    void NextPressed(ActionEvent event) {
    	/*
    	i++;
    	if(i >= characterList.size())
    	{
    		this.i = 0;
    	}
  
    	File file = new File(characterList.get(i).getImageLocation());
        Image image = new Image(file.toURI().toString());
        charImage.setImage(image);
        charDescription.setText(characterList.get(i).getDescription());
        charName.setText(characterList.get(i).getName());
        */
    	Main.set_pane(11);
    }
    
    @FXML
    void PreviousPressed(ActionEvent event) {
    	/*
    	i--;
    	if(i < 0)
    	{
    		this.i = characterList.size() - 1;
    	}
  
    	File file = new File(characterList.get(i).getImageLocation());
        Image image = new Image(file.toURI().toString());
        charImage.setImage(image);
        charDescription.setText(characterList.get(i).getDescription());
        charName.setText(characterList.get(i).getName());
        */
    	Main.set_pane(54);
    }

}