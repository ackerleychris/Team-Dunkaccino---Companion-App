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

/**
 * @author David Kent & Christopher Ackerley
 *
 */

public class Items
{
	private String name;
	private String imageLocation;
	private String description;
	private String type;
	private ArrayList<Items> Item;
	
	public Items(String name, String imageLocation, String description, String type)
	{
		this.name = name;
		this.imageLocation = imageLocation;
		this.description = description;
		this.type = type;
		Item = new ArrayList<Items>();
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
	
	/**
	 * String name setter.
	 * @author David Kent
	 * @return nothing
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * String image location getter.
	 * @author David Kent
	 * @return location of image as string
	 */
	
	public String getImageLocation()
	{
		return this.imageLocation;
	}
	
	/**
	 * String image location setter.
	 * @author David Kent
	 * @return nothing
	 */
	public void setImageLocation(String imageLocation)
	{
		this.imageLocation = imageLocation;
	}
	
	/**
	 * String description getter.
	 * @author David Kent
	 * @return description as string
	 */
	
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * String description setter.
	 * @author David Kent
	 * @return nothing
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * String typer getter.
	 * @author David Kent
	 * @return type as string
	 */
	
	public String getType()
	{
		return this.type;
	}
	
	/**
	 * String type setter
	 * @author David Kent
	 * @return nothing
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
}
