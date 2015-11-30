package lesson;

public class StringLesson 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String myString = "Hello World";
		
		System.out.println(myString);
		
		int myStringLength = myString.length();
		
		System.out.println(myStringLength);
		
		String myStringinLowerCase = myString.toLowerCase();
		
		System.out.println(myStringinLowerCase);
		
		String myStringinUpperCase = myString.toUpperCase();
		
		System.out.println(myStringinUpperCase);
		
		String myString2 = myString + " beautiful!!"; // == "Hello World" + " beautiful!!"
		
		System.out.println(myString2);
		
		System.out.println(myString.replace('e', 'a')); // .replace(oldChar, newChar)
		
		System.out.println(myString.indexOf('o')); // . indexOf(char). return -1 if no exist
	}

}
