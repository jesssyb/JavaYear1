/*Made by: Jessica
Date: 3/17/21
Description: This program asks for the user to input a year in order to compute and return whether or not it is or isn't a leap year or century year
(I added century year as part of the output to add some ~spice~)*/

import java.util.Scanner;

public class LeapYear
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Input a year: ");
      int year = input.nextInt();
      boolean centuryYear = getCenturyYear(year);
      boolean leapYear = getLeapYear(year,centuryYear);
      output(year,leapYear,centuryYear);
   }
   
   
   //******************************************************
   //method: getLeapYear(double)
   //description: This method determines if the inputted year is or isn't a century year
   //precondition: double year is imported
   //postcondition: Returns centuryYear
   public static boolean getCenturyYear(double year)
   {  
      boolean centuryYear;
      
      if ((Math.floor(year/100)) < (year/100))
         centuryYear = false;     
      else
         centuryYear = true;
      return centuryYear;
   }
   
   //******************************************************
   //method: getLeapYear(double,boolean)
   //description: This method determines if the inputted year is or isn't a leap year
   //precondition: double year and boolean centuryYear are imported
   //postcondition: Returns leapYear
   public static boolean getLeapYear(double year, boolean centuryYear)
   {
      boolean leapYear;
      
      if ((centuryYear == true && Math.floor(year/400) < (year/400)) || (centuryYear == false && Math.floor(year/4) < (year/4)))
         leapYear = false;
      else
         leapYear = true;
      
      return leapYear;
       
   }
   
   //******************************************************
   //method: output(int,boolean,boolean)
   //description: This method uses if/else to determine the output
   //precondition: int year, boolean leapYear, and boolean centuryYear are imported
   //postcondition: Prints output
   public static void output(int year, boolean leapYear, boolean centuryYear)
   {
      if (leapYear == true && centuryYear == true)
         System.out.println(year + " is a leap year and a century year");
      else if (leapYear == false && centuryYear == false)
         System.out.println(year + " is not a leap year or century year");
      else if (leapYear == true && centuryYear == false)
         System.out.println(year + " is a leap year but not a century year");
      else if (leapYear == false && centuryYear == true)
         System.out.println(year + " is not a leap year but is a century year");
      
   }
  
}