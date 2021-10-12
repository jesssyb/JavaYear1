/*Made by Jessica
Date: 1/13/21
Description: This program asks the user to input their height in inches and weight in pounds to compute and output the user's BMI. */

import java.util.Scanner;

public class BMI
{
   public static void main(String [] args)
   {
      double weightInPounds, heightInInches, BMI;
      
      Scanner input = new Scanner (System.in);
      System.out.print("Enter your weight in pounds: ");
      weightInPounds = input.nextDouble();
      System.out.print("Enter your height in inches: ");
      heightInInches = input.nextDouble();
      
      BMI = (weightInPounds/(heightInInches*heightInInches)) * 703;
      System.out.print("Your BMI is: " + BMI);
      
   }
}

