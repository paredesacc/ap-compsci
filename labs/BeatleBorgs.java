/***************************************************************************************
  * Marco Paredes III
  * P3.9 BeatleBorgs - A program that moves a beatle along, and can change its direction
  * 9/18/08
  *************************************************************************************/
public class BeatleBorgs
{
     private int position;
     private int direction;
     public BeatleBorgs (int initPosition)
     {
          initPosition = position;
          position = 0;
          direction = 1;
     }//end constructor
     
     public void move()
     {
          position += 1;
     }//end move
     
     public void turn()
     {
          direction += -1;
     }//end turn
     
     public int getPosition()
     {
          return position;
     }
}//end BeatleBorg Object
          
        
          
          
          
         
          
          
          
          
 