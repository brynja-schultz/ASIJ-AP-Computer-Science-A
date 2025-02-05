public class Word
{
   /**
      Tests whether a letter is a vowel
      @param letter a string of length 1
      @return true if letter is a vowel
    */
   public boolean isVowel(String letter)
   {
      letter = letter.toLowerCase();
     
      return "aeiouy".contains(letter);
      
      /**if (letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u") ||letter.equals("y"))
         return true; 
      return false;*/
   }
}
