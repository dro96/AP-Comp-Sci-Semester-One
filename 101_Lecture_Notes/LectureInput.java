/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please gimme a name");
        String name = sc.nextLine();
  
        System.out.println("Hello " + name);
        System.out.println("Write a number");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Write another number");
        int te = sc.nextInt();
        sc.nextLine();
        
        int sum = te + num;
        System.out.println("The sum of your numbers is " + sum);
        
        System.out.println("What is your favorite food");
        String food = sc.nextLine();
	}
}