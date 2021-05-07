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
 * @author David Kent with some edits from Christopher Ackerley
 *
 */

public class Items
{
	private String name;
	private String imageLocation;
	private String description;
	
	public Items(List<String> asList)
	{
		this.name = asList.get(0);
		this.imageLocation = asList.get(1);
		this.description = asList.get(2);
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
	
	
	/**String name setter, returns nothing
	 * @author David Kent
	 * @param String Name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	/**String image location getter, Returns the imagelocation variable.
	 * @author David Kent
	 * @return String imagelocation
	 */
	public String getImageLocation()
	{
		return this.imageLocation;
	}
	
	
	/**String image location setter, returns nothing
	 * @author David Kent
	 * @param String image location
	 */
	public void setImageLocation(String imageLocation)
	{
		this.imageLocation = imageLocation;
	}
	
	
	/**String description getter, Returns the description variable.
	 * @author David Kent
	 * @return String description
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	
	/**String description setter, returns nothing
	 * @author David Kent
	 * @param String description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
}
