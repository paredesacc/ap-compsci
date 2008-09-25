/****************************************
 * Marco Paredes 
 * Greeter Object
 * Tests the greeter object
 ************************************/
public class GreeterTester
{
     public static void main (String args [])
     {
          Greeter world = new Greeter ("World");
          Greeter dave = new Greeter ("Dave");
          Greeter marco = new Greeter ("Marco");
          
          dave.sayGoodbye ();
          world.refuseHelp ();
          
          System.out.println (""+ dave.getGreeting ());
          System.out.println (""+ world.getGreeting ());
          System.out.println (""+ marco.getGreeting ());
     }
}
          
          