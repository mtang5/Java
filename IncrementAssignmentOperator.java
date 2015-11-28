package lesson1;

public class IncrementAssignmentOperator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 10;
		x++; // x = x + 1;
		
		System.out.println(x); 
		System.out.println(x++); // x++; x here change after the print
		System.out.println(x);
		System.out.println(++x); // x increase before print
		
		x += 5; // x = x + 5
		System.out.println(x);
		
		x *= 5; // x = x * 5
		System.out.println(x);
		
		x /= 5; // x = x / 5
		System.out.println(x);
	}

}
