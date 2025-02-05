public class Robot
{
   private int xPos;
   private int yPos;
   private Picture pic;
  
   public Robot()
   {
      xPos = 0;
      yPos = 0;
      pic = new Picture("myrobot.jpeg");
      pic.draw();
      // no argument constructor
   }
   
   public Robot(int theX, int theY)
   {
      this.xPos = theX;
      this.yPos = theY;
      pic = new Picture("myrobot.jpeg");
      pic.draw();
      moveHorizontal(xPos);
      moveVertical(yPos);
      
            //pic.translate(pic.getX(), pic.getY());
      //initialization constructor
   }
   
   public int getX()
   {
      return (pic.getX()/pic.getWidth());
      
      // accessor method
   }
   
   public int getY()
   {   
      return (pic.getY()/pic.getHeight());
      
      //accesssor method
   }
  
   // Modifer Methods
   
   public void moveRight()
   {
       //xPos += pic.getWidth()
       xPos += 1;
       pic.translate(pic.getWidth(), yPos);
       //xPos += 1 * pic.getWidth();
   }
   
   public void moveDown()
   {
      //yPos += pic.getHeight();
      yPos += 1;
      pic.translate(xPos, pic.getHeight());
   }
   
   public void moveHorizontal(int units)
   {
       pic.translate(units * pic.getWidth(), yPos);
       xPos = units + xPos;
       
   }
   
   public void moveVertical (int units)
   {
      pic.translate(xPos, units * pic.getHeight());
      yPos = units + yPos;

   }
}