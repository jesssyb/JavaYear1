public class PrimitiveTypes
{
	public static void main(String[] args)
	{
		//integer examples
		int a, b, c = 24;
		a = 13;
		b = a - c;
		System.out.println("a = " + a + "   b = " + b + "   c = " + c);
		System.out.println(a + " - " + c + " * " + b + " = " + (a - c * b));
		System.out.println();
		
		double x, y = 5, z = 12.34;
		System.out.println("y = " + y + "  z = " + z);
		System.out.println();

		//implicit typecasting
		x = y * 2;
		System.out.println(y + " * " + 2 + " = " + x);

		x = y * a;
		System.out.println(y + " * " + a + " = " + x);
		System.out.println();
		
		//explicit typecasting
		a = (int)x + b;
		System.out.println("a = " + a);
		x = 2.5;
		b = 4;
		a = (int)(x * b);
		System.out.println(x + " * " + b + " = " + a);
		System.out.println();
		
		//integer division
		a = 13;
		b = 5;
		c = a / b;
		int d = a % b;
		System.out.println(a + " / " + b + " = " + c + " remainder " + d);
		c = b / a;
		d = b % a;
		System.out.println(b + " / " + a + " = " + c + " remainder " + d);
		System.out.println();	
		
		//characters
		char l, m, n, p;
		l = 'l';
		m = 'q';
		n = '*';
		p = '8';
		System.out.println("" + l + m + n + p);
		System.out.println();
		
		//escape character
		char line = 'n';
		System.out.println("the primary meaning of " + line + " is this.");
		line = '\n';
		System.out.println("the secondary meaning of " + line + " is this.");
		System.out.println();
		
		//boolean type
		boolean result, answer = false;
		System.out.println("answer is " + answer);
		a = 7;
		result = a < 10;
		System.out.println(result);
		System.out.println();
		
		//output examples		
		System.out.println("this is a println statement.");
		System.out.println("this is a continuation of that statement");
		System.out.println();
		System.out.print("this is a print statement");
		System.out.println("this is the continuation of that statement");
		System.out.println();
		System.out.println("this line is just too damn long for the screen and it goes right off the edge");
		System.out.println();
		System.out.print("this line is just too damn long for the screen ");
		System.out.println("and it goes right off the edge");
		System.out.println();
		System.out.println("this line is just too damn long for the " +
								 "screen and it goes right off the edge");
		System.out.println();
		System.out.println("this line is just too damn long for the");
		System.out.println("screen and it goes right off the edge");
		System.out.println();
		System.out.println("this line is just too damn long for the\nscreen and it goes right off the edge");
		System.out.println();
		System.out.println("This is \n" +
		                   "an artificially long \n" +
								 "line of output \n" +
								 "that I want formatted \n" +
								 "so it is split up \n" +
								 "into several lines \n" +
								 "of output.");
	}
}