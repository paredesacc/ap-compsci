/*********************************
 * Marco Paredes III
 * Car object
 * Description: a car object that allows the user to add few drive etc
 * *******************************/

public class Car
{
     
    
     private double MPG; 
     private double Gas;
     
     public Car (double MilesPerGallon)
     {
          MPG = MilesPerGallon;
     }
     public void tank (double initFuel)
     {
          Gas = initFuel;
     }
     public void addGas (double gallons)
     {
          Gas += gallons;
     }
     public void drive (double miles)
     {
          Gas -=  miles/MPG;
     }
     public double checkGas ()
     {
          return Gas;
     }
}//end Car class