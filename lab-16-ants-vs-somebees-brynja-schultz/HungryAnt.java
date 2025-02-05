public class HungryAnt extends Ant
{
   private int food = 4;
   private int armor = 1;
   private int digestion;
   private int damage;
   
   public HungryAnt(){
      super(4,1);
      this.damage=3;
   }
   
   public HungryAnt(int food, int armor){
      super(armor, food);
   }
   
   public Bee getTarget(){
      return getPlace().getClosestBee(0,0);
   }
   
   public void action(AntColony colony){
      Bee target = getTarget();
      if(target != null && digestion == 0){
         digestion = 3;
         target.reduceArmor(this.damage);
      }
      if(digestion > 0){
         digestion -=1;
      }
   }
}