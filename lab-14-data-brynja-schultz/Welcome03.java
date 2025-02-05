import core.data.*;

public class Welcome03{   

      public static void main(String[] args) {
         DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
         WeatherStation[] allstns = ds.fetchArray("WeatherStation", "station/station_name", 
                                         "station/station_id", "station/state",
                                         "station/latitude", "station/longitude");
         /*for (int i = 0; i < allstns.length; i++){
               System.out.println(allstns[i].getLat());
         }*/
         
         int pos = Integer.MIN_VALUE;
         double min = Integer.MAX_VALUE;
         for (int i = 0; i < allstns.length; i++){
            double temp = allstns[i].getLat();
               if (temp < min){
                min = temp;
                pos = i;
            }
          }
 
       System.out.println(allstns[pos].getName());
       System.out.println(allstns[pos].getLat());
       System.out.println(allstns[pos].getState());
     }
}
