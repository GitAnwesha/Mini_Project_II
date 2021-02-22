package Model;

public class FootballPlayer extends Person
{
	private int number;
	private String position;
	
	//Default Constructor of FootballPlayer class
	
	public FootballPlayer()
	{
		super();
		number=0;
		position="";
	}
	
	//Parameterized Constructor of FootballPlayer class
	
	public FootballPlayer(int number, String position,String name, Height height, int weight, String homeTown, String highSchool)
	{
		super(name,height,weight,homeTown,highSchool);
		this.number = number;
		this.position = position;
	}
	
	/*
	 * Getters and Setters
	 */
	
	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}	
	
	@Override
	public String toString()
	{
		return "number=" + number + ", position=" + position + super.toString();
	}
}
