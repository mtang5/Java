package lesson1;

public class IfElseAndRelationalOperators
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * == equal to
		 * != not equal to
		 * > greater than
		 * < less than
		 * >= greater than or equal to
		 * <= less than or equal to
		 */
		int x;
		x = 10;
		
		if (x == 20)
		{
			System.out.println("X is equal to 20");
			
		}
		
		else if (x == 15)
		{
			System.out.println("X is equal to 15");	
		
		}
		
		else
		{
			System.out.println("X is equal to 10"); // != is not equal
		}
		
		int y = 10;
		
		if(y != 20)
		{
			System.out.println("yes y == 10");
		}
		else
		{
			System.out.println("no y != 10");
		}
		
	}

}
