public class Deal
{
	//instance variables
	private int prizeLoc;
	private int userGuess;
   private int newGuess;
   private int view;
	
	//constructor
	public Deal()
	{
      //remove comments below after you have created the methods
		setPrizeLoc();
		setUserGuess();
      setNewGuess();
	}
	
	//modifier method for userGuess (should call random number method)
	
   public void setUserGuess()
   {
      userGuess = randomNumber();
   }
	
	//modifier method for prizeLoc (should call random number method)
    public void setPrizeLoc()
    {
      prizeLoc = randomNumber();
    
    }
   
   //modifier method for newGuess 
	public void setNewGuess()
   {
      newGuess = updateGuess();
   }
	
   
	//accessor method for userGuess
	public int getUserGuess()
   {
      return userGuess;
   }

	
	//accessor method for prizeLoc
   public int getPrizeLoc()
   {
      return prizeLoc;
   }
   
   
   //accessor method for newGuess
	public int getNewGuess()
   {
      return newGuess;
   }
	
   
	//method to generate random number between 1 & 3
   //do you think this method can/should be static?
	public int randomNumber()
   {
        int random = (int) (Math.random() * 3 + 1);
        return random;
   }
	
   
	//method to reveal the door - there are a few approaches to this method
                                 //test your solution to make sure it reveals
                                 //the correct door for each scenario
    public int revealDoor()
    {
      view = randomNumber();
      while (view == userGuess || view == prizeLoc)
      {
            view = randomNumber();
            //System.out.print("revealDoor");
      } 
      return view; 
    }
	
   
	
	//method to update user's guess - this is different than the modifier 
                                    //for newGuess because it contains a 
                                    //set of conditions to determine what 
                                    //the new guess is
    public int updateGuess()
    {
      newGuess = randomNumber();
      while (newGuess == userGuess || newGuess == view)
         {
         newGuess = randomNumber();
         //System.out.print("updateGuess");
         }
      return newGuess;
    }
	
   
	
	//toString method
	public String toString()
	{
		return prizeLoc + "" + userGuess + view + newGuess ;
	}
}