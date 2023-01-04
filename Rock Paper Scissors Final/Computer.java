//(c) A+ Computer Science 
//www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
		randomSetChoice();
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		//use Math.random()
		//use switch case
		int ch = (int)Math.floor(Math.random() * (3 - 1 + 1) + 1);
		if (ch == 1) {
			choice = "Rock";
		}
		else if (ch == 2) {
			choice = "Paper";
		}
		else { choice = "Scissors"; }
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{
		if (p.getChoice().toLowerCase().equals(choice.toLowerCase())) {
			return 0;
		}
		else if ((p.getChoice().toLowerCase().equals("rock") && choice.toLowerCase().equals("paper")) || (p.getChoice().toLowerCase().equals("paper") && choice.toLowerCase().equals("scissors")) || (p.getChoice().toLowerCase().equals("scissors") && choice.toLowerCase().equals("rock"))) {
			return 1;
		}

		return -1;		
	}
	
	public String toString()
	{
		return choice;
	}		   
}