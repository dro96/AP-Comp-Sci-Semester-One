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
		y = 0;
		x = ((int)(Math.random()*999)+1);
		System.out.println("This is a guessing game between numbers 1 and 1000/n guess until you get the right number");

		while(y != x){
			System.out.println("Enter guess here: ");
			y = sc.nextInt();
			if(y != x){
				System.out.println("wrong try again");
			}
			
		}
		System.out.println("Congrats you got it");
		return;



		
	}
}
