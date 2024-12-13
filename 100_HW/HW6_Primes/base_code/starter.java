/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int x){
		int a;
		if (x < 2){
			return false;
		}
		a = 2;
		while(x>a){
			if(x%a == 0){
				return false;
			}
			a = a+1;
		}
		return true;
		
	}
	public static void printPrime(int y){
		int q;
		q = 2;
		while(q < y){
			if(checkPrime(q) == true){
				System.out.println(q);
			}
			q = q+1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Give me an integer");
		i = sc.nextInt();
		sc.nextLine();
		printPrime(i);
		
		
		
	}
}
