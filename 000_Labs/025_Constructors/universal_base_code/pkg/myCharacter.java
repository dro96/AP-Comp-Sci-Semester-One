/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;
public class myCharacter {
	public String r;
	public int str, dex, intel, rizz;
	public myCharacter(){
	str = 10;
	dex = 12;
	intel = 15;
	rizz = 4;
	r = "no role";
	}
	public myCharacter(String r) {  // Use 'r' as the parameter
        str = 10;
        dex = 12;
        intel = 15;
        rizz = 4;
        if( r.equalsIgnoreCase("Wizard") || r.equalsIgnoreCase("Rogue") || r.equalsIgnoreCase("Warrior")){
        	System.out.println("You are a "+ r);
        	
        }
        else{
        	return;
        }
	
}
}