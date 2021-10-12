/*Made by: Jessica
Date: 5/31/21
Description: This program rolls a dice however many times the user inputs, and outputs 
the number of 3's and even rolls tossed*/

import java.util.Scanner;
public class RollIt
{
   public static void main(String [] args)
   {
      int tosses, threes = 0, evenRolls = 0;
      Scanner input = new Scanner(System.in);
      do
      {
      System.out.print("Enter the number of tosses you want to throw: ");
      tosses = input.nextInt();
      if(tosses <= 0)
      {
         System.out.println("Invalid, enter a number greater than 0");
      }
      }while(tosses <= 0);
      
      System.out.print("\nNumbers you rolled: ");
      for(int c = 0; tosses != c; c++)
      {
         double r = (Math.random() * 6) + 1;
         if ((int)r == 3)
         {
            threes += 1;
         }
         
         else if ((int)r % 2 == 0)
         {
            evenRolls += 1;
         }
        System.out.print((int)r + "  ");
      }
      
      System.out.println("\nTotal number of rolls: " + tosses);      
      System.out.println("There was a total of " + threes + " three(s) rolled. Thats " + (int)(((double)threes/tosses) * 100) + "% of the time!");
      System.out.println("There was a total of " + evenRolls + " even roll(s). Thats " + (int)(((double)evenRolls/tosses) * 100) + "% of the time!");
   }
}