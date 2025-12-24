import java.util.*;
public class Demo {

	public static void input(int arr[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int l = sc.nextInt();
		int arr[] = new int[l];
		input(arr);
		//int max = arr[0];
		for (int i = 0;i < arr.length;i++)
		{
			int c = count(arr[i]);
		}
		System.out.println(c);
		//System.out.print("Maximum value = "+max(arr));
		/**int sum = sum(arr);
		double avg = (double)sum/(arr.length+1);
		System.out.println();
		System.out.println("Average = "+avg);
		System.out.println("Sum = "+sum(arr));**/
	}
	
	//Find sum and average
	public static int sum(int arr[])
	{
		int sum = 0;
		for (int i = 0;i < arr.length;i++)
		sum += arr[i];
		return sum;
	}
	
	//Find maximum number among the array
	public static int max(int arr[])
	{
		int max = arr[0];
		for (int i = 0;i < arr.length;i++)
		if (arr[i] > max)
			max = arr[i];
		return max;
	}
	
	
	//Prime number
	public static boolean isPrime(int x)
	{
		boolean flag = true;
		for (int i = 1;i <= x/2;i++)
		{
			if (x % i  == 0)
				flag = false;
		}
		if (flag == true)
			return true;
		else
			return false;
	}
	
	//Count Prime
	public static int count(int n)
	{
		int c = 0;
		for (int i = 1;i <= n;i++)
		if (isPrime(n))
			c++;
		return c;
	}

}
