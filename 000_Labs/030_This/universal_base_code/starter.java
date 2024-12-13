/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int x = (int)(Math.random()*100);
		PooleDwarf dwarf1 = new PooleDwarf(randName(),x);
		PooleDwarf dwarf2 = new PooleDwarf(randName(),x);
		PooleDwarf dwarf3 = new PooleDwarf(randName(),x);
		PooleDwarf dwarf4 = new PooleDwarf(randName(),x);
		PooleDwarf dwarf5 = new PooleDwarf(randName(),x);
		PooleDwarf dwarf6 = new PooleDwarf(randName(),x);
		PooleDwarf dwarf7 = new PooleDwarf(randName(),x);
		String a = dwarf1.getName();
		String b = dwarf2.getName();
		String c = dwarf3.getName();
		String d = dwarf4.getName();
		String e = dwarf5.getName();
		String f = dwarf6.getName();
		String g = dwarf7.getName();
		int dups = 0;
		if(dwarf1.isSameName(b)){
			dups = dups + 1;
		}
		if(dwarf1.isSameName(c)){
			dups = dups + 1;
		}
		if(dwarf1.isSameName(d)){
			dups = dups + 1;
		}
		if(dwarf1.isSameName(e)){
			dups = dups + 1;
		}
		if(dwarf1.isSameName(f)){
			dups = dups + 1;
		}
		if(dwarf1.isSameName(g)){
			dups = dups + 1;
		}
		System.out.println("There are " + dups + " duplicates");
		System.out.println("The name was " + a);
		
	}
}
