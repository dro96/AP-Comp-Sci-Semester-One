/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dog {
	int age;
	String name;
	String breed;

	public Dog() {
		age = 3;
		name = "Clifford";
		breed = "big red dog";
	}

	public Dog(String name1) {
		name = name1;
		age = 1;
		breed = "dog dog";
	}

	public Dog(String name1, String breed1) {
		name = name1;
		age = 1;
		breed = breed1;
	}

	public Dog(String name1, int age1) {
		name = name1;
		age = age1;
		breed = "dog dog";
	}

	public void setName(String name2) {
		name = name2;
	}

	public void setAge(int age2) {
		age = age2;
	}
	public void setBreed(String breed2) {
		breed = breed2;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		int random;
		random = (int)(Math.random() * 2 + 1);
		if (random == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + " barks!");
	}
}
