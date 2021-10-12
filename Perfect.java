/*Made by: Jessica
Date: 5/31/21
Description: This program finds the first three perfect numbers from 1-1000*/

public class Perfect
{
   public static void main(String [] args)
   {
      int add = 0, perfect;
      System.out.println("The perfect numbers from 1-1000 are: ");
      for(int c = 1; c <= 1000; c++)
      {
         for(int i = 1; i <= c; i++)
         {
            if ((int)((double)c%i) == 0)
            {
               add += i;
            }
         }
         add -= c;
         if (add == c)
            System.out.print(add + " ");
         add = 0;
         
      }
      
   }
}