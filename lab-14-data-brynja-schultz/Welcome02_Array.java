import core.data.*;
import java.util.Scanner;

//TOTAL STATIONS IN NJ: 2714

public class Welcome02_Array {
   public static void main(String[] args) {
      
      DataSource stns = DataSource.connect("http://w1.weather.gov/xml/current_obs/index.xml");
      stns.load();
      //stns.printUsageString();
      String[] ids = stns.fetchStringArray("station/station_id");
      //System.out.println(ids.length);

      String[] urls = stns.fetchStringArray("station/xml_url");
      String[] states = stns.fetchStringArray("station/state");
      String[] lng = stns.fetchStringArray("station/longitude");
      String[] lat = stns.fetchStringArray("station/latitude");
      
      //System.out.println(states.length);
      //System.out.println(lng.length);
      //System.out.println(lng);
           
      /*Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String stateOfInterest = sc.next();*/
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a longitude: ");
      double lngOfInterest = scan.nextDouble();

      /*for (int i = 0; i < ids.length; i++) {
         if (states[i].equals(stateOfInterest)) {
            printWeatherInfo(urls[i]);
         }
      }*/
 
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      WeatherStation[] allstns = ds.fetchArray("WeatherStation", "station/station_name", 
                                         "station/station_id", "station/state",
                                         "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.length);
      
      //filter for specific longitude
      for (int i = 0; i < allstns.length; i++){
         //System.out.println(allstns[i].getLong());
         if ((lngOfInterest - 1) <= allstns[i].getLong() && allstns[i].getLong() <= (lngOfInterest + 1))
            printWeatherInfo(urls[i]);
      }
      
   }
   
   
   
   public static void printWeatherInfo(String dataURL) {
      DataSource ds = DataSource.connect(dataURL);
      ds.setCacheTimeout(15 * 60);  
      ds.load();
      if (ds.hasFields("temp_c", "location")) {
         float temp = ds.fetchFloat("temp_c");
         String loc = ds.fetchString("location");
         System.out.println("The temperature at " + loc + " is " + temp + "C");
      }
   }
   
   
}