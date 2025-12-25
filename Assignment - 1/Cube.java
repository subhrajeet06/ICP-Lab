import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//TSA = 4a^3
		//LSA = 6a^3
		//Volume = a^3
		System.out.println("Enter the length of side of cube: ");
		double a = sc.nextFloat();
		double tsa = 4 * Math.pow(a, 3);
		double lsa = 6 * Math.pow(a, 3);
		double vol = Math.pow(a,3);
		System.out.println("Volume of Cube = "+vol);
		System.out.println("Total Surface Area of Cube = "+tsa);
		System.out.println("Lateral Surface Area of Cube = "+lsa);

	}

}
