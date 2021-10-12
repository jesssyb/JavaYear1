/*Made by: Jessica
Date: 5/31/21
Description: This program asks the user to input a number 1-1000, up to a maxium of 10 times (unless guess correctly),
in order to try guess the right randomly generated number*/
import java.util.Scanner;
public class GuessingGame
{
   public static void main(String [] args)
   {
      int guess;
      Scanner input = new Scanner(System.in);
      int num = (int)(Math.random() * 1000) + 1;
      System.out.println(num);
      for(int c = 0; c < 10; c++)
      {
         
         do
         {
         System.out.print("Enter a guess from 1-1000: ");
         guess = input.nextInt();
         if (guess <= 0)
         {
            System.out.println("Invalid, enter a number 1-1000");
         }
         
         if (guess == num)
         {   
            System.out.println("NICE! You correctly guessed " + num + " as the correct number!");
            c = 10;
            break;
         }
         
         if(c == 9 && guess != num)
         {
            System.out.println("Sorry! You didn't correctly guess the number. The number was: " + num);
         }
         }while(guess <= 0);        
         
      } 
   }
}