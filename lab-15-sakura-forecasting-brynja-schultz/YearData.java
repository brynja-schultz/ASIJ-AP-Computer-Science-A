import java.util.*;

/**
 * Represents a Year of temperature data.
 * Each day has an ArrayList of Records to store each day's information.
 */
public class YearData {
   /**
    * The year the data is from.
    */
    
   private int bl09 = 21;
   private int bl10 = 22;
   private int bl11 = 28;
   private int bl12 = 31;
   private int bl13 = 16;
   private int bl14 = 25;
   private int bl15 = 23;
   private int bl16 = 21; 
   private int bl17 = 21;
   private int bl18 = 17;
   
   private int year;
   /**
    * The data - an ArrayList storing each day as a Record.
    */
   private ArrayList<Record> data;
   
   /**
    * Creates a new YearData object with the year and no existing data.
    * Year is set to -1 and the data ArrayList is initialized.
    */
   public YearData() {
      year = -1;
      data = new ArrayList<Record>();
   }
   
   /**
    * Creates a new YearData object with the year and the new Record for that day.
    * Year is set to the year and the Record is added to the data ArrayList.
    */
   public YearData(int y, Record r) {
      year = y;
      data = new ArrayList<Record>();
      data.add(r);
   }
   
   /**
    * Adds a new record to the ArrayList
    * @param r this includes the Date, min temp, and max temp
    */
   public void addRecord(Record r) {
      data.add(r);
   }
   
   /**
    * Gets the corresponding year for this object.
    * @return this YearData's year.
    */
   public int getYear() {
      return year;
   }
   
   /**
    * Gets the data for the YearData object.
    * @return this YearData's set of data.
    */
   public ArrayList<Record> getData() {
      return data;
   }
   
   /**
    * Gets the String representation of this YearData object.
    * @return this YearData objects's instance variables as a String.
    */
   public String toString() {
      return "" + "Year: " + year + " Records: " + Arrays.toString(data.toArray());
   }
}