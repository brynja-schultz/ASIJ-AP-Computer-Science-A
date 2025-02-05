import java.util.Scanner;

public class BeanCount
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      double length;
      double height;
      int jarSize;
      int avgJellyBeans;
      
      double pi = 3.14;
            
      System.out.print("Enter jelly bean length (cm): ");
      length = scan.nextDouble();
      
      System.out.print("Enter jelly bean height (cm): ");
      height = scan.nextDouble();
      
      System.out.print("Enter jar size (mL): ");
      jarSize = scan.nextInt();
      
      System.out.println("Estimate for number of jelly beans with average ");
      System.out.println("length: " + length + " cm");
      System.out.println("height: " + height + " cm");
      System.out.println("in a jar of size " + jarSize + " mL is");
      System.out.println( (int)((jarSize * .698)/(5 * pi * length * (height * height)/24))); 
      
   }
}