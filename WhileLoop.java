package lesson1;

public class WhileLoop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0;
		
		while (a<10)
		{
			System.out.println(a);
			a++;
		}
		
		a=10;
		while(a>0) // could put >= to also print 0
		{
			System.out.println(a);
			a--;
		}
	}
}
