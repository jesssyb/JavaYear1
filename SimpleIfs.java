import java.util.*;

public class SimpleIfs
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("how old are you?");
      int age = in.nextInt();
      System.out.println("how much cash you got?");
      double cash = in.nextDouble();
      
      System.out.println("the current movies are:\n" +
                         "1. Squidgy and Ploppy - rated G\n" +
                         "2. My Favorite Summer - rated PG\n" +
                         "3. The House Next Door -rated PG-13");                        
      if(age >= 17)
      {
         System.out.println("4. Come and Get Me - rated R"); 
      }
      System.out.println();
      
      System.out.println("You: Hello, I'd like a large popcorn, a large Coke...and some Junior Mints");
      System.out.println("Cashier: That'll be $17.50");
      if(cash < 17.5)
      {
         System.out.println("You: Ouch!, You'd better make that a small popcorn, small Coke, and nix the Mints");
      }
   }
}