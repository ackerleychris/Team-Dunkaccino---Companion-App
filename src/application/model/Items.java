package application.model;

import java.util.*;

/*
 * This class contains unused code in the final product.  These methods were used in a previous iteration of the project.
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
