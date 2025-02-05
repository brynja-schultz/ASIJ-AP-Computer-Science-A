import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
      String id1 = "KATL";
      DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id1 + ".xml"); 
      ds1.setCacheTimeout(15);  
      ds1.load();
      ds1.printUsageString();
      float temp = ds1.fetchFloat("temp_c");
      String loc = ds1.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "C");
  
   }
}