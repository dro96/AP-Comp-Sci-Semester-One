/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("Matthew");
        double newSalary = raise(10000000.62, 3);
        System.out.println(newSalary);
        newSalary = raise(newSalary, 6);
        newSalary = raise(newSalary, 6);
        newSalary = raise(newSalary, 6);
        newSalary = raise(newSalary, 6);
	}
	
	public static void greeting(String name){
	    System.out.println("barev  " + name);
	}
	public static double raise(double salary, int percent){
	    double amount = salary + (salary + (percent/100.0));
	    return amount; 
	}
	
	public static void printAnimal(){
	    System.out.println("    _    _");
	    System.out.println("   /=\"/=\"");
	    System.out.println("  (=(0_0 |=)__");
	    System.out.println("   \"_\" _/_/   )");
	    System.out.println("     /_/   _  /\"");
	    System.out.println("   |/ |\" || |");
	    System.out.println("      ~ ~  ~");

	}
}