public class Vigenere
{
   // declare instance variables for text and keyword
   private String plainText;
   private String key;
   private String encrypted = "";

   // no argument constructor
   public Vigenere ()
   {
	   plainText = "";
      key = "";
   }
    
   // initialization constructor
   public Vigenere (String theMsg, String theKey)
   {
      plainText = theMsg;
      key = theKey; 
   }
    
   // modifier method for plainText
   public void setPlainText(String theMsg)
   {
      plainText = theMsg;
   }
    
   // modifier method for key
   public void setKey(String theKey)
   {
      key = theKey;
   }
   
    
   // accessor method for plainText
   public String getPlainText()
   {
      return plainText; 
   }
    
   // accessor method for key
   public String getKey()
   {
      return key; 
   }
   
    
   // encrypt method
   //   return a String
   //   no parameters
   public String encrypt()
   {
      //String encrypted = "";
       for(int i = 0; i < plainText.length(); i++)
       {
         int addValue = key.charAt(i%key.length()) - 65; 
         int setValue = plainText.charAt(i) - 65;
         int newValue = (addValue + setValue) % 26;
         encrypted += (char)(newValue + 65); 
       }
       return encrypted;
   }
   
    
   // decrypt method
   public String decrypt()
   {
      String decrypted = "";
      for(int i = 0; i < plainText.length(); i ++)
      {
         int subValue = key.charAt(i%key.length()) - 65;
         int setValue = encrypted.charAt(i) - 65;
         int newValue = (setValue - subValue);
         if (newValue >= 0)
            newValue = newValue% 26;
         if (newValue < 0)
            newValue += 26;
         decrypted += (char)(newValue + 65);
      }
      return decrypted;
   }
   //   return a String
   //   no parameters
    
   
   // equals method
   public boolean equals(Object obj)
   {
     if(this == obj)
      return true;
     if(obj == null)
      return false;
     if(!(obj instanceof Vigenere))
      return false;
     Vigenere v = (Vigenere) obj;
     return plainText.equals(v.getPlainText())&& key.equals(v.getKey());
      
   } 
   
   //   return a boolean
   //   Vigenere reference parameter
    
   
   // toString() method
   public String toString()
   {
        return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt() + "\ndecrypted Text = " + decrypt());     
   }
    
}