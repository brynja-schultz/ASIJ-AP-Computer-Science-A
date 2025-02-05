public class RandomWalkTest
{
   public static void main(String[] args)
    {
      Picture vacuum = new Picture("large_roomba.png");
      
      double distance = 5;
      
      vacuum.translate(200,200);
      vacuum.draw();
      
      for (int i = 1; i <= 3000; i++)
      {

         double angle = Math.toRadians(Math.random()* 360);
         double dx = distance * Math.cos(angle);
         double dy = distance * Math.sin(angle);
         vacuum.translate(dx, dy);
         //vacuum.draw(); 
         //System.out.println(vacuum.getWidth());
         Ellipse outline = new Ellipse(vacuum.getX()+(vacuum.getWidth()/2), vacuum.getY() -(vacuum.getHeight()/2), 10, 10);
         outline.fill();
       } 
    }
}