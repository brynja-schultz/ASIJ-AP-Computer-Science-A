import java.util.Scanner;
public class GallonsWasted
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int dripsPerGallon = 15140;
      double dripsPerMinute;
      int numOfDays;
      System.out.print("Enter faucet drips per minute: ");
      dripsPerMinute = scan.nextDouble();
      System.out.print("Enter number of days: ");
      numOfDays = scan.nextInt();
      System.out.println("A faucet with " + dripsPerMinute + " per minute over " + numOfDays + " will waste " + ((dripsPerMinute * 60 * 24 * numOfDays) / dripsPerGallon) + " gallons of water.");
   }
}