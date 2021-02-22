package Model;

public class Model
{
	//Declaring three objects of FootballPlayer class
	
	
		FootballPlayer f1;
		FootballPlayer f2;
		FootballPlayer f3;
		
		//Default constructor of Model class 
		
		public Model()
		{
			/*
			 Creating objects of FootballPlayer class using the parameterized constructor		 
			 */
				
			f1 = new FootballPlayer(9,"Defence","Anwesha",new Height(5,4),54,"Kolkata","NGHSS");
			f2 = new FootballPlayer(10,"Priti","Goalkeeper",new Height(6,4),58,"Delhi","ABCS");
			f3 = new FootballPlayer(11,"Ronaldino","Forward",new Height(5,3),65,"Pune","XYZ");
			
			//Creating object for OffensiveLine
			OffensiveLine offensive= new OffensiveLine(f1,f2,f3);
			
			//Calling averageWeight() method to get the average
			System.out.println(offensive.averageWeight()+ " is the average weight.");
			System.out.println(offensive.toString());
			
		}
}