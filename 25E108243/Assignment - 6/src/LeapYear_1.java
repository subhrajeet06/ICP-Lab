//import java.util.*;
public class LeapYear_1 {
	static boolean leapYear(int yr)
	{
		if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		for (int i = 2000;i <= 2020;i++)
		{
			if (leapYear(i))
				System.out.println(i+" has 366 days");
			else
				System.out.println(i+" has 365 days");
		}
	}
}
