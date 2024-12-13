
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y, a, b, c, d, e; double x2, y2;
		System.out.println("Please enter an integer: ");
		x = sc.nextInt();
		System.out.println("Please enter another another integer (bigger than the first) :");
		y = sc.nextInt();
		System.out.println("Your range is " + x + "to " + y);
		System.out.println("Here are five numbers in that range");
		a = (int)(Math.random()*(y - x) + x);
		b = (int)(Math.random()*(y - x) + x);
		c = (int)(Math.random()*(y - x) + x);
		d = (int)(Math.random()*(y - x) + x);
		e = (int)(Math.random()*(y - x) + x);
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
		
	}
}
