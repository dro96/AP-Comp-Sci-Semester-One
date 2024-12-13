/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String name;
	String month;
	int age;
	int year;
	int day;
	Double buck;
	System.out.println("What is your name ");
	name = sc.nextLine();
	
	System.out.println("What is your age ");
	age = sc.nextInt();
	sc.nextLine();
	
	System.out.println("What is your birthday month ");
	month = sc.nextLine();
	
	System.out.println("What is your birthday day ");
	day = sc.nextInt();
	
	System.out.println("What is your birthday year");
	year = sc.nextInt();
	
	System.out.println("How much is a buck fifty");
	buck = sc.nextDouble();

	System.out.println("Your name is " + name);
	System.out.println("Your age is " + age);
	System.out.println("Your birthday month is " + month);
	System.out.println("Your birthday day is " + day);
	System.out.println("Your birthday year is " + year);
	System.out.println("A buck fifty is " + buck);
	}
}
