/*Made by: Jessica
Date: 4/6/21
Description: This program prompts the user to import hourly wage and hours worked to compute and output results.
Overtime is also accounted for if the user worked 40+ hours*/

/*UPDATED TO FIX GROSSPAY CALCULATION*/

import java.util.Scanner;

public class PaycheckWithoutTax
{
   public static void main(String[] args)
   {
      double hoursWorked, hourlyWage, grosspay;
      
      hoursWorked = getHoursWorked();
      hourlyWage = getHourlyWage();
      grosspay = getGrosspay(hoursWorked, hourlyWage);
      output(hoursWorked,hourlyWage,grosspay);
   }
   
   //******************************************************
   //method: getHoursWorked()
   //description: This method asks how many hours the user worked
   //precondition: Scanner method imported
   //postcondition: Returns double hoursWorked
   public static double getHoursWorked()
   {  
      double hoursWorked;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hours worked: ");
      hoursWorked = input.nextDouble();
      return hoursWorked;
   }
   
   //******************************************************
   //method: getHourlyWage()
   //description: This method asks for the user's double hourly wage
   //precondition: Scanner method imported
   //postcondition: Returns double hourlyWage
   public static double getHourlyWage()
   {
      double hourlyWage;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hourly wage: ");
      hourlyWage = input.nextDouble();
      return hourlyWage;
   }
   
   //******************************************************
   //method: getGrosspay(double,double)
   //description: Method uses if/else statements to determine if user worked overtime then computes and returns grosspay
   //precondition: Imports double hoursWorked and double hourlyWage
   //postcondition: Returns the user's computed double grosspay
   public static double getGrosspay(double hoursWorked, double hourlyWage)
   {
      double grosspay;
      
      if (hoursWorked > 40)
      {
         grosspay = (hourlyWage * 40) + (hourlyWage * 1.5 * (hoursWorked - 40));
      }
      
      else
      {
         grosspay = hoursWorked * hourlyWage;
      }
      
      return grosspay;
   }
   
   //******************************************************
   //method: output(double, double, double)
   //description: Method outputs final print statements
   //precondition: Method imports double hoursWorked, double hourlyWage, double grosspay
   //postcondition: Outputs results
   public static void output(double hoursWorked, double hourlyWage, double grosspay)
   {
      System.out.println("\nHours worked: " + hoursWorked);
      System.out.println("Hourly wage: $" + hourlyWage);
      System.out.println("Grosspay: $" + grosspay);
   }
}