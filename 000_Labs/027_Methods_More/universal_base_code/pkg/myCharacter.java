package pkg;

public class myCharacter {
    public String r;
    public int str;
    public int dex;
    public int intel;
    public int rizz;

    public myCharacter() {
        str = 10;
        dex = 12;
        intel = 15;
        rizz = 4;
        r = "no role";
    }

    public myCharacter(String role) {
        str = 10;
        dex = 12;
        intel = 15;
        rizz = 4;
        r = "no role";
        setRole(role);
    }

    public void myToString() {
        System.out.println("Role: " + r);
        System.out.println("Strength: " + str);
        System.out.println("Dexterity: " + dex);
        System.out.println("Intelligence: " + intel);
        System.out.println("Charisma: " + rizz);
    }
    public String setRole(String role) {
        if (role.equalsIgnoreCase("Wizard") || role.equalsIgnoreCase("Rogue") || role.equalsIgnoreCase("Warrior")) {
            r = role;
            return r;
        }
        return "no role";
    }
    public int setStrength(int strength) {
        if (strength < 0) {
            str = 0;
        }
        str = strength;
        return str;
    }
    
    
    
    
    public int setDexterity(int dexterity) {
        if (dexterity < 0) {
            dex = 0;
        }
        dex = dexterity;
        return dex;
    }
    public int setIntelligence(int intelligence) {
        if (intelligence < 0) {
            intel = 0;
        }
        intel = intelligence;
        return intel;
    }
    public int setCharisma(int charisma) {
        if (charisma < 0) {
            rizz = 0;
        }
        rizz = charisma;
        return rizz;
    }


    
}
