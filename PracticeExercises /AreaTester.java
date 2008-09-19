import java.awt.Rectangle; //or import java.awt.*

public class AreaTester
{
     public static void main (String args[])
     {
          Rectangle r = new Rectangle (5,10,15,20);
          
          System.out.println ("The area is " + r.getHeight() * r.getWidth());
     }
}
          