/*Made by Jessica
Date: 1/28/21
Description: This program asks the user to input their height in inches and weight in pounds to compute and output the user's BMI. */

import java.util.Scanner;

public class BMIwithMethods
{
   public static void main(String [] args)
   {
      double weightInPounds, heightInInches, BMI;
      
      weightInPounds = getPounds();
      heightInInches = getInches();
      BMI = getBMI(weightInPounds,heightInInches);
      display(BMI);
   }
      
   public static double getPounds()
   {
      Scanner input = new Scanner (System.in);
      double weightInPounds;
      System.out.print("Enter your weight in pounds: ");
      weightInPounds = input.nextDouble();
      return weightInPounds;
   }
   
   public static double getInches()
   {
      Scanner input = new Scanner (System.in);
      double heightInInches;
      System.out.print("Enter your height in inches: ");
      heightInInches = input.nextDouble();
      return heightInInches;
   }
   
   public static double getBMI(double weightInPounds, double heightInInches)
   {
      double BMI;
      BMI = (weightInPounds/(heightInInches*heightInInches)) * 703;
      return BMI;
   }
   
   public static void display(double BMI)
   {
      System.out.print("Your BMI is: " + BMI);
   }      
}

