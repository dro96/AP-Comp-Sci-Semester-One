/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a phrase with three spaces");
		String phrase = sc.nextLine();
		int len = phrase.Length();
		int space = phrase.indexOf(" ");
		int space1 = phrase.indexOf(" ", space + 1);
		int space2 = phrase.indexOf(" ", space1 + 1);
		
		String x = phrase.substring(0,space1);
		String y = phrase.substring(space1 + 1,space2);
		String z = phrase.substring(space2 + 1);
		
		System.out.println("Normal "+ phrase);
		System.out.println("Normal " + z + y + x);
		
	}
}
