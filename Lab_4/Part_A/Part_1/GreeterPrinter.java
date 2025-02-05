public class GreeterPrinter
{
   public static void main(String[] args)
   {
      Greeter greeter1 = new Greeter();
      System.out.println(greeter1.sayHello());
      
      Greeter greeter2 = new Greeter("Brynja");
      System.out.println(greeter2.sayHello());
      
      System.out.println(greeter2.sayGoodbye());
      
      String string1 = "Hello, Brynja";
      System.out.println(string1.length());
      
      System.out.println(string1.toUpperCase());
      System.out.println(string1.toString());
      
      String changed = string1.replace('e', '3');
      System.out.println(changed);
      System.out.println(string1);
   }
   
}