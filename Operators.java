package lesson1;

public class Operators 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x, y, answer, answer2, answer3, answer4, answer6;
		x = 20; 
		y = 30;
		double a, b, answer5;
		a = 70;
		b = 30;
		
		answer = x + y;
		answer2 = x - y;
		answer3 = x * y;
		answer4 = x / y; // 20/30 is 1.67
		answer5 = a / b;
		answer6 = y % x;

		System.out.println("Answer = " + answer); // print out "Answer = 50"
		System.out.println("Answer2 = " + answer2); // print out "Answer = -10"
		System.out.println("Answer3 = " + answer3); // print out "Answer = 600"
		System.out.println("Answer4 = " + answer4); // print out "Answer = 0" because answer4 is int type
		System.out.println("Answer5 = " + answer5); // print out "Answer = 2.33333335"
		System.out.println("Answer6 = " + answer6); // print out "Answer = 10"
	}

}
