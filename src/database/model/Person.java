package database.model;

public class Person 
{
	
	private String name;
	private String birthDate;
	private String deathDate;
	private boolean isMarried;
	private boolean hasChildren;
	private int age;
	
	public Person()
	{
		name = "";
		birthDate = "unknown";
		deathDate = "unknown";
		isMarried = false;
		hasChildren = false;
		age = -500;
	}
	
	public Person(String name, String deathDate)
	{
		this.name = name;
		this.deathDate = deathDate;
	}
	
	public String toString()
	{
		String personInfo = "";
		
		personInfo += "This is: " + name;
		personInfo += "; dies around: " + deathDate;
		personInfo += " at age: " + age;
		
		return personInfo;
	}

}
