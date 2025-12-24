
public class CmdLine2 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int res = (int)Math.pow(a, b);
		int res2 = (int)Math.pow(c, d);
		System.out.println("Power Calculation "+a+" "+b+" = "+res);
		System.out.println("Power Calculation "+c+" "+d+" = "+res2);

	}

}
