import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] war = new Warrior[100];
		Wizard[] wiz = new Wizard[100];
		for(int i = 0; i < war.length; i++){
			war[i] = new Warrior("Warrior " + (i + 1));
			wiz[i] = new Warrior("Wizzard " + (i + 1));
		}
		int warNum, wizNum, warRem, wizRem;
		warNum = 0;
		wizNum = 0;
		warRem = 100;
		wizRem = 100;
		
		
		while( warRem > 0 && wizRem>0){
			Warrior fighter = war[warNum];
			Wizard fighter1 = wiz[wizNum];
			
			if(!fighter1.isDead()){
				fighter1.attack(fighter);
				if(fighter.isDead()){
					warNum++;
					warRem = warRem - 1;
					
					
				}
			}
			if(!fighter.isDead()){
				fighter.attack(fighter1);
				if(fighter1.isDead()){
					warNum++;
					warRem = warRem - 1;
				}
			}
				
			}
		}
		if(warRem == 0){
			System.out.println("The wizards won with "+ wizRem + " fighters left");
		}
		else{
			System.out.println("The warriors won with "+ warRem + " fighters left");
		}
			
	}
}
