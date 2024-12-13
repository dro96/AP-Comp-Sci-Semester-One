/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Cipher ci = new Cipher();
		String ans, ans1;
		System.out.println("Give me a phrase to encode");
		ans = sc.nextLine();
		ans1 = ci.encode(ans);
		System.out.println("Your new string is " + ans1);
		
		

	}
}
