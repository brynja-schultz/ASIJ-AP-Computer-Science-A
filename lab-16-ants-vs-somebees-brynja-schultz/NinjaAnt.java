public class NinjaAnt extends Ant{
   private int damage;
   
   public NinjaAnt(){
      super(6,1);
      this.damage=1;
      setWaterSafe(false);
      setBlock(false);
   }
   
   public Bee getTarget(){
      return getPlace().getClosestBee(0,0);
   }
   
   public void action(AntColony colony){
      Bee target = getTarget();
      if(target != null){
         target.reduceArmor(this.damage);
      }
   }
}