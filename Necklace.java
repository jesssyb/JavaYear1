/*Made by Jessica
Date: 4/30
Description: This program asks for the user to input two numbers in order to compute 
and output a necklace from the two inputted numbers*/

import java.util.Scanner;

public class Necklace
{
   public static void main(String [] args)
   {
      int num1 = getNum1();
      int num2 = getNum2();
      calculateNecklace(num1,num2);
      
   }
   
   //******************************************************
   //method: getNum1()
   //description: This method asks the user to input a number
   //precondition: Scanner initialized
   //postcondition: Returns int num1
   public static int getNum1()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num1 = input.nextInt();
      return num1;
   }
   
   //******************************************************
   //method: getNum2()
   //description: This method asks the user to input a number
   //precondition: Scanner initialized
   //postcondition: Returns int num2
   public static int getNum2()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter another number: ");
      int num2 = input.nextInt();
      return num2;
   }
   
   //******************************************************
   //method: calculateNecklace(int num1, int num2)
   //description: This method calculates the necklace and outputs the results
   //precondition: int num1 and int num2 imported
   //postcondition: outputs results
   public static void calculateNecklace(int num1, int num2)
   {
      int counter = 2, add = 0, originalNum1 = num1, originalNum2 = num2;
      boolean trueOrFalse = false;
      
      System.out.print(num1 + " " + num2 + " ");
      while(trueOrFalse == false)
      {
         
         add += num1 + num2;
         num1 = num2;
         num2  = add % 10;
         add = 0;
         counter += 1;
         System.out.print(num2+ " ");
         if (num1 == originalNum1 && num2 == originalNum2)
         {
            trueOrFalse = true;
            counter -= 2;
         }
         
      }
      System.out.println("\nIt takes " + counter + " iterations to complete a necklace with the numbers " + originalNum1 + " and " + originalNum2);
   }
}