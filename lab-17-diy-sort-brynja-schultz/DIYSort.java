import java.util.*;
import java.util.Random;

public class DIYSort
{
   public static void main (String[] args)
   {
      ArrayList<Integer> array = new ArrayList<Integer>();
      for(int i = 0; i< 10; i++){
         array.add((int)(Math.random()*10+1));
      }
      System.out.println(array);
      sort(array);

   }
   public static void sort(ArrayList<Integer> list)
   {
      for(int i = 0; i < list.size() -1; i++){
         int minIndex = i;
         for (int j = i+1; j < list.size(); j++){
            if(list.get(minIndex)>list.get(j)){
               minIndex = j;
            }
         }
         if(minIndex!=i){
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex,temp);
        }
        
      }
      System.out.println(list);
   }
}