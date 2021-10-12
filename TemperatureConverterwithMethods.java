/*Made by: Jessica
Date: 1/29/21
Description: This program asks for a user to input a selection, to compute, return, and display the answer*/

import java.util.Scanner;

public class TemperatureConverterwithMethods
{
   public static void main (String [] args)
   {
      double celsius;
      int fahrenheit;
      
      fahrenheit = getFahrenheit();
      celsius =  getCelsius(fahrenheit);
      output(fahrenheit, celsius);
   }
   
   //******************************************************
   //method: getFahrenheit()
   //description: Method prompts for the user to enter a temperature in Fahrenheit and returns it to the variable
   //precondition: Imports scanner
   //postcondition: Returns int fahrenheit
   public static int getFahrenheit()
   {  
      int fahrenheit;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the temperature in Fahrenheit: ");
      fahrenheit = input.nextInt();
      return fahrenheit;
   } 
   
   //******************************************************
   //method: getCelsius(int)
   //description: Method imports int fahrenheit, then computes and returns double celsius
   //precondition: Imports int fahrenheit
   //postcondition: Returns double celsius
   public static double getCelsius(int fahrenheit)
   {
      double celsius;
      celsius = (fahrenheit - 32)*(0.55);
      return celsius;
   }
   
   //******************************************************
   //method: output(int,double)
   //description: Method imports int fahrenheit and double celsius to return the final print statement
   //precondition: Imports int fahrenheit and double celsius
   //postcondition: Prints output
   public static void output(int fahrenheit, double celsius)
   {
      System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
   }

}
      
      