
public class CmdLine1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//int c = Integer.parseInt(args[3]);
		boolean res = ((a%b) == 0) || ((b%a) == 0);
		System.out.println("Evenly divides "+a+" "+b+" ---> "+res);

	}

}
