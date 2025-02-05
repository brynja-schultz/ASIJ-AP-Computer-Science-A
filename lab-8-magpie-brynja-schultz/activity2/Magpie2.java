/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
      //responds to first keyword in string
      //if keyword appears in another word-- it would go through if statement with keyword
      if (statement.length() == 0)
      {
         response = "Say something, please";
      }
      else if (statement.indexOf("no") >= 0 //&& !statement.equals(statement.trim()))
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
      else if (statement.indexOf("dog") >= 0
            || statement.indexOf("cat") >= 0)
      {
         response = "Tell me more about your pets.";
      }
      else if (statement.indexOf("Stephens") >= 0)
      {
         response = "He sounds like a good teacher.";
      }
      
      else if (statement.indexOf("human") >= 0
            || statement.indexOf("robot") >= 0)
      {
         response = "I am a chatbot. What are you?";
      }
      
      else if (statement.indexOf("hey") >= 0
            || statement.indexOf("hi") >= 0
            || statement.indexOf("hello") >= 0)
      {
         response = "Hello again. How are you?";
      }
      else if (statement.indexOf("bye") >= 0
            || statement.indexOf("goodbye") >= 0)
      {
         response = "Sad to see you go. Thanks for talking with me.";
      }

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	public String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
      
      else if (whichResponse == 4)
		{
			response = "I see.";
      }
      
      else if (whichResponse == 5)
		{
			response = "LOLLLLLL";
      }
      
      else if (whichResponse == 6)
		{
			response = "Tragic.";
      }
      
		return response;
	}
}
