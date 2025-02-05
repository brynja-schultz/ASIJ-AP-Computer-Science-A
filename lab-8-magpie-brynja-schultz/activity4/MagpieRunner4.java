import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 */
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
      
      String statement = "I want to build a robot.";
      System.out.println("Statement: " + statement);
      System.out.println("Response: " + maggie.getResponse(statement));
      
      String statement2 = "I want to understand French.";
      System.out.println("Statement: " + statement2);
      System.out.println("Response: " + maggie.getResponse(statement2));
      
      String statement3 = "Do you like me?";
      System.out.println("Statement: " + statement3);
      System.out.println("Response: " + maggie.getResponse(statement3));
      
      String statement4 = "You confuse me.";
      System.out.println("Statement: " + statement4);
      System.out.println("Response: " + maggie.getResponse(statement4));
      
      String statement5 = "I want fried chicken.";
      System.out.println("Statement: " + statement5);
      System.out.println("Response: " + maggie.getResponse(statement5));
      
      
      String statement6 = "I like you.";
      System.out.println("Statement: " + statement6);
      System.out.println("Response: " + maggie.getResponse(statement6));




   }
}
