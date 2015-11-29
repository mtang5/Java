package lesson1;

public class LogicalOperators 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int subject1 = 40;
		// int subject2 = 60;
		int subject2 = 20;
		// && -> and operator
		// || -> or operator
		
		if( (subject1 >= 35) && (subject2 >= 35) )
		{
			System.out.println("the condition is true");
		}
		else
		{
			System.out.println("the condition is false");
		}
		
		int subject3 = 20;
		int subject4 = 60;
		
		if( (subject3 >= 35) || (subject4 >= 35) ) // if at least one is true
		{
			System.out.println("the condition is true");
		}
		else // if both is false
		{
			System.out.println("the condition is false");
		}
	}

}
