/*
 * the layout for writing an object
 */

public class BankAccount
{
     //1. INSTANCE FEILDS (values) and PUBLIC STATIC VARIABLES (constants)
     private double balance; //no specific value assigned yet
     
     //2. CONSTRUCTOR(S)
     public BankAccount ()
     {
          balance = 0.0;
     }
     
     //this constructor sets and initial amount for the balance
     public BankAccount (double initBalance)
     {
          balance = initBalance;
     }
     
     //3. METHODS (actions) that this object can perform 
     public double getBalance ()
     {
          return balance;
     }//end getBalance method
     
     public void deposit (double amount)
     {
          balance = balance + amount;
     }//end deposit method

}//end BankAccount class
          
     
     