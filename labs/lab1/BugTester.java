/********************************************
 * Marco Paredes III
 * BugTester
 * Description: Uses the Bug object to move and turn
 * ***************************************/

public class BugTester
{
     public static void main (String args [])
     {
          Bug bugsy = new Bug (10);
          bugsy.move(); 
          bugsy.turn();
          bugsy.move();
          
          System.out.println (bugsy.getPosition());
     }
}
 