import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//vol = 4/3 pi r^3
		//tsa = 4*pi*r^2
		System.out.println("Enter the radius of Sphere: ");
		double r = sc.nextDouble();
		double vol = (4.0/3) * Math.PI * r * r;
		double sa = 4 * Math.PI * r * r;
		System.out.println("Volume of Spere = "+vol);
		System.out.println("Surface Area of Sphere = "+sa);
	}

}
