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

public class Characters
{
	private String name;
	private String imageLocation;
	private String description;
	private String type;
	
	public Characters(ArrayList<String> newCharacter)
	{
		
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
