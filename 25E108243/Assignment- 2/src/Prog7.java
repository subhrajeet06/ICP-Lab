import java.util.*;
public class Prog7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(a+"\t"+ ++a+"\t"+(int)Math.pow(--a, ++a));
		System.out.println(a+"\t"+ ++a+"\t"+(int)Math.pow(--a, ++a));
		System.out.println(a+"\t"+ ++a+"\t"+(int)Math.pow(--a, ++a));
		System.out.println(a+"\t"+ ++a+"\t"+(int)Math.pow(--a, ++a));
		System.out.println(a+"\t"+ ++a+"\t"+(int)Math.pow(--a, ++a));
	}

}
