
public class Prog5 {

	public static void main(String[] args) {
		float x = Float.parseFloat(args[0]);
		float y = Float.parseFloat(args[1]);
		float z = Float.parseFloat(args[2]);
		boolean res = ((x > y) && (y > z)) || ((x<y) && (y < z));
		System.out.println("Strict order check "+x+" "+y+" "+z+" ----> "+res);

	}

}
