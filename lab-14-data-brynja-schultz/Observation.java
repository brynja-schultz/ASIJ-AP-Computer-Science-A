public class Observation {
   float temp;
   int windDir;   // in degrees
   String description;
   
   
   
   Observation(String description, float temp, int windDir) {
      this.description = description;
      this.temp = temp;
      this.windDir = windDir;
   }
    
   public boolean colderThan(Observation ob2){
      if (this.temp > ob2.temp)
         return false; 
      if (this.temp < ob2.temp)
         return true;
      return false; 
   }
   
   public String toString() {
      return (temp + " degrees; " + description + " (wind: " + windDir + " degrees)");
   }
}