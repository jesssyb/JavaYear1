/*Made by: Jessica
Date: 2/7/21
Description: This program asks for the user to input a number in order to output the calculated and swaped ones and tens place from the inputted number*/

import java.util.Scanner;
public class MixItUp

{
   public static void main(String [] args)
   {
      int num, calculateNum;
      
      num = getNum();
      calculateNum = calculateNum(num);
      display(num,calculateNum); 
   }
   
   //******************************************************
   //method: getNum()
   //description: This method asks for the user to input a number to return back the the variable num
   //precondition: Scanner method imported
   //postcondition: Returns int num
   public static int getNum()
   {
      int num;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter: ");
      num = input.nextInt();
      return num;
   }
   
   //******************************************************
   //method: calculateNum(int num)
   //description: This method computes and swaps the ones and tens places
   //precondition: Variable int num is imported
   //postcondition: Returns int calculateNum
   public static int calculateNum(int num)
   {
      int calculateNum;
      calculateNum = ((num/100)*100)+(((num%10)*10) + ((num%100)/10));
      return calculateNum;
   }
   
   //******************************************************
   //method: display(int num, int calculateNum)
   //description: This method displays the results
   //precondition: Int num and int calculateNum are imported
   //postcondition: Prints results
   public static void display(int num, int calculateNum)
   {
      System.out.print(num + " with the ones and tens swapped is: " + calculateNum);
   }
}