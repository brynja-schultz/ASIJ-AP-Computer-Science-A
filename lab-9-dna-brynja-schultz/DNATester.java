public class DNATester
{
   public static void main(String[] args)
   {
      /* Create the constructor before running the main method. */
      DNA test = new DNA("cgccatataatgctcgtccgcgcccta");
      
      
      /* My recommendation would be to create the methods being called below
         one at at time. Then remove the comment and test your method. */
      
      System.out.println("+++++++++++ Upstream and Genic Report +++++++++++\n");
      System.out.println("Starting sequence is: " + test.getSequence().toLowerCase());
      System.out.println("Starting sequence is: " + test.getSequence());
      System.out.println("Length of starting sequence is: " + test.getSequence().length());
      System.out.println("-------------------------------------------------");
      System.out.println("ATG start codon begins in position (bp): " + test.getATGLoc());
      System.out.println("\tfollowed by codon CTC  in position (bp): " + test.getCTCLoc());
      System.out.println("\tfollowed by codon GTC  in position (bp): " + test.getGTCLoc());
      System.out.println("-------------------------------------------------");
      System.out.println("Upstream sequence is: " + test.getUpstream());
      System.out.println("Upstream length (bp): " + test.getUpstreamLength());
      System.out.println("-------------------------------------------------");
      System.out.println("Gene sequence is: " + test.getGeneSequence());
      System.out.println("Gene length (bp): " + test.getGeneSeqLength());
      System.out.println("-------------------------------------------------");
      System.out.println("[+ Strand: \t5' " + test.getGeneSequence() + " 3'");
      System.out.println("\t\t\t\t\t||||||||||||||||||");
      System.out.println("[- Strand: \t3' " + test.transcription() + " 5'\n");
      System.out.println("[- Strand: \t5' " + test.reverseTranscription() + " 3'");
      System.out.println("-------------------------------------------------");
      System.out.println("Upstream Direct (+) strand:");
      System.out.println("\tNumber of upstream As:" + test.getUpstreamA());
      System.out.println("\tNumber of upstream Ts:" + test.getUpstreamT());
   }
}