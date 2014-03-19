package database.model;

import java.util.ArrayList;

public class GraveMarker 
{
	private ArrayList<Person> gravePersonList;
	private
	//type of marker - String
	//picture - 
	//location
	//people < >
	//information
	//isRreadable -
	//constructor
	//get/set
	
	public String toString()
	{
		String graveInfo = "";
		
		for(Person current : gravePersonList)
		{
			graveInfo += current + " is buried here. \n";
		}
		if(isReadable)
		{
			graveInfo += "This grave is readable";
		}
		else
		{
			graveInfo += "This grave is NOT readable";
		}
		
		return graveInfo;
	}

}
