
/**
 * Represents a DNA sequence.
 */
public class DNA
{
   /**
   * The original sequence including the upstream, geneSequence, and downstream.
   */
   private String sequence;
   
   /**
   * The gene sequence.
   */
   private String geneSequence;
   
   /**
   * The part of the sequence upstream from the gene sequence.
   */
   private String upstream;
   
   /**
   * The RNA.
   */
   private String RNA;
   
   /**
   * Creates a new DNA with null for the string value.
   */
   public DNA()
   {
      this(null);
   }
   
   /**
   * Creates a new DNA using the string passed in.
   * The gene sequence is created using a method call.
   * The upstream is created using a method call.
   */
   public DNA(String s)
   {
      sequence = s.toUpperCase();
      setGeneSequence();
      geneSequence = getGeneSequence();
      setUpstream();
      upstream = getUpstream();
      RNA = "";
   }
   
   /**
   * Changes the sequence of the DNA.
   * @param s This DNA's new sequence.
   */
   public void setSequence(String s)
   {
      sequence = s;
      setGeneSequence();
      geneSequence = getGeneSequence();
      setUpstream();
      upstream = getUpstream();
      RNA = "";
   }
   
   /**
   * Gets the sequence of this DNA.
   * @return this DNA's original sequence.
   */
   public String getSequence()
   {
      // TODO
      return sequence;
   }
   
   /**
   * Gets the location of the ATG codon of this DNA.
   * @return this DNA's ATG codon location.
   */
   public int getATGLoc()
   {
      return sequence.indexOf("ATG");
   }
   
   /**
   * Gets the location of the CTC codon of this DNA.
   * @return this DNA's CTC codon location.
   */
   public int getCTCLoc()
   {
       return sequence.indexOf("CTC");

   }
   
   /**
   * Gets the location of the GTC codon of this DNA.
   * @return this DNA's GTC codon location.
   */
   public int getGTCLoc()
   {
       return sequence.indexOf("GTC");

   }
   
   /**
   * Sets the value of the upstream sequence of this DNA.
   */
   public void setUpstream()
   {
      // TODO
      int end = sequence.indexOf("ATG");
      upstream = sequence.substring(0,end);
      
   }
   
   /**
   * Gets the value of the upstream sequence of this DNA.
   * @return this DNA's upstream sequence.
   */
   public String getUpstream()
   {
      // TODO
      return upstream;
   }
   
   /**
   * Gets the length of the upstream sequence of this DNA.
   * @return the length of this DNA's upstream sequence.
   */
   public int getUpstreamLength()
   {
      // TODO
      return upstream.length();
   }
   
   /**
   * Sets the value of the gene sequence of this DNA.
   */
   public void setGeneSequence()
   {
      // TODO
      int start = sequence.indexOf("ATG");
      
      geneSequence = sequence.substring(start);
      
   }
   
   /**
   * Gets the value of the gene sequence of this DNA.
   * @return this DNA's gene sequence.
   */
   public String getGeneSequence()
   {
      // TODO
      return geneSequence;
   }
   
   /**
   * Gets the length of the gene sequence of this DNA.
   * @return the length of this DNA's gene sequence.
   */
   public int getGeneSeqLength()
   {
      // TODO
      return geneSequence.length();
   }
   
   /**
   * Sets the value of RNA for this DNA.
   * @return the RNA equivalent.
   */
   public String transcription()
   {                             
      // TODO
      
      int i = 0;
      
      while (i < geneSequence.length())
      {
         if (geneSequence.charAt(i) == 'T')
            RNA += "A";
         else if (geneSequence.charAt(i) == 'A')
            RNA += "T";
         else if (geneSequence.charAt(i) == 'G')
            RNA += "C";
         else if (geneSequence.charAt(i) == 'C')
            RNA += "G";
         i++;
      }
      return RNA;
   }
   
   /**
   * Sets the value of reverse transcription for the RNA.
   * @return the reverse transcription for the RNA.
   */
   public String reverseTranscription()
   {
      String reverse = "";
      // TODO
      int i = RNA.length() -1 ;
      
      while (i >= 0)
      {
         reverse += RNA.charAt(i);
         i--;
      }
         
      return reverse;
   }
   
   /**
   * Gets the number of As in the upstream sequence of this DNA.
   * @return the number of As in this DNA's upstream sequence.
   */
   public int getUpstreamA()
   {
      // TODO
      int count = 0;
      int i = 0;
      while (i < upstream.length())
      {
         if ('A' == upstream.charAt(i))
            {
            count += 1;
            }
         i += 1;
      }
      return count;
   }
   
   /**
   * Gets the number of Ts in the upstream sequence of this DNA.
   * @return the number of Ts in this DNA's upstream sequence.
   */
   public int getUpstreamT()
   {
      // TODO
      int count = 0;
      int i = 0;
      while (i < upstream.length())
      {
         if ('T' == upstream.charAt(i))
            {
            count += 1;
            }
         i += 1;
      }
      return count;
   }
   
   
   public String toString()
   {
      // TODO
      return sequence + geneSequence + upstream + RNA;
   }
}