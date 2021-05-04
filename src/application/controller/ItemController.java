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
    
    
	
    /*
    public void initialize(String newFileLocation) throws IOException
    {
    	
    	this.itemList = new ArrayList<>();
    	this.itemFileLocation = newFileLocation;
    	try(BufferedReader br = new BufferedReader(new FileReader(newFileLocation)))
    	{
    		String bufferLine;
    		while ((bufferLine = br.readLine()) != null)
    		{
    			String[] readLine = bufferLine.split(",");
				Items item = new Items(Arrays.asList(readLine));
				itemList.add(item);
    		}
    	}
    	catch (IOException e)
    	{
    		e.printStackTrace();
    	}
    	
    	File file = new File(itemList.get(i).getImageLocation());
        Image image = new Image(file.toURI().toString());
        charImage.setImage(image);
        charDescription.setText(itemList.get(i).getDescription());
        charName.setText(itemList.get(i).getName());
    	
    	
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
    	if(i >= itemList.size())
    	{
    		this.i = 0;
    	}
  
    	File file = new File(itemList.get(i).getImageLocation());
        Image image = new Image(file.toURI().toString());
        charImage.setImage(image);
        charDescription.setText(itemList.get(i).getDescription());
        charName.setText(itemList.get(i).getName());
        */
    	Main.set_pane(20);
    }
    
    @FXML
    void PreviousPressed(ActionEvent event) {
    	/*
    	i--;
    	if(i < 0)
    	{
    		this.i = itemList.size() - 1;
    	}
  
    	File file = new File(itemList.get(i).getImageLocation());
        Image image = new Image(file.toURI().toString());
        charImage.setImage(image);
        charDescription.setText(itemList.get(i).getDescription());
        charName.setText(itemList.get(i).getName());
        */
    	Main.set_pane(28);
    }

}