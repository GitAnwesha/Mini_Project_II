package Model;

public class Person
{
	protected String name ;
	protected Height height ;
	protected int weight ;
	protected String homeTown ;
	protected String highSchool ;
	
	//Default Constructor of Person class
	
	public Person()
	{
		name="";
		height=new Height();
		weight=0;
		homeTown="";
		highSchool="";
	}
	
	//Parameterized Constructor for Person class
	
	public Person(String name, Height height, int weight, String homeTown, String highSchool)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.homeTown = homeTown;
		this.highSchool = highSchool;
	}

	/*
	 * Getters and Setters
	 */
	 
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Height getHeight()
	{
		return height;
	}

	public void setHeight(Height height)
	{
		this.height = height;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public String getHomeTown()
	{
		return homeTown;
	}

	public void setHomeTown(String homeTown)
	{
		this.homeTown = homeTown;
	}

	public String getHighSchool()
	{
		return highSchool;
	}

	public void setHighSchool(String highSchool)
	{
		this.highSchool = highSchool;
	}

	@Override
	public String toString()
	{
		return "name=" + name + ", height=" + height + ", weight=" + weight + ", homeTown=" + homeTown
				+ ", highSchool=" + highSchool;
	}
}
