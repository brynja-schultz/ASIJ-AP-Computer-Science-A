// import Scanner
import java.util.Scanner;

public class RideTheWaveRunner {

   public static void main(String[] args) {
      // declare and instantiate the Scanner
      Scanner scan = new Scanner(System.in);
      // prompt the user for the name of the audio file
      System.out.println("Enter the name of the audio file: ");
      // read in the name of the audio file 
         // note: the file needs to have no spaces in the name
      String file = scan.next();
      // read in the audio file and assign to an array of doubles, samples
      double[] samples = StdAudio.read(file);
      // declare and instantiate a RideTheWave object
      RideTheWave player = new RideTheWave(samples);
      // create a variable to read in the user's choice 
      char choice = 'y';
      // loop until the user wants to quit ('q')
      while(choice != 'q') {
         // prompt the user for which modification they wish to make to the audio file
         System.out.println("Select command (p, r, s, n, v, o, q): ");
         // read in the user choice using Scanner and charAt to store it as a char
         choice = scan.next().charAt(0); 
         // if the user chose p, play the file
         if(choice == 'p') {
            player.play();
         }
         /*
         * using the example above, add the additional choices for the user
         */
         if(choice == 'r')
         {
            player.reverse();
            
         }
         
         if (choice == 's')
         {
            System.out.println("Enter much would you like change the speed: ");
            double speed = scan.nextDouble(); 
            player.changeSpeed(speed);
           
         }
         
         if (choice == 'n')
         {
            System.out.println("Enter how much noise you would like to add: ");
            double noise = scan.nextDouble();
            player.addNoise(noise);
            
         }
         
         if (choice == 'v')
         {
            System.out.println("Enter how much you would like to change the volume: ");
            double volume = scan.nextDouble();
            player.changeVolume(volume);
         }
         
         if (choice == 'o')
         {
            System.out.println("Enter new file name: ");
            file = scan.next();
            //System.out.println(file);
         }
        
      }
   }
}