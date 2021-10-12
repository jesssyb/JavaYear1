import java.util.Scanner;

public class CircleWithUserInput
{
   public static void main(String [] args)
   {
      double radius, pi, area;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the radius: ");
      radius = input.nextDouble();
      pi = 3.14;
      
      area = pi * (radius * radius);
      System.out.println("The area of the circle is " + area + " centimeters squared");
      }
}