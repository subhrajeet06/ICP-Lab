import java.util.Scanner;
public class Cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//vol = pi * r^2 * h
		//tsa = 2*pi*r(h+r)
		//lsa = 2*pi*r*h
		System.out.println("Enter the radius of Cylinder: ");
		double r = sc.nextDouble();
		System.out.println("Enter the height of Cylinder: ");
		double h = sc.nextDouble();
		double vol = Math.PI * r * r * h;
		double tsa = 2 * Math.PI * r * (h + r);
		double lsa = 2 * Math.PI * r * h;
		System.out.println("Volume of Cylinder = "+vol);
		System.out.println("Total Surface Area of Cylinder = "+tsa);
		System.out.println("Lateral Surface Area of Cylinder = "+lsa);

	}

}
