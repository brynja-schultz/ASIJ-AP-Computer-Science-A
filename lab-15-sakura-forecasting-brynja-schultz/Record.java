import java.util.*;

/**
 * Represents the minimum and maximum temperatures for a single Date.
 */
public class Record {
   /**
   * The Date of the data. This includes the year, month, and day.
   */
   private Date day;
   /**
    * The minimum temperature in Celsius.
    */
   private double minTemp;
   /**
    * The maximum temperature in Celsius.
    */
   private double maxTemp;
   
   /**
    * Creates a new Record with the given Date, minimum temp, and maximum temp.
    * The date is a decimal value stored as a double. 
    */
   public Record(Date d, double min, double max) {
      day = d;
      minTemp = min;
      maxTemp = max;
   }
   
   /**
    * Gets the year of this record.
    * @return this record's years.
    */
   public int getYear() {
      return day.getYear();
   }
   
   /**
    * Gets the month of this record.
    * @return this records's month.
    */
   public int getMonth() {
      return day.getMonth();
   }
   
   /**
    * Gets the day of this record.
    * @return this record's day.
    */
   public int getDay() {
      return day.getDate();
   }
   
   /**
    * Gets the maximum temperature in degrees Celsius of this record.
    * @return this record's maximum temperature in degrees Celsius.
    */
   public double getMaxTemp() {
      return maxTemp;
   }
   
   /**
    * Gets the minimum temperature in degrees Celsius of this record.
    * @return this record's minimum temperature in degrees Celsius.
    */
   public double getMinTemp() {
      return minTemp;
   }
   
   /**
    * Gets the String representation of this Record.
    * @return this Record's instance variables as a String.
    */
   public String toString() {
      return "Month: " + (day.getMonth() + 1) + " Day: " + day.getDate() + " max temp: " + maxTemp + " min temp: " + minTemp;
   }
   
   
}

