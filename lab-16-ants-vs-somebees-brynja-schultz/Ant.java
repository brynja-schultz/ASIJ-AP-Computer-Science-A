/**
 * A class representing a basic Ant
 * 
 * @author brynja
 */
public abstract class Ant extends Insect
{
	private int foodCost; //the amount of food needed to make this ant
	
	/**
	 * Creates a new Ant, with a food cost of 0.
	 * @param armor The armor of the ant.
	 */
    
   public boolean block;
   
	public Ant(int armor)
	{
		super(armor, null);
		this.foodCost = 0;
      this.block = true;
	}
   
   public Ant (int arm, int food)
   {
      super(arm, null);
      this.foodCost = food;
      this.block=true;
      
   }
	/**
	 * Returns the ant's food cost
	 * @return the ant's good cost
	 */
	
   public int getFoodCost()
	{
		return foodCost;
	}
	
	/**
	 * Removes the ant from its current place
	 */
	public void leavePlace()
	{
		this.getPlace().removeInsect(this);
	}	


    public boolean getBlock(){
      return block;
     }

   public void setBlock (boolean block){
      this.block = block;
   }
}
