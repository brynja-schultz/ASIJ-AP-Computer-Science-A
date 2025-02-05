public class WallAnt extends Ant
{
   private int food = 4;
   private int armor = 4;
   
   public WallAnt()
   {
      super(4,4);
   }
   
   public WallAnt(int food, int armor){
      super(armor, food);
   }
   
   public void action(AntColony colony){
      
   }
}