package lesson;

public class ForLoop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] myintarray = {100, 31, 26, 48, 52};
		
		//for( init, expression, increment)
		for(int index = 0; index < 5; index++)
		{
			System.out.println(myintarray[index]);
		}
		
		/*for(int element : myintarray)// go array one by one and store value of array in "element
		{
			System.out.println(element);
		}*/
	}

}
