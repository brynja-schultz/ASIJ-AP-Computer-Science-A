import java.awt.Color;

public class Editor
{
   private double[] image;

   public Picture grow( Picture p)
   {
      Picture im = new Picture (p.width()*2, p.height()*2);
      for(int x = 0; x < p.width(); x++){
         for(int y=0; y < p.height(); y++){
            im.set(x*2, y*2, p.get(x,y));
            im.set((x*2)+1, (y*2) +1 , p.get(x,y));
            im.set((x*2)+1, (y*2) , p.get(x,y));
            im.set((x*2), (y*2) +1 , p.get(x,y));
      
         }
      }
      p = im; 
      return p;
   }
   
   public Picture grayscale( Picture p)
   {
      for(int x = 0; x < p.width(); x++){
         for(int y=0; y < p.height(); y++){
            Color px = p.get(x,y);
            double grey = 0.3 * px.getRed() + 0.11 * px.getBlue() + 0.59 *px.getGreen();
            if(grey > 255){
               grey = 255;
            }
            int newgrey = (int)grey;
            Color G = new Color(newgrey, newgrey, newgrey);
            p.set(x,y,G);
         }
      }
      return p;
   }
   
   
   public Picture invert( Picture p)
   {
      for(int x = 0; x < p.width(); x++){
         for(int y=0; y < p.height(); y++){
            Color px = p.get(x,y);
            int red =  255 - px.getRed();
            int blue = 255 - px.getBlue();
            int green = 255 - px.getGreen();
            
            
            Color G = new Color(red, blue, green);
            p.set(x,y,G);
            }
            }
      return p;
     
   }
   
   public Picture rotateLeft( Picture p)
   {
      Picture im = new Picture (p.height(), p.width());
      for(int x = 0; x < p.width(); x++){
         for(int y=0; y < p.height(); y++){
            im.set(y, p.height()-x-1, p.get(x,y));
         }
      } 
      p = im;  
      return p;
   }
   
   public int[] add(int[] acc, Color px){
      acc[0] += px.getRed();
      acc[1] += px.getGreen();
      acc[2] += px.getBlue();
      return acc; 
   }
   
   public Picture medianFilter( Picture p)
   {
      Picture im = new Picture(p.width(), p.height());
      for(int x = 0; x < p.width(); x++){
         for(int y=0; y < p.height(); y++){
            
            int[] avgPx = {0,0,0};
           
            avgPx = this.add(avgPx, p.get(x,y));
            int count = 1;
            if (x > 0){
               avgPx = this.add(avgPx, p.get(x-1,y));
               count += 1; 
            }
            
            if (x < p.width() -1){
               avgPx = this.add(avgPx, p.get(x+1,y));
               count += 1; 
            }
            
            if (y > 0){
               avgPx = this.add(avgPx, p.get(x,y-1));
               count += 1; 
            }
            
            if (y < p.height() -1){
               avgPx = this.add(avgPx, p.get(x,y+1));
               count += 1; 
            }
      
            for (int i = 0 ; i < 3; i ++)
            {
               avgPx[i] = (int)(avgPx[i]/count);
            }
 
            Color G = new Color(avgPx[0],avgPx[1],avgPx[2]);
            im.set(x,y,G);
         }
       }
      p = im;
      return p;
   }
   
}