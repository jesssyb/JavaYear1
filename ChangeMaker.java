/*Made by Jessica
Date: 10/23/20
Description: This program asks for user input for an amount of change and outputs the change in terms of physical money */

import java.util.Scanner;

public class ChangeMaker
{
   public static void main (String [] args)
   {
      int change, quarter, quarterTwo, dime, dimeTwo, nickel, penny;
      
      
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the amount of change as an interger: ");
      change = input.nextInt();
      
      quarter = change / 25; 
      quarterTwo = change % 25; 
      dime = quarterTwo / 10; 
      dimeTwo = quarterTwo % 10; 
      nickel = dimeTwo / 5; 
      penny = dimeTwo % 5;
      
      System.out.println(change + " cent(s) makes " + quarter + " quarter(s), " + dime + " dime(s), " + nickel + " nickel(s), and " + penny + " penny(ies)");
    }
}
      
      
      