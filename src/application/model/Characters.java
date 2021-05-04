package application.model;

import java.util.*;

/*
 * Contains the necessary constructor, getters and setters for all characters.
 * 
 * Each character must have a String name, String imageLocation, String description,
 * String type (friend, enemy), and possibly other data to be determined.
 * 
 * Constructor will need to take in either an arraylist or String array from Data.java.
 * 
 * IF YOU MAKE A FUNCTION, JAVADOC IT WITH YOUR NAME AS AUTHOR
 * IF YOU MODIFY A FUNCTION, GREEN COMMENT WHAT YOU CHANGED AND 
 * 		ADD YOUR NAME TO THE JAVADOC AUTHOR.
 * 
 */
/**
 * @author Andrew Mares
 *
 */

public class Characters
{
	private String name;
	private String imageLocation;
	private String description;
	
	public Characters(List<String> asList)
	{
		this.name = asList.get(0);
		this.imageLocation = asList.get(1);
		this.description = asList.get(2);
	}
	
	
	
	public String getImageLocation() {
		return imageLocation;
	}



	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
}
