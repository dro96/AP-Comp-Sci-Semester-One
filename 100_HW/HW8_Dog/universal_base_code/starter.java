/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dro = new Dog("dro");
		dro.setAge(5);
		
		Dog dre = new Dog("dre", "dawg");
		boolean x, y;
		x = dro.isSleeping();
		y = dre.isSleeping();
		if (x) {
			System.out.println(dro.getName() + " is asleep.");
		} 
		else {
			dro.bark();
		}
		if (y) 
		{
			if (!x) 
			{
				dre.bark();
			}
		} 
		else {
			if (!x) 
			{
				dre.bark();
			}
		}
	}
}
