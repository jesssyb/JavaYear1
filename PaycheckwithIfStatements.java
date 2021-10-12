/*Author: Jessica
Date: 3/3/21
Description: This program asks for user input in doubles to calculate the gross pay and net pay after a determined tax rate using if/else statements*/

import java.util.Scanner;

public class PaycheckwithIfStatements
{
   public static void main (String [] args)
   {
      double hourlyWage, hoursWorked, grossPay, netPay;
      
      hourlyWage = getHourlyWage();
      hoursWorked = getHoursWorked();
      grossPay = getGrossPay(hourlyWage,hoursWorked);
      netPay = getNetPay(grossPay);
      printOutput(hourlyWage, hoursWorked, grossPay, netPay);
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
   //method: getHoursWorked()
   //description: This method asks how many hours the user worked
   //precondition: Scanner method imported
   //postcondition: Returns double hoursWorked
   public static double getHoursWorked()
   {  
      double hoursWorked;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the hours worked: ");
      hoursWorked = input.nextDouble();
      return hoursWorked;
   }
   
   //******************************************************
   //method: getGrossPay(double,double)
   //description: Method computes and returns user's grossPay
   //precondition: Imports double hourlyWage and double hoursWorked
   //postcondition: Returns the user's computed double grosspay
   public static double getGrossPay(double hourlyWage, double hoursWorked)
   {
      double grossPay;
      grossPay = hourlyWage * hoursWorked;
      return grossPay;
   }
   
   //******************************************************
   //method: getNetPay(double)
   //description: Method imports double grossPay, then computes using if/else statements, and returns the double netPay
   //precondition: Double grossPay is imported 
   //postcondition: Double netPay is returned
   public static double getNetPay(double grossPay)
   {
      double netPay;
      if (grossPay < 200)
      {
         netPay = grossPay - (grossPay * 0.0);
      }
      else if (grossPay <= 400)
      {
         netPay = grossPay - (grossPay * 0.12);
      }
      else
      {
         netPay = grossPay - (grossPay * 0.18);
      }
      return netPay;
   }
   
   //******************************************************
   //method: printOutput(double, double, double, double)
   //description: Method outputs final print statements
   //precondition: Method imports double hourlyWage, double hoursWorked, double grossPay, and double netPay
   //postcondition: Outputs results
   public static void printOutput(double hourlyWage, double hoursWorked, double grossPay, double netPay)
   {  
      System.out.println("Hours worked: " + hoursWorked); 
      System.out.println("Hourly wage: " + hourlyWage); 
      System.out.println("Gross pay: " + grossPay); 
      System.out.println("Net pay: " + netPay);
   }
      
     
}
