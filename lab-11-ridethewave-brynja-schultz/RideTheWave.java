/**
 * Represents a audio manipulation program.
 */
public class RideTheWave {
   
   /**
   * The original audio represented as an array of doubles.
   */
   private double[] audio;
   
   /**
   * Creates a new RideTheWave using the array passed in.
   * The audio instance variable is assigned from the parameter in.
   * @param in This RideTheWave's new audio array.
   */
   public RideTheWave(double[] in) {
      audio = in;
   }
   
   /**
   * Changes the values of the audio array.
   * @param in This RideTheWave's new audio array.
   */
   public void setAudio(double[] in) {
      //TODO
      audio = in;
   }
   
   /**
   * Gets the audio for this RideTheWave object.
   * @return this RideTheWaves's current audio.
   */
   public double[] getAudio() {
      //TODO
      return audio;
   }
   
   /**
   * Play the current audio as it is, after all the 
   * effects up to this point have been added.
   */
   public void play() {
      StdAudio.play(audio);
   }
   
   /**
   * Reverse the audio so that it plays backwards.
   */
   public void reverse() {
      for (int i = 0; i < audio.length/2; i++)
      {
         double temp = audio[i];
         audio[i] = audio[audio.length - (i+1)];
         audio[audio.length - (i+1)] = temp;
         
       }
       StdAudio.play(audio);

   }
   
   /**
   * Change the speed of the audio by a specific factor. 
   * @param speed The factor to change the audio speed by.
   */
   public void changeSpeed(double speed) {
      double factor = speed; 
      int length = audio.length;
      double[] newAudio = new double[(int)(length/factor)];
      
      for (int i = 0; i < newAudio.length; i ++)
      {
         newAudio[i] = audio[(int)(i * factor)];
      }
      
      StdAudio.play(newAudio);
   }
   
   /**
   * Add a specified amount of white noise to the audio. 
   * @param noise The amount of noise to add to the audio.
   */
   public void addNoise(double noise) {
      //TODO
           
      for (int i = 0; i < audio.length; i++)
      {
         double random = (Math.random()*(noise * 2)) - noise;
         audio[i] = audio[i] + random;
         
         if (audio[i] < -1.0)
         {
            audio[i] = -1.0;
         }
         
         if (audio[i] > 1.0)
         {
            audio[i] = 1.0;
         }
         
       }
       StdAudio.play(audio);

   }
   
   /**
   * Scale the volume of the audio up or down. 
   * @param volume The amount to change the audio volume by.
   */
   public void changeVolume(double volume) {
      //TODO
      for (int i = 0; i < audio.length; i++)
      {
         audio[i] = audio[i] * volume;
         
         if (audio[i] > 1.0)
         {
            audio[i] = 1.0;
            
         }
         
         if (audio[i] < -1.0)
         {
            audio[i] = -1.0;
         }
         
      }
      
      StdAudio.play(audio);

      
   }
   
   /**
   * Output the current version of the audio to a specified file.
   * @param fileName The name of the file to save the new audio as.
   */
   public void output(String fileName) {
      //TODO
      
   }
}