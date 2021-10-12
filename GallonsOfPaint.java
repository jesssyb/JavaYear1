//Made by: Jessica
//Date: 2/11/21
//Description: This programs asks for the user to input the length, width, and height of a room as well as windows and doors to output the number of paint 
//gallons the user must buy. 
import java.util.Scanner;

public class GallonsOfPaint
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
      String name = "length";
      length = errorCheckDimensions(name);
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
      String name = "width";
      width = errorCheckDimensions(name);
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
      String name = "height";
      height = errorCheckDimensions(name);
      return height;
   }
   
   //******************************************************
   //method: getWindows()
   //description: This method asks for the user to input the number of windows in the room in order to return int windows
   //precondition: Scanner imported
   //postcondition: Returns int windows
   public static int getWindows()
   {
      int windows;
      String name = "windows";
      windows = errorCheckWindowsDoors(name);
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
      String name = "doors";
      doors = errorCheckWindowsDoors(name);
      return doors;
   }
   
   //******************************************************
   //method: getCalc(double length, int width, int height, int windows, int doors)
   //description: This method calcualtes how many gallons of paint will be needed to paint a room by importing 
   //             double length, int width, int height, int windows, and int doors
   //precondition: Imports double length, int width, int height, int windows, int doors
   //postcondition: Returns double calc
   public static double getCalc(double length, int width, int height, int windows, int doors)
   {
      double calc;
      calc =  ((2 * length * height) + (2 * width * height) - ((windows * 15) + (doors * 21)))/ 400;
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
   
   //******************************************************
   //method: errorCheckDimensions(String name) 
   //description: This method checks the input for the dimensions to make sure it is logically correct
   //precondition: Imports String name
   //postcondition: returns item
   public static int errorCheckDimensions(String name)
   {
      int item;
      Scanner input = new Scanner (System.in);
      do
      { 
         System.out.print("Enter the " + name + " of the room: ");
         item = input.nextInt();
         if(item <= 0)
         {
            System.out.println("Invalid, please input a number greater than 0");
         }
      }while(item <= 0);
      return item;    
   }
   
   //******************************************************
   //method: errorCheckWindowsDoors(String name) 
   //description: This method checks the input for the windows and doors to make sure it is logically correct
   //precondition: Imports String name
   //postcondition: returns item
   public static int errorCheckWindowsDoors(String name)
   {
      int item;
      Scanner input = new Scanner (System.in);
      do
      { 
         System.out.print("Enter the number of " + name + " in the room: ");
         item = input.nextInt();
         if(item < 0)
         {
            System.out.println("Invalid, please input a number greater than or equal to 0");
         }
      }while(item < 0);
      return item; 
   }
}
