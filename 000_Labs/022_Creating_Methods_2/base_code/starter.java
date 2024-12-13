import java.util.Scanner;
import java.util.Random;

class starter {
	 public static int pow(int x, int y) {
        int b;
        b = x-0;
        while(y > 1){
        	x = b*x;
        	y = y-1;
        }
        return x;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, c, p;
		System.out.println("Give me an integer you would like to add an exponent to");
		a = sc.nextInt();
		sc.nextLine();
		System.out.println("Give me another integer to serve as the exponent");
		c = sc.nextInt();
		sc.nextLine();
		p = pow(a,c);
		System.out.println(p);
		
		
		
		
		
	}
}
