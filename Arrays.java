package lesson;

public class Arrays 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// int[] myintarray = {1,3,2,4,5};
		int[] myintarray = {100, 31, 26, 48, 52};
		// int myintarray2[] = {1,2,3,4,5}; non prfer way of declaring array
		/*
		int[] myIntArray = new int[3]; other way of declaring array
		int[] myIntArray = {1,2,3};
		int[] myintArray = new int[]{1,2,3};
		*/
		// System.out.println(myintarray[3]);// print index 3 ie. 4
		System.out.println(myintarray[0]);
		
		System.out.println("----------------------");
		
		int index = 0;
		while(index < 5) // if put 6, error will appear
		{
			System.out.println(myintarray[index]);
			index++;
		}
		
	}

}
