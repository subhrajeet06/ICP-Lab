import java.util.Scanner;
public class Cuboid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//vol = lbh
		//tsa = 2(lb+bh+hl)
		//lsa = 2h(l+b)
		System.out.println("Enter the length of Cuboid: ");
		float l = sc.nextFloat();
		System.out.println("Enter ther breadth of Cuboid: ");
		float b = sc.nextFloat();
		System.out.println("Enter the height of Cuboid: ");
		float h = sc.nextFloat();
		float vol = l * b * h;
		float tsa = 2 * ((l*b) + (b*h) + (h*l));
		float lsa = 2*h * (l + b);
		System.out.println("Volume of Cuboid = "+vol);
		System.out.println("Total Surface Area of Cuboid = "+tsa);
		System.out.println("Lateral Surface Area of Cuboid = "+lsa);

	}

}
