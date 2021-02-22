package Model;

import java.util.ArrayList;

public class OffensiveLine
{
	private FootballPlayer center;
	private FootballPlayer offensiveGuard;
	private FootballPlayer offensiveTackle;
	private ArrayList<FootballPlayer> list= new ArrayList<FootballPlayer>();
	
	/**
	 * Default Constructor
	 */
	public OffensiveLine()
	{
		list.add(center);
		list.add(offensiveGuard);
		list.add(offensiveTackle);
	}

	/**
	 * Parameterized Constructor
	 */
	public OffensiveLine(FootballPlayer center, FootballPlayer offensiveGuard, FootballPlayer offensiveTackle)
	{
		list.add(center);
		list.add(offensiveGuard);
		list.add(offensiveTackle);
	}
	/*
	 * Getters and Setters
	 */

	public FootballPlayer getCenter()
	{
		return center;
	}

	public void setCenter(FootballPlayer center)
	{
		this.center = center;
	}

	public FootballPlayer getOffensiveGuard()
	{
		return offensiveGuard;
	}

	public void setOffensiveGuard(FootballPlayer offensiveGuard)
	{
		this.offensiveGuard = offensiveGuard;
	}

	public FootballPlayer getOffensiveTackle()
	{
		return offensiveTackle;
	}

	public void setOffensiveTackle(FootballPlayer offensiveTackle)
	{
		this.offensiveTackle = offensiveTackle;
	}

	public ArrayList<FootballPlayer> getList() 
	{
		return list;
	}

	public void setList(ArrayList<FootballPlayer> list)
	{
		this.list = list;
	}

	/*
	 * Method to calculate average weight of 3 players
	 */
   	public double averageWeight()
	{
		return (list.get(0).getWeight()+list.get(1).getWeight()+list.get(2).getWeight())/3.0;
	}

	@Override
	public String toString()
	{
		return list.get(0).toString()+"\n"+list.get(1).toString()+"\n"+list.get(2).toString();
	}
	
	
}