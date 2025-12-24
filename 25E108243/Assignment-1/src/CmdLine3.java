
public class CmdLine3 {

	public static void main(String[] args) {
		char a = args[0].charAt(0);
		char b = args[1].charAt(0);
		char c = args[2].charAt(0);
		int res1 = (int)a;
		int res2 = (int)b;
		int res3 = (int)c;
		System.out.println("ASCII value of "+a+" is "+res1);
		System.out.println("ASCII value of "+b+" is "+res2);
		System.out.println("ASCII value of "+c+" is "+res3);

	}

}
