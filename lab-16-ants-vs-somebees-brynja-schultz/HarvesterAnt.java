/**
 * An Ant that harvests food
 * @author brynja
 */
public class HarvesterAnt extends Ant
{
	/**
	 * Creates a new Harvester Ant
	 */
   private int food = 2;
   private int armor = 1;
	
   public HarvesterAnt()
	{
		super(1);
	}
   
   public HarvesterAnt(int food, int armor)
   {
      super(armor, food);
   }
   
	public void action(AntColony colony)
	{
		//TODO: Should produce one additional food for the colony		
	   colony.increaseFood(1);
   }	
   
   public void setFoodCost(int food){
      super.setFoodCost(food);
   }
}

