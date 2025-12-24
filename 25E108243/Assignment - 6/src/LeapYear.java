//WAp to print the following statement for an input year 
import java.util.*;
public class LeapYear {

	public static int leapYear(int yr)
	{
		if (yr%4 == 0)
		{
			if (yr % 100 == 0)
			{
				if (yr%400 == 0)
					return 366;
				else
					return 365;
			}
			else
				return 366;
		}
		else
			return 365;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int y = sc.nextInt();
		if (leapYear(y) == 366)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
	}

}
