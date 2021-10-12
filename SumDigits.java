/*Made by: Jessica
Date: 5/31/21
Description: This program asks the user to input a number in order to compute and output the sum of all the digits within the number*/

import java.util.Scanner;
public class SumDigits
{
   public static void main(String [] args)
   {
      double num;
      Scanner input = new Scanner(System.in);
      do
      {
         System.out.print("Enter a number: ");
         num = input.nextDouble();
         if (num < 0)
            System.out.println("Invalid, enter a number greater than or equal to 0");
      }while(num < 0);
      int length = 0, counter = 1, add = 0;
      
      //Finds the length of the number
      while (counter <= num)
      {
         length++;
         counter *=10;
      }
      
      //Adds the digits of the number
      while (length >= 0)
      {
         add += num / Math.pow(10,length-1);
         num = num % Math.pow(10,length-1);
         length--;  
      }
      
      //Output
      System.out.println("The sum of the digits is: " + add);
   }
   
}