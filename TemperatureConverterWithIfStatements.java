/*Made by: Jessica
Date: 2/25/21
Description: This program asks the user to make a selection, then asks for the value of the temperature, to return and output the conversion*/

import java.util.Scanner;

public class TemperatureConverterWithIfStatements
{
   public static void main(String[] args)
   {
      int selection = getSelection();
      
      if (selection == 1)
      {
         Scanner input = new Scanner (System.in);
         System.out.print("Enter temperature in Fahrenheit: ");
         double fahrenheit = input.nextDouble();
         double convertFahrenheit = getCelsius(fahrenheit);
         System.out.print(fahrenheit + " degrees Fahrenheit is " +  convertFahrenheit + " degrees Celsius");
      }
      
      else if (selection == 2)
      {
         Scanner input = new Scanner (System.in);
         System.out.print("Enter temperature in Celsius: ");
         double celsius = input.nextDouble();
         double convertCelsius = getFahrenheit(celsius);
         System.out.print(celsius + " degrees Celsius is " + convertCelsius + " degrees Fahrenheit");
      }
      
      else
      {
         System.out.print("Invalid");
      }
   }
   
   //******************************************************
   //method: getSelection()
   //description: Method asks for the user to input selection to convert the temperature
   //precondition: Imports Scanner
   //postcondition: Returns int selection
   public static int getSelection()
   {
      Scanner input = new Scanner (System.in);
      System.out.print("Select 1 to convert Fahrenheit to Celsius 2 to convert Celsius to Fahrenheit: ");
      int selection = input.nextInt();
      return selection;
   }
   
   //******************************************************
   //method: getCelsius(double)
   //description: Method imports double f to return double 
   //precondition: Imports double f
   //postcondition: Returns double for varaible convertFahrenheit
   public static double getCelsius(double f)
   { 
      return (f - 32) * (0.55);
   }
   
   //******************************************************
   //method: getFahrenheit(double)
   //description: Method imports double c to return double 
   //precondition: Imports double c
   //postcondition: Returns double for varaible convertCelsius
   public static double getFahrenheit(double c)
   {
      return (c * (1.8)) + 32;
   }
}

