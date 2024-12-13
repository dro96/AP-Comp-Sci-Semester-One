package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;
	
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villian = "unknown";
	}
	public Spiderman(String actor){
		this.actor = actor;
		age = 0;
		villian = "unknown";
		
	}
	public Spiderman(int a){
		actor = "Unknown";
		age = a;
		villian = "unknown";
		
	}
	public Spiderman(String a, String v){
		actor = a;
		age = 0;
		villian = v;
		
	}
	public Spiderman(String a, int b, String v){
		actor = a;
		age = b;
		villain = v;
	}
	public void setAge(int a){
		age = a;
	}
	public void setVillain(String v){
		villain = v;
	}
	
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
