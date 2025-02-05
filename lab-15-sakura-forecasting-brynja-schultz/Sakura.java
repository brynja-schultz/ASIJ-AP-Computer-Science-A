import java.util.*;
import java.io.*;

/**
 * A runner class used to read in the data file and also to experiment 
 * with how to predict the bloom date for cherry blossoms in Tokyo.
 */
public class Sakura {
   public static void main(String[] args) throws FileNotFoundException {
      // Specifies the data file to be used.
      String file = "TokyoWeather.txt";
      // Creates an ArrayList to store the data and calls the readData() method.
      ArrayList<YearData> yearsList = readData(file);
      
      // Loop to print out the existing data to see how it is structured.
      
      ArrayList<Integer> bloomDates = new ArrayList<Integer>();
      Integer[] dates = {21, 22, 28, 31, 16, 25, 23, 21, 21,17, 21};
      for (int a = 0; a < dates.length; a++){
         bloomDates.add(dates[a]);
         
      }
      
      for(int i = 0; i < yearsList.size(); i++) {
         ArrayList<Record> temp = yearsList.get(i).getData();
         for(int j = 0; j < temp.size(); j++){
            if (temp.get(j).getMonth() == 2){
               if(bloomDates.size() >0 && temp.get(j).getDay() == bloomDates.get(0)){
                  System.out.println(temp.get(j));
                  bloomDates.remove(0);
               }
              }
       }
      }
      int year;
      double max;
      double min;
      double deltaMinMax;
      
      //Add your code here to determine what can be used to predict the bloom date.
     }
      
      
   
   
   /**
    * Reads in the provided file and creates an ArrayList of the data.
    * @param file the name of the text file containing the data.
    * @return the ArrayList containing the data from the text file.
    */
   public static ArrayList<YearData> readData(String file) throws FileNotFoundException {
      // Scanner used to read in the data from the file.
      Scanner in = new Scanner(new File(file));
      // ArrayList to store the data.
      ArrayList<YearData> list = new ArrayList<YearData>();
      // Read in the header line so it is not added to the ArrayLists.
      String header = in.nextLine();
      // Check to see if the file still has data to be read in.
      while(in.hasNextLine()) {
         // Read in the line of data and 
            // use a space as a delimiter to separate the different columns.
         String[] line = in.nextLine().split(" ");
         // Local variable containing the year.
         int year = Integer.parseInt(line[0]);
         // Local variable containing the month.
         int month = Integer.parseInt(line[1]);
         // Local variable containing the date (day).
         int date = Integer.parseInt(line[2]);
         // Date object storing the year, month, and day (month is stored 0 to 11).
         Date day = new Date(year, month - 1, date);
         // Local variable to store the maximum temperature.
         double maxTemp = Double.parseDouble(line[3]);
         // Local variable to store the minimum temperature.
         double minTemp = Double.parseDouble(line[4]);
         // Condition to see if the month is February or March.
            // This only allows data from these two months to be 
            // includes in the ArrayList.
         if(month == 2 || month == 3) {
            // Instantiate a new Record with the data from above.
            Record newRecord = new Record(day, minTemp, maxTemp);
            // Local variable used to determine if the Year already exists.
            boolean present = false;
            // Loop through the existing list of data.
            for(int i = 0; i < list.size(); i++) {
               // If the year is already in the ArrayList, then add this Record and set present to true.
               if(list.get(i).getYear() == newRecord.getYear()) {
                  list.get(i).addRecord(newRecord);
                  present = true;
                  break;
               }
            }
            // If the year is not already in the ArrayList, 
               // then create a new Object containing the first record.
            if(!present) {
               list.add(new YearData(year, newRecord));
            }
         }
      }
      // Return the completed ArrayLists.
      return list;
   }
}

