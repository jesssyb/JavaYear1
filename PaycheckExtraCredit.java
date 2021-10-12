//Made by: Jessica
//Date: 3/29/21
//Description: This programs asks for the user to input their hourly wage and hours worked in order to compute and output 
//their grosspay and netpay, after overtime and tax are accounted for
import java.util.Scanner;

public class PaycheckExtraCredit
{
   public static void main(String [] args)
   {
      double hourlyPay, hoursWorked, grossPay, netPay;
      hourlyPay = getHourlyPay();
      hoursWorked = getHoursWorked();
      grossPay = getGrossPay(hourlyPay,hoursWorked);
      netPay = getNetPay(grossPay);
      output(hourlyPay, hoursWorked, grossPay, netPay);
   }
   
   //******************************************************
   //method: getHourlyPay()
   //description: This method asks how much money the user makes an hour
   //precondition: Scanner method imported
   //postcondition: Returns double hourlyPay
   public static double getHourlyPay()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hourly pay: ");
      double hourlyPay = input.nextDouble();
      return hourlyPay;
   }
   
   //******************************************************
   //method: getHoursWorked()
   //description: This method asks how many hours the user worked
   //precondition: Scanner method imported
   //postcondition: Returns double hoursWorked
   public static double getHoursWorked()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hours worked: ");
      double hoursWorked = input.nextDouble();
      return hoursWorked;
   }
   
   //******************************************************
   //method: getGrossPay(double,double)
   //description: Method uses if/else statements to determine if user worked overtime then computes and returns grosspay
   //precondition: Imports double hoursWorked and double hourlyPay
   //postcondition: Returns the user's computed double grosspay
   public static double getGrossPay(double hourlyPay, double hoursWorked)
   {
      double grosspay;
      
      if (hoursWorked > 40)
      {
         grosspay = (hourlyPay * hoursWorked) + (hourlyPay * 1.5 * (hoursWorked - 40));
      }
      
      else
      {
         grosspay = hoursWorked * hourlyPay;
      }
      
      return grosspay;
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
   //method: output(double, double, double, double)
   //description: Method outputs final print statements
   //precondition: Method imports double hoursWorked, double hourlyWage, double grosspay
   //postcondition: Outputs results
   public static void output(double hourlyPay, double hoursWorked, double grossPay, double netPay)
   {
      System.out.println("\nHours worked: " + hoursWorked); 
      System.out.println("Hourly wage: $" + hourlyPay);
      System.out.println("Gross pay: $" + grossPay); 
      System.out.println("Net pay: $" + netPay);
   }
}
