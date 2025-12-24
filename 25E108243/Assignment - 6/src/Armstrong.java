
public class Armstrong {
	static boolean isArmstrong(int n)
	{
		int c = 0,t = n,sum = 0,t1 = n;
//		while(n != 0)
//		{
//			c++;
//			n /= 10;
//		}
		while (t != 0)
		{
			sum += Math.pow(t % 10, countDigit(n));
			t /= 10;
		}
		if (sum == t1)
			return true;
		else
			return false;
	}
	
	static int countDigit(int n)
	{
		int c = 0;
		while(n != 0)
		{
			c++;
			n /= 10;
		}
		return c;
	}
	public static void main(String[] args)
	{
		int c = 0;
		System.out.println("Armstrong numbers are:");
		for (int i = 100;i <= 10000;i++)
		{
			if (isArmstrong(i))
			{
				System.out.println(i);
				c++;
			}
		}
		System.out.println("No. of Armstrong Numbers are: "+c);
	}
}
