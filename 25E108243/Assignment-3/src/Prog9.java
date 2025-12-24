import java.util.*;
public class Prog9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int c = rd.nextInt(9)+1;
		//System.out.println(c);
		if (n == c)
			System.out.println("You got it right!!");
		else if(Math.abs(n-c) == 1)
			System.out.println("Almost nearer");
		else
			System.out.println("Wrong");

	}

}
