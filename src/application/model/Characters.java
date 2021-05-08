package application.model;

import java.util.*;

/*
 * This class contains unused code in the final product.  These methods were used in a previous iteration of the project.
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
