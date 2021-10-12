/*Made by: Jessica
Date: 2/25/21
Description: This program asks the user to input a selection of either the area or circumfrence of the circle, then
prompts the user to enter radius length to return and output the answer*/

import java.util.Scanner;

public class CircleWithIfStatements
{
   public static void main(String[] args)
   {
      int selection = getSelection();
      
      double radius = getRadius();
      
      if (selection == 1)
      {
         double area = getArea(radius);
         System.out.print("The area of the circle is: " + area + " centimeters squared");
      }
      
      else if (selection == 2)
      {
         double circumference = getCircumference(radius);
         System.out.print("The circumference of the circle is: " + circumference + " centimeters");
      }
      
      else
      {
         System.out.print("Invalid, number inputted for selection not 1 or 2");
      }
   }
   
   //******************************************************
   //method: getSelection()
   //description: Method prompts for the user to input the selection
   //precondition: Imports Scanner
   //postcondition: Returns selection
   public static int getSelection()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Please make the selection of 1 for Area or 2 for Circumference: ");
      int selection = input.nextInt();
      return selection;
   }
   
   //******************************************************
   //method: getRadius()
   //description: Method prompts for the user to input the length of the radius
   //precondition: Imports Scanner
   //postcondition: Returns radius
   public static double getRadius()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Input radius length: ");
      double radius = input.nextDouble();
      return radius;
   }
   
   //******************************************************
   //method: getArea(double)
   //description: Method imports double radius then computes and returns the area
   //precondition: Imports double radius
   //postcondition: Returns computed double area to variable area
   public static double getArea(double radius)
   {
      return Math.PI * (radius * radius);
   }
   
   //******************************************************
   //method: getCircumference(double)
   //description: Method imports double radius then computes and returns the circumference
   //precondition: Imports double radius
   //postcondition: Returns computed double circumference to variable circumference
   public static double getCircumference(double radius)
   {
      return 2 * Math.PI * radius;
   }
}