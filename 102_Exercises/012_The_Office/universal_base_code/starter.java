/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int a, b, c, d, e;
		Employee michael = new Employee();
		Employee dwight = new Employee(1987,"Dwight","Schrute", 4416.66);
		Employee jim = new Employee(2474,"Jim","Halpert", 4416.66);
		Employee pam = new Employee(2011,"Pam","Beasley", 2250);
		Employee andre = new Employee(0000,"Andre","Sook", 1.01);

		dwight.raiseSalary(20);
		jim.raiseSalary(1);
		pam.raiseSalary(13);
		andre.raiseSalary(1000000);

		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();		
		andre.employeeToString();

		b = dwight.getAnnualSalary();
		c = jim.getAnnualSalary();
		d = pam.getAnnualSalary();
		e = andre.getAnnualSalary();
		System.out.println("All the annual salaries are as follows");
		System.out.println("Micheal "+ a);
		System.out.println("Dwight "+ b);
		System.out.println("Jim "+ c);
		System.out.println("Pam "+ d);
		System.out.println("Andre "+ e);
	}
}
