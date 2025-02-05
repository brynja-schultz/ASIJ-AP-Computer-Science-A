public class RobotDemo
{
   public static void main(String[] args)
   {
      Robot robbie = new Robot(2, 3);
      robbie.moveRight();
      robbie.moveDown();
      
      System.out.println("Expeceted x: 3 y: 4");
      System.out.println("Robbie's x:" + robbie.getX() + " y:" + robbie.getY());
      
      robbie.moveVertical(6);
      System.out.println("Expected y : 10");
      System.out.println("Robbie's y :" + robbie.getY());
      robbie.moveVertical(-4);
      System.out.println("Expected y: 6");
      System.out.println("Robbie's y :" + robbie.getY());
      
      
      Robot janice = new Robot(3,6);
      janice.moveHorizontal(5);
      janice.moveHorizontal(-3);
      //** janice.moveHorizontal(-3); makes it move off canvas **//
      
      Robot roberto = new Robot(3, 9);
      roberto.moveHorizontal(5);
      roberto.moveVertical(5);
      
      // moves roberto back to og position
      roberto.moveHorizontal(-5);
      roberto.moveVertical(-5);
      
      Robot fredrick = new Robot (1,1);
      //System.out.println("Expected x: 1 y: 1");
      //System.out.println("Fredrick's x:" + fredrick.getX() + " y:" + fredrick.getY());
      fredrick.moveHorizontal(5);
      //System.out.println("Expected x: 6 y: 1");
      //System.out.println("Fredrick's x:" + fredrick.getX() + " y:" + fredrick.getY());
      fredrick.moveHorizontal(-3);
      //System.out.println("Expected x: 3 y: 1");
      //System.out.println("Fredrick's x:" + fredrick.getX() + " y:" + fredrick.getY());
   }
   
}