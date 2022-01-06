package com.company;
import java.util.Scanner; // Importing Scanner Class stuff. So that we can input from User.

// ATM  Program.

public class JavaLab3
{
      public static void main (String args[] )
    {


        System.out.print("\n \t\t ATM Menu  :  ");
     System.out.println("\n\n 1. CheckBalance       2. Deposite     ");
      System.out.println(" 3. Withdraw           4.  Exit        ");

        int balance = 1000, withdraw, deposit ;

        Scanner obj = new Scanner(System.in); // created object

        System.out.print("\n Please Choose your option :  ");
         int choice = obj.nextInt(); // it will take int value from Keyboard

         Scanner input = new Scanner(System.in) ; // for taking input

        switch ( choice )
        {
            case 1 :   // for CheckBalance
                System.out.println("Your Current balance is : "+balance);
                 break ; // it will break the switch statement when this code execute.
                    // and other case will not run.

            case 2 : // For Deposite
                System.out.print("Please Enter your Amount : ");
                 deposit = input.nextInt() ;

                balance = balance + deposit; // new balance
             System.out.println(" ** Deposited SUCCESSFULLY ** ");
             System.out.println(" \t Now your Current balance is : " +  balance);
               break ;


            case 3 : // For Withdraw
                System.out.println("Please Enter your amount : ");
                  withdraw = input.nextInt() ;

                  if (balance >= withdraw)
                  {
                      balance = balance - withdraw ;
                      System.out.println("Collect Your Amount: " + withdraw);
                      System.out.println(" \t Now your Current balance is : " +  balance);
                  }
                  else  // in case of insufficient Balance
                  {
                      System.out.println(" Sorry Insufficient balance : ");
                  }

                break ;

            case 4 : // For Exit
                   System.exit(0); //exits current program by terminating running JVM.
                break ;
            default:
                System.out.println(" Please Enter a valid option ");

        } // END if Switch statement


  } // End of main Function
}


