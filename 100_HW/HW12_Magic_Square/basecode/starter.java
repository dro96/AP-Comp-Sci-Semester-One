import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many  magic squared do u want");	
		int x = sc.nextInt();
		sc.nextLine();
		CVMath.findSpecial(x);
	}
}
