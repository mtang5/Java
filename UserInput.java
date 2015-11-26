package lesson1;

import java.util.Scanner; // import scanner class. allow scanner usage

public class MyClass 
{
	/*
	 * commen
	 */
	
	public static void main(String[] args) 
	{
		int my_variable = 10;
		short my_short_variable = 15;
		float my_decimal = (float)4.5; // typecast double to float
		double my_double = 11.56;
		char my_char = 'A';
		boolean is_true = false;
		
		 
		
		// TODO Auto-generated method stub
		System.out.println("Hello Youtube");
		System.out.println(my_variable);
		System.out.println(my_short_variable);
		System.out.println(my_decimal);
		System.out.println(my_double);
		System.out.println(my_char); 
		System.out.println(is_true);	
		
		Scanner scan = new Scanner(System.in); // set up scanner that take user in. red line is because need class
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
				
		System.out.println("The entered value is");
		System.out.print(user_input_number);
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some decimal value");
		double user_input_double = scan1.nextDouble();
		
		System.out.println("The entered value is");
		System.out.print(user_input_double);
		
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter some String");
		String user_input_String = scan3.nextLine();
		
		System.out.println("The entered value is");
		System.out.print(user_input_String);
		
		// nextFloat, boolean, decimal, byte, etc.
	}

}
