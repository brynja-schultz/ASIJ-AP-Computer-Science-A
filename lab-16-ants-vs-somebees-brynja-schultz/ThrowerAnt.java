
/**
 * An ant who throws leaves at bees
 * @author YOUR NAME HERE
 */
public class ThrowerAnt extends Ant
{
	private int damage;
   private int food = 4;
   private int armor = 1;
	
	/**
	 * Creates a new Thrower Ant.
	 * Armor: 1, Food: 0, Damage: 1
	 */
	public ThrowerAnt()
	{
		super(1);
		this.damage = 1;
	}
	public ThrowerAnt(int armor, int food)
   {
      super(armor, food);
   }
	/**
	 * Returns a target for this ant
	 * @return A bee to target
	 */
	public Bee getTarget()
	{
		return getPlace().getClosestBee(0,3);
	}
	
	public void action(AntColony colony)
	{
		Bee target = getTarget();
		if(target != null)
		{
			target.reduceArmor(this.damage);
		}
	}
   
   public void setFoodCost(int food){
      super.setFoodCost(food);
   }
   
}
