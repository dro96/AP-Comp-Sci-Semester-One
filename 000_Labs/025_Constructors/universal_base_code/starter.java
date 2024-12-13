/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter dro = new myCharacter();
        System.out.println("Role: " + dro.r);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your role ");
        String x = sc.nextLine();
        myCharacter notdro = new myCharacter(x);
        System.out.println("your new role is " + x);
}
}
