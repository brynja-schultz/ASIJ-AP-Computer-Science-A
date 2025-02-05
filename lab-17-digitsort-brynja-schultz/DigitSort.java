import java.util.*;
public class DigitSort {

  /**
   * PART (a)
   *
   * Sorts the digits (in descending order) from the given number and returns
   * the new integer. You may not convert the given number into a string to
   * solve this problem!
   * @param number The integer to sort.
   *     Precondition: number is greater than 0.
   * @return The given number with its digits in descending order.
   */ 
  public static void main (String [] args)
  {
      int number = 919012046;
      int sorted = 0;
      int digits = 10;
      int sortedDigits = 1;
      boolean first = true;

      while (number > 0) {
          int digit = number % 10;
          
          if (!first) {
               //System.out.println(digit + "false");
        
               int tmp = sorted;
               int toDivide = 1;
        
               for (int i = 0; i < sortedDigits; i++) {
                     int tmpDigit = tmp % 10;
               
                     if (digit <= tmpDigit && digit % 2 != 0) {
                           sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                           break;
                     } 
               
                     else if (i == sortedDigits-1 && digit % 2 != 0) {
                           sorted = digit * digits + sorted;
                     }
               
                     tmp /= 10;
                     toDivide *= 10;
                     
                }
                //System.out.println(sorted + " first try");
                digits *= 10;
                sortedDigits += 1;
         } 
         else {
           sorted = digit;
         }
         
         //**************
         
         
         if (!first) {
               //System.out.println(digit + "false");
        
               int tmp = sorted;
               int toDivide = 1;
            for (int i = 0; i < sortedDigits; i++) {
                     int tmpDigit = tmp % 10;
               
                     if (digit <= tmpDigit && digit % 2 == 0) {
                           sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                           break;
                     } 
               
                     else if (i == sortedDigits-1 && digit % 2 == 0) {
                           sorted = digit * digits + sorted;
                     }
               
                     tmp /= 10;
                     toDivide *= 10;
                     
                }
                //System.out.println(sorted + " first try");
                digits *= 10;
                sortedDigits += 1;
         } 
         else {
           sorted = digit;
         }
         
         
         //*************
         
         
      first = false;
      number = number / 10;
    }
    //System.out.print(sorted);
  
  }
  
  
  public int sortDigits(int number) {
    // to be implemented 
      int sorted = 0;
      int digits = 10;
      int sortedDigits = 1;
      boolean first = true;

      while (number > 0) {
          int digit = number % 10;
          
          if (!first) {
               //System.out.println(digit + "false");
        
               int tmp = sorted;
               int toDivide = 1;
        
               for (int i = 0; i < sortedDigits; i++) {
                     int tmpDigit = tmp % 10;
               
                     if (digit <= tmpDigit) {
                           sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                           break;
                     } 
               
                     else if (i == sortedDigits-1) {
                           sorted = digit * digits + sorted;
                     }
               
                     tmp /= 10;
                     toDivide *= 10;
                }
           
                digits *= 10;
                sortedDigits += 1;
         } 
         else {
           sorted = digit;
         }
   
      first = false;
      number = number / 10;
    }
    //System.out.print(sorted);
  
       return sorted;
}  /**
   * PART (b)
   *
   * Sorts the odd then even digits (each in descending order) from the given
   * number and returns the new integer. You may not convert the given number
   * into a string to solve this problem!
   * @param number The integer to sort.
   *     Precondition: number is greater than 0.
   * @return The given number with its odd digits in descending order, followed
   *     by its even digits in descending order.
   */
  
  public int sortOddEvenDigits(int number) {
    // to be implemented 
      int parameter = sortDigits(number);
      int ognumber = parameter;
      int numberOdd = parameter;
      
      int sortedb = 0;
      
      int tens = 1;

      
      int sortedDigits = 1;
      int evensortedDigits = 1;
      boolean first = false;
   
      
      while (numberOdd > 0){
            int digit = numberOdd % 10;
            
            for (int i = 0; i < sortedDigits; i++){
                if (digit % 2 != 0){
                  sortedb = digit * tens + sortedb;
                  numberOdd = numberOdd/10;
                  digit = numberOdd % 10;
                  tens *= 10;
               }
               else{
                  numberOdd = numberOdd/10;
                  digit = numberOdd % 10;
               }
            }
           sortedDigits+=1;
     }
     int ogLength = (int) (Math.log10(ognumber) + 1);
     int sortLength = (int) (Math.log10(sortedb) + 1);
     sortedb = sortedb * (int)(Math.pow(10,ogLength - sortLength));
     int count = 0; 
   
        while (ognumber > 0){       
            int evendigit = ognumber % 10;
               
               for (int i = 0; i < evensortedDigits; i++){
                  
                  if (evendigit % 2 == 0 && ognumber>0){
                     //System.out.println("Count:  " + count);
                     //System.out.println("mult: " + Math.pow(10,count));
                     sortedb = sortedb + evendigit*(int)(Math.pow(10,count));
                     count ++;
                     //System.out.println(" OgNumber: " + ognumber +" Sortedb: " + sortedb + " Eventens: "+ eventens+" Even Digit: " + evendigit);
                     
                     
                     ognumber = ognumber/10;
                     evendigit = ognumber % 10;
                     
                   }
                  else{
                     ognumber = ognumber/10;
                     evendigit = ognumber % 10;
                  }
                  
                  
               }
              evensortedDigits+=1;
             
        }
   return sortedb;

}
}