import java.util.Scanner;


public class EditorRunner
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter picture name you would like to edit: ");
      String file = scan.next();
      
      Picture im = new Picture(file);
      Editor E = new Editor();

      int choice = 0;
      while(choice != 7)
      {
         System.out.print("Select command (1, 2, 3, 4, 5, 6, 7): " );
         choice = scan.nextInt();
         if(choice == 1){
            im = E.grow(im);
         }
         
         if(choice == 2){
            E.grayscale(im);
         }
         
         if(choice == 3){
            E.invert(im);
         }
         
         if(choice == 4){
            im = E.rotateLeft(im);
         }
         
         if(choice == 5){
            E.medianFilter(im);
         }
         
         im.save("test.jpg");
         
         if(choice == 6){
            im.show();
         }
        
         }
      }
}

