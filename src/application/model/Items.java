package application.model;

import java.util.*;

/*
 * Contains the necessary constructor, getters and setters for all items used by the main
 * character including infernal arms, artifacts, and keepsakes to be loaded in respective
 * windows.
 * 
 * Each item must contain a String name, String picture location, String Item Description,
 * char/string type (to be called for unique pages), and possibly other undetermined data.
 * 
 * Constructor will need to take in either an arraylist or String array from Data.java.
 * 
 * IF YOU MAKE A FUNCTION, JAVADOC IT WITH YOUR NAME AS AUTHOR
 * IF YOU MODIFY A FUNCTION, GREEN COMMENT WHAT YOU CHANGED AND 
 * 		ADD YOUR NAME TO THE JAVADOC AUTHOR
 * 
 */
public class Items
{
	private String name;
	private String imageLocation;
	private String description;
	private String type;
	
	public Items(ArrayList<String> newItem)
	{
		
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * String name getter. Returns the name variable.
	 * @author Christopher Ackerley
	 * @return String name
	 */
	public String getName()
	{
		return this.name;
	}
}
