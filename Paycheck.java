/*Author: Jessica
Date : 10/21/20
Description: This program asks for user input in decimals to calculate the gross pay and net pay after a %15 tax*/


import java.util.Scanner;

public class Paycheck
{
   public static void main (String [] args)
   {
      double hourlyWage, hoursWorked, grossPay, netPay;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Enter hourly wage: ");
      hourlyWage = input.nextDouble();
      System.out.print("Enter the hours worked: ");
      hoursWorked = input.nextDouble();
      
      grossPay = hourlyWage * hoursWorked;
      netPay = grossPay - (grossPay * .15);
      
      System.out.println("Hours worked: " + hoursWorked); 
      System.out.println("Hourly wage: " + hourlyWage); 
      System.out.println("Gross pay: " + grossPay); 
      System.out.println("Net pay: " + netPay);
      
      }
}
      
      
   