//Made by: Jessica
//Date: 2/11/21
//Description: This programs asks for the user to input the length, width, and height of a room as well as windows and doors to output the number of paint
//gallons the user must buy.
import java.util.Scanner;
public class GallonsofpaintOG
{
   public static void main(String [] args)
   {
      int length, width, height, windows, doors;
      double calc;
      length = getLength();
      width = getWidth();
      height = getHeight();
      windows = getWindows();
      doors = getDoors();
      calc = getCalc(length,width,height,windows,doors);
      output(calc);
   }
   
//******************************************************
//method: getLength()
//description: This method asks for the user to input the length of the room in order to return the int length
//precondition: Scanner imported
//postcondition: Returns int length
   public static int getLength()
   {
      int length;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the length of the room: ");
      length = input.nextInt();
      return length;
   }
   
//******************************************************
//method: getWidth()
//description: This method asks for the user to input the width of the room in order to return the int width
//precondition: Scanner imported
//postcondition: Returns int width
   public static int getWidth()
   {
      int width;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the width of the room: ");
      width = input.nextInt();
      return width;
   }
//******************************************************
//method: getHeight()
//description: This method asks for the user to input the height of the room in order to return the int height
//precondition: Scanner imported
//postcondition: Returns int height
   public static int getHeight()
   {
      int height;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the height of the room: ");
      height = input.nextInt();
      return height;
   }
//******************************************************
//method: getWindows() room in order to return int windows
//precondition: Scanner imported
//postcondition: Returns int windows
   public static int getWindows()
   {
      int windows;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the number of windows in the room: ");
      windows = input.nextInt();
      return windows;
   }
//******************************************************
//method: getDoors()
//description: This method asks for the user to input the number of doors in the room in order to return int doors
//precondition: Scanner imported
//postcondition: Returns int doors
   public static int getDoors()
   {
      int doors;
      Scanner input = new Scanner (System.in);
      System.out.print("Enter the number of doors in the room: ");
      doors = input.nextInt();
      return doors;
   }
//******************************************************
//method: getCalc(double length, int width, int height, int windows, int doors)
//description: This method calcualtes how many gallons of paint will be needed to paint a room by importing
//double length, int width, int height, int windows, and int doors
//precondition: Imports double length, int width, int height, int windows, int doors
//postcondition: Returns double calc
   public static double getCalc(double length, int width, int height, int windows,int doors)
   {
      double calc;
      calc = ((2 * length * height) + (2 * width * height) - ((windows * 15) + (doors * 21)))/ 400;
      return calc;
   }
//******************************************************
//method: output(double calc)
//description: This method outputs the results
//precondition: Imports calc
//postcondition: Display
   public static void output(double calc)
   {
      System.out.println("\nThe room will take " + calc + " gallon(s) of paint");
      System.out.println("You will need " + Math.ceil(calc) + " gallon(s) of paint");
   }
}