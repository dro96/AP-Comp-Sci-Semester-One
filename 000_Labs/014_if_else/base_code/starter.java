/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = (int)(Math.Random()*(999)+ 1);
		System.out.println("This is a number guessing game");
		System.out.println("Pick a number one to a thousand");
		y = sc.nextInt();
		if(y==x){
			System.out.println("You are correct, great job");
		}
		else{
			System.out.println("aww your wrong, better luck next time");
		}
}
}
