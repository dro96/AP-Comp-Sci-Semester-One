/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("give me an integer");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println("give me another integer");
		y = sc.nextInt();
		
		if( x != y){
			System.out.println("x and y r diffrent");
		}
		if( x == y){
			System.out.println("x and y r equal");
		}
	}
}
