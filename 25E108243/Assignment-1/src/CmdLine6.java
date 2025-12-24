
public class CmdLine6 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		//int min = (int)Math.min(a,b);
		int min = (int)Math.min((int)Math.min(a, b), c);
		//int max = (int)Math.max(a, b);
		int max =  (int)Math.max((int)Math.max(a, b),c);
		int med = (a+b+c) - (min + max);
		System.out.println("Ascending order: "+min+" < "+med+" < "+max);
	}

}
