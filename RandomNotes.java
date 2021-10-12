import java.util.*;

public class RandomNotes
{
   public static void main(String[] args)
   {
      double r;
      r = Math.random();   //generates a pseudorandom double over the range [0.0, 1.0)
      System.out.println(r);
      System.out.println();

      for(int i = 0; i < 5; i++)
         System.out.println(Math.random());
      System.out.println();

      //how can I change the range?
      r = Math.random() * 10;   //generates a pseudorandom double over the range [0.0, 1.0)
                                //then multiplies that by 10 for a range of [0.0, 10.0)
      System.out.println(r);

      for(int i = 0; i < 5; i++)
         System.out.println(Math.random() * 10);
      System.out.println();

      r = Math.random() * 5;     //generates a pseudorandom double over the range [0.0, 1.0)
                                 //then multiplies that by 5 for a range of [0.0, 5.0)
      System.out.println(r);
      System.out.println();
      //what if we want an integer?
      r = Math.random() * 10; //gives me a random [0.0, 10.0)
      int x = (int)r;   //casts the double value r into an int...truncates the decimal so we get
                        //an int value over [0, 10) which really means we get an int over [0, 9].
                        //Notice that's a set size of 10 values, (0, 1, 2, ..., 9)
      System.out.println(x);
      System.out.println();

      //So we can now get random integer values...but they all start at 0.
      //What if I want to get a random over [1, 10]?
      //x = (int)(Math.random() * 10); will get me a random integer from 0 through 9...
      //how bout if I just add 1 to that?
      x = (int)(Math.random() * 10) + 1;
      System.out.println(x);

      for(int i = 0; i < 5; i++)
      {
         x = (int)(Math.random() * 10) + 1;
         System.out.println(x);
      }    
      System.out.println();   
      //so we end up with a "formula" for getting random integers
      //(int)(Math.random() * setSize) + startValue

      //want a random integer from 5 - 20?
      //figure out the size of the set from which you are choosing
      //inclusive of the ends, 5 - 20 is a set of size 16 (not 15).
      //you want to start at 5 so you'll have a call like this

      x = (int)(Math.random() * 16) + 5;
      System.out.println(x);   
      System.out.println();   
      System.out.println();


      //so how might we use randoms?   
      Scanner in = new Scanner(System.in);

      x = (int)(Math.random() * 10) + 1; //generates a random int from 1 through 10
      System.out.println("Guess a number between 1 and 10");
      int y = in.nextInt();

      if(x == y)
      {
         System.out.println("Congrats. You guessed the number.");
      }
      else
      {
         System.out.println("The number was " + x + ". You guessed " + y + ". You lose.");
      }
      System.out.println();
      System.out.println();
      System.out.println();

      int flip;
      int count = 0;
      for(int i = 0; i < 1000; i++)
      {
         flip = (int)(Math.random() * 2);
         if(flip == 0)
            count++;
      }
      double odds = (double)count / 1000;
      System.out.println("You flipped heads " + count + " times for a probability of " + odds);
   }
}