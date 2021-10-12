/*Made by: Jessica
Date: 10/22/20
Description: This program asks for a user to input a temperature in fahrenheit to get an output in celsius*/


import java.util.Scanner;

public class TemperatureConverter
{
   public static void main (String [] args)
   {
      double celsius;
      int fahrenheit;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Enter the temperature in Fahrenheit: ");
      fahrenheit = input.nextInt();
      
      celsius = (fahrenheit - 32) * 0.55;
      
      System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
      }
}
      
   