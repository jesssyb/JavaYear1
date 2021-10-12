/*Made by: Jessica
Date: 5/31/21
Description: This program outputs 3 designs using for loops*/

public class Stars
{
   public static void main(String [] args)
   {
      System.out.println("Star 1: \n");
      starPattern1();
      System.out.println();
      System.out.println("Star 2: \n");
      starPattern2();
      System.out.println();
      System.out.println("Star 3: \n");
      starPattern3();
   }
   
   public static void starPattern1()
   {
      for(int c = 5; c > 0; c--)
      {
         for(int i = c; i > 1; i--)
         {
            System.out.print("*");
         }
         System.out.println("*");
      }
   }
   
   public static void starPattern2()
   {
      for(int c = 5; c > 0; c--)
      {
         for(int i = c; i > 1; i--)
         {
            System.out.print(" ");
         }
         
         for(int i = c; i < 5; i++)
         {
            System.out.print("*");
         }
         System.out.println("*");
          
      }

   }
   
   public static void starPattern3()
   {
      int num = 0;
      for(int c = 5; c > 0; c--)
      {
         for(int i = c; i > 1; i--)
         {
            System.out.print(" ");
         }
         
         for(int i = 0; i < num; i++)
         {
            System.out.print("*");
         }
         System.out.println("*");
         num += 2;
          
      }

   }
}