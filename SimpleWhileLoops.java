/*Made by Jessica
Date: 4/13/21
Description: This program has an assortment of while loops that are computed and displayed*/

public class SimpleWhileLoops
{
   public static void main(String [] args)
   {
      twoToHundred();
      numAndSqrt();
      countToFifty();
      countToFiftyWithSOPs();
   }
   
   //******************************************************
   //method: twoToHundred()
   //description: This method calculates if num is divisible by 2, if it is it outputs num up until 100
   //precondition: varible int num initialized
   //postcondition: outputs int num
   public static void twoToHundred()
   {
      int num = 1;
      System.out.println("All even numbers 2 to 100: \n");
      while(num <= 100)
      {
         if(num % 2 == 0)
         {
            System.out.println(num);
         }
         num++;
      }
   }
   
   //******************************************************
   //method: numAndSqrt()
   //description: This method outputs int num and int num to the power of 2 twenty times
   //precondition: varible int num initialized
   //postcondition: outputs int num and int num to the power of 2
   public static void numAndSqrt()
   {
      int num = 1;
      while (num <= 20)
      {
         System.out.println("\nInteger value: " + num + ", Integer value squared: " + Math.pow(num,2));
         num++;
      }
      
   }
   
   //******************************************************
   //method: countToFifty()
   //description: This method outputs the sum of 1 to 50
   //precondition: varible int num  and int count initialized
   //postcondition: outputs sum of 1 to 50
   public static void countToFifty()
   {
      int num = 0;
      int count = 0;
      while (count < 50)
      {
         count++;
         num += count;
      }
      System.out.println("\nThe sum of 1 to 50 is: " + num + "\n");
      
   }
   
   //******************************************************
   //method: countToFiftyWithSOPs()
   //description: This method outputs the total sum accumulated with the numbers that make up that sum 50 times
   //precondition: varible int num, int count, and int sum initialized
   //postcondition: outputs total accumulated sum and all numbers that make up the sum
   public static void countToFiftyWithSOPs()
   {
      int num = 0, count = 0, sum = 0;
      
      while (count < 50)
      {
         count++;
         num += count;
         System.out.print(num + " is the sum of ");
         while (sum <= count)
         {
            if (sum == count)
            {
               System.out.print("and " + sum);
            }
            else
            {
               System.out.print(sum + ", ");
               
            }
            sum++;
         }
         
         System.out.println();
         sum -= sum;
      }
      
   }

}