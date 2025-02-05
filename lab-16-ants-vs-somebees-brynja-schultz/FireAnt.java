public class FireAnt extends Ant{
   private int damage = 3;
   
   public FireAnt(){
      super(4,1);
   }
   
   public void action(AntColony colony){
      Bee[] beeList = getPlace().getBees();
      if(this.getArmor()==0){
         for(int i = 0; i< beeList.length; i++){
            beeList[i].reduceArmor(damage);
         }  
      }
   }
   
   public Bee getTarget(){
      return getPlace().getClosestBee(0,0);
   }
   
   public void reduceArmor(int amount){
      Bee target = getTarget();
      damage-= amount;
      if(damage==0){
         System.out.println(this + "ran out of armor & expired");
         leavePlace();
         target.reduceArmor(3);
      }  
   }
}