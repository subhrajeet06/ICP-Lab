import java.util.*;
public class Prog2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int yr = sc.nextInt();
		boolean res = false;
		if (yr%4 == 0)
				{
			if (yr % 100 == 0)
			{
				if (yr%400 == 0)
					res = true;
				else
					res = false;
			}
			else
				res = true;
				}
		else
			res = false;
		if (res)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");

	}

}
