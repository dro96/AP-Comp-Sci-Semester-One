/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("This is an alarm clock");
		System.out.println("It is variable depending on the day");
		System.out.println("Different inputs lead to diffrent days");
		System.out.println("1 = sunday");
		System.out.println("2 = monday");
		System.out.println("3 = tuesday");
		System.out.println("4 = wednesday");
		System.out.println("5 = thursday");
		System.out.println("6 = friday");
		System.out.println("7 = saturday");
		System.out.println("What day is it?");
		x = sc.nextInt();
		sc.nextLine();
		if(x == 1 || x == 7){
			System.out.println("Wake up at 10:00 am");
		}
		else if(x >= 2 && x <= 6){
			System.out.println("Wake up at 7:00 am you got school");
		}
		else{
			System.out.println("Give me a number between 1 and 7 and try running again ");
		}
	}
}
