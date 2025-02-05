import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 */
public class MagpieRunner3
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
      Magpie3 maggie = new Magpie3();
      
      int position = maggie.findKeyword("I know nothing about snow plows.", "no", 0);
      System.out.println("The position of string you are searching for is: " + position);
	}

}
