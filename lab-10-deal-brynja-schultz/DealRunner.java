import java.util.Scanner;


public class DealRunner
{
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner scan = new Scanner(System.in);
      
		
		//prompt the user for the number of simulations to run
		
		System.out.print("Enter many times you want to play: ");
      
		//assign input to variable
		int runs = scan.nextInt();
     
      //System.out.println(runs);
		
		//declare variables to store stopping condition for loop, prize loc, user guess,
		  //door revealed, the new guess, and wins by changing
		
		
      int prizeLoc;
      int userGuess;
      int doorRevealed;
      int newGuess ;
      int winsChanging = 0;
      
		//loop through the number of simulations
		for (int i = 0; i < runs; i++)
		{
      
			//instantiate a Deal object inside the loop
			Deal deal = new Deal();
			
         
			//get the user's guess and assign to a variable 
         userGuess = deal.getUserGuess();
         //System.out.println(userGuess);
         
			//get the prize location and assign to a variable
			prizeLoc = deal.getPrizeLoc();
         //System.out.println(prizeLoc);
			
			//get the door which is revealed and assign to a variable
         doorRevealed = deal.revealDoor();
         //System.out.println(doorRevealed);
			
			//get the new guess and assign to a variable
			
			deal.setNewGuess();
         newGuess = deal.getNewGuess();
         //System.out.println(newGuess);
         
			//determine if the new guess matches the prize location
			
         if (newGuess == prizeLoc)
         {
            winsChanging ++;   
         }      
         System.out.println( "prize: " + prizeLoc + " guess: " + userGuess + " view: " + doorRevealed + " new guess: " + newGuess); 
 
         
			
			//increment the win count by changing
				
				
				
			//output the variables for each simulation
			
		}	
		
		//output the probability of winning/not winning by switching
      double switchProb = (winsChanging)/(double)runs;
      double noSwitch = 1- switchProb; 
		System.out.println("Probability of winning if you switch = " + switchProb);
      System.out.println("Probability of winning if you don't switch = " + noSwitch);
		
	}
}