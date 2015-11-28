package lesson1;

public class SwitchStatements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int score = 90;
		// bye, short, int or char
		
		switch(score)
		{
		case 100 : // if no break, goes to evaluate current and go to next case and do that one w/ break officially			
		case 90:
			System.out.println("Very good");
			break;
		case 60:
			System.out.println("Good");
			break;
		case 40:
			System.out.println("Ok");
			break;
		default :
			System.out.println("The grades are not defined");
			break;
		}
	}

}
