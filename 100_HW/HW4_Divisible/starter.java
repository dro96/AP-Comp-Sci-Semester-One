/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Give me an integer");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println("Give me another integer");
		y = sc.nextInt();
		sc.nextLine();
		if(x % 2 == 0){
			System.out.println(x + " is an even integer");
		}
		else{
			System.out.println(x + " is an odd integer");
		}
		if(y % 2 == 0){
			System.out.println(y + " is an even integer");
		}
		else{
			System.out.println(y + " is an odd integer");
		}
		if(x % 3 == 0 && x % 4 == 0 && x % 5 == 0){
			System.out.println(x + " is divisable by 3, 4, and 5,");
		}
		else{
			System.out.println(x + " is not divisable by 3, 4, and 5");
		}
		if(y % 3 == 0 && y % 4 == 0 && y % 5 == 0){
			System.out.println(y + " is divisable by 3, 4, and 5,");
		}
		else{
			System.out.println(y + " is not divisable by 3, 4, and 5");
		}
	}
}
