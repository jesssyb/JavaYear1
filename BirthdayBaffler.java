//Made by: Jessica
//Date: 3/19/21
//Description: This program asks for the user to enter their birth month, day, and year in order to compute the day the person was born on


/*UPDATED 4/13/21 to fix doc problem and leap year calculation*/


import java.util.Scanner;

public class BirthdayBaffler
{
   public static void main(String [] args)
   {
      int month, day, year, calc;
      boolean leapYear, centuryYear;
      String dayOfWeek;
      
      month = getMonth();
      day = getDay();
      year = getYear();
      centuryYear = getCenturyYear(year);
      System.out.println(centuryYear);
      leapYear = getLeapYear(year,centuryYear);
      month = convertMonth(month,leapYear);
      calc = getCalc(month, day, year);
      dayOfWeek = getDayOfWeek(calc);
      output(dayOfWeek);
   }
   
   //******************************************************
   //method: getMonth()
   //description: This method asks the user to input their birth month
   //precondition: Scanner method imported
   //postcondition: Returns int month
   public static int getMonth()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the month you were born: ");
      int month = input.nextInt();
      return month;  
   }
   
   //******************************************************
   //method: getDay()
   //description: This method asks the user to input their birth day
   //precondition: Scanner method imported
   //postcondition: Returns int day
   public static int getDay()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the day you were born: ");
      int day = input.nextInt();
      return day;
   }
   
   //******************************************************
   //method: getYear()
   //description: This method asks the user to input their birth year
   //precondition: Scanner method imported
   //postcondition: Returns int year
   public static int getYear()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the year you were born: ");
      int year = input.nextInt();
      return year;
   }
   
   public static boolean getCenturyYear(double year)
   {  
      boolean centuryYear;
      
      if ((Math.floor(year/100)) < (year/100))
         centuryYear = false;     
      else
         centuryYear = true;
      return centuryYear;
   }
   
  public static boolean getLeapYear(double year, boolean centuryYear)
   {
      boolean leapYear;
      
      if ((centuryYear == true && Math.floor(year/400) < (year/400)) || (centuryYear == false && Math.floor(year/4) < (year/4)))
         leapYear = false;
      else
         leapYear = true;
      
      return leapYear;
       
   }
   
   public static int convertMonth(int month, boolean leapYear)
   {
           
         switch(month)
         {
            case 3:
            case 11: month = 4;
               break;
            case 4:
            case 7: month = 0;
               break;
            case 5: month = 2;
               break;
            case 6: month = 5; 
               break;
            case 8: month = 3;
               break;
            case 9:
            case 12: month = 6;
               break;
            case 1:
               if (leapYear == true)
                  month = 0;
               else
                  month = 1;
               break;
            case 10: month = 1;
               break;
            case 2:
               if (leapYear == true)
                  month = 3;
               else
                  month = 4;
               break;
             
         }
     return month; 
   }
   
   public static int getCalc(int month, int day, int year)
   {
      int calc = ((year-1900) + ((year - 1900)/4)+ day + month) % 7;
      return calc;
   }
   
   public static String getDayOfWeek(int calc)
   {
      String dayOfWeek = new String ("null");
      switch(calc)
      {
         
         
         case 0: dayOfWeek = "Saturday";
            break;
         case 1: dayOfWeek = "Sunday";
            break;
         case 2: dayOfWeek = "Monday";
            break;
         case 3: dayOfWeek = "Tuesday";
            break;
         case 4: dayOfWeek = "Wednesday";
            break;
         case 5: dayOfWeek = "Thursday";
            break;
         case 6: dayOfWeek = "Friday";
            break;
         
         
      }
      return dayOfWeek;
   }
   
   public static void output(String dayOfWeek)
   {
      System.out.println("\nYou were born on " + dayOfWeek);
   }
}