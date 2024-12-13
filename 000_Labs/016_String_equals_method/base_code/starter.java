/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		String role; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
		role = sc.nextLine();
		if(role.equalsIgnoreCase("rogue")){
			System.out.println("You are a " + role + ", go make people quit");
		}
		else if(role.equalsIgnoreCase("wizard")){
			System.out.println("You are a " + role + ", youre either really good or really bad");
		}
		else if(role.equalsIgnoreCase("warrior")){
			System.out.println("You are a " + role + ", start shafting ppl up");
		}
		else{
			System.out.println("Double check your spelling and try again");
		}
	}
}
