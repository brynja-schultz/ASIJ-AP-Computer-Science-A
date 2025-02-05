public class ScubaThrowerAnt extends Ant{

   private int damage;
   
   public ScubaThrowerAnt(){
      super(4,1);
      this.damage = 1;
      setWaterSafe(true);
   }
   
   public Bee getTarget(){
      return getPlace().getClosestBee(0,3);
   }
   
   public void action(AntColony colony){
      Bee target = getTarget();
      if(target != null){
         target.reduceArmor(this.damage);
      }
   }

}