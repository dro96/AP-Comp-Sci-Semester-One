package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
    public String r;
    public int str, dex, intel, rizz;

    public myCharacter() {
        str = 10;
        dex = 12;
        intel = 15;
        rizz = 4;
        r = "no role";
    }

    public myCharacter(String r) {
        str = 10;
        dex = 12;
        intel = 15;
        rizz = 4;
        if (r.equalsIgnoreCase("Wizard") || r.equalsIgnoreCase("Rogue") || r.equalsIgnoreCase("Warrior")) {
            this.r = r;
            System.out.println("You are a " + r);
        } else {
            this.r = "no role";
        }
    }

    public void myToString() {
        System.out.println("Role: " + r);
        System.out.println("Strength: " + str);
        System.out.println("Dexterity: " + dex);
        System.out.println("Intelligence: " + intel);
        System.out.println("Charisma: " + rizz);
    }
}