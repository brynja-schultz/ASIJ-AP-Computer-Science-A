import java.util.Scanner;


public class DigitSortRunner{


   public static void main (String[] args){
      DigitSort sorted = new DigitSort();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Please input an integer to be sorted: ");
      int number = scan.nextInt();
      System.out.println("Part (a) Output: " + sorted.sortDigits(number));
      System.out.println("Part (b) Output: " + sorted.sortOddEvenDigits(number));
      
         
      
    
   }

}
