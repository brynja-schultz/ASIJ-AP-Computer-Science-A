import core.data.*;

public class Welcome02_Object {
   public static void main(String[] args) {
      String id1 = "KATL";
      DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id1 + ".xml"); 
      ds1.setCacheTimeout(15 * 60);  
      ds1.load();
      //ds1.printUsageString();

      Observation ob1 = ds1.fetch("Observation", "weather", "temp_f", "wind_degrees");
      System.out.println(id1 + ": " + ob1);
      
      String id2 = "KSAV";
      DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml"); 
      ds2.setCacheTimeout(15 * 60);  
      ds2.load();
      //ds1.printUsageString();
      
      Observation ob2 = ds2.fetch("Observation", "weather", "temp_f", "wind_degrees");
      System.out.println(id2 + ": " + ob2);
      
      String id3 = "KHII";
      DataSource ds3 = DataSource.connect("http://weather.gov/xml/current_obs/" + id3 + ".xml"); 
      ds3.setCacheTimeout(15 * 60);  
      ds3.load();
      //ds3.printUsageString();
      
      Observation ob3 = ds3.fetch("Observation", "weather", "temp_f", "wind_degrees");
      System.out.println(id3 + ": " + ob3);
      
      
      if (ob1.colderThan(ob2)) {
         System.out.println("Colder at " + id1);
      } 
      else if(ob2.colderThan(ob3)) {
         System.out.println("Colder at " + id2);
      }
      else {
         System.out.println("Colder at " + id3);
      }
   }
}