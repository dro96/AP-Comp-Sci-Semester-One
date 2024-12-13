import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String role, name, title;
		int str, intel, rizz, dex, ovr, ovr1, ovr2, ovr3, ovr4;
		ovr = 20;
		System.out.println("What is your name");
		name = sc.nextLine();
		System.out.println("What is your title");
		title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue");
		role = sc.nextLine();
		if(role.equalsIgnoreCase("rogue")){
			System.out.println("You are a " + role + ", go make people quit");
		}
		else if(role.equalsIgnoreCase("wizard")){
			System.out.println("You are a " + role + ", youre either really good or really bad");
		}
		else if(role.equalsIgnoreCase("warrior")){
			System.out.println("You are a " + role + ", start winning");
		}
		else{
			System.out.println("Double check your spelling and try again");
			return;
		}
		System.out.println("You have 20 skill points, spread them out hovever you see fit in strength, inteligence, dexterity, and charisma");
		System.out.println("Strength (1-10):");
		str = sc.nextInt();
		sc.nextLine();
		if(str > 10){
			System.out.println("Smaller number please, restart the program");
			return;
		}
		ovr1 = ovr - str;
		System.out.println("You have " + ovr1 + " skill points left");
		System.out.println("Inteligence (1-10):");
		intel = sc.nextInt();
		sc.nextLine();
		if(intel > 10){
			System.out.println("Smaller number please, restart the program");
			return;
		}
		ovr2 = ovr1 - intel;
		System.out.println("You have " + ovr2 + " skill points left");
		System.out.println("Dexterity (1-10):");
		dex = sc.nextInt();
		sc.nextLine();
		if(dex > 10){
			System.out.println("Smaller number please, restart the program");
			return;
		}
		ovr3 = ovr2 - dex;
		System.out.println("You have " + ovr3 + " skill points left");
		System.out.println("Charizma (1-10):");
		rizz = sc.nextInt();
		sc.nextLine();
		if(rizz > 10){
			System.out.println("Smaller number please, restart the program");
			return;
		}
		ovr4 = ovr3 - rizz;
		if(ovr4 > 0){
			System.out.println("You have " + ovr4 + " skill points left");
		}
		else if(ovr4 == 0){
			System.out.println("You have used all your skill points");
		}
		else{
			System.out.println("Please restart the programn and ba a little more careful on how you spend\n you have a negative amount of skill points left over");
		}
		System.out.println("You are " + name + title);
		System.out.println("Your class is " + role);
		System.out.println("Here are your stats");
		System.out.println("---------------------");
		System.out.println("Stremgth: " + str);
		System.out.println("Inteligence: " + intel);
		System.out.println("Dexterity: " + dex);
		System.out.println("Charisma: " + rizz);
		
		
		
}
}