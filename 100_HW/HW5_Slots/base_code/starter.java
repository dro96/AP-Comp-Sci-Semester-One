
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, sum, wager;
		String ans;
		sum = 100;
		System.out.println("This is a slot machine ");
		System.out.println("If two numbers match, your money is doubled");
		System.out.println("If three numbers match, your money is tripled");
		while(sum > 0){
			System.out.println("You have " + sum + " dollars");
			System.out.println("Would you like to play?");
			ans = sc.nextLine();
			if(ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")){
				System.out.println("ok thanks for playing");
				System.out.println("You made " + sum + " dollars");
				return;
			}
			else if (ans.equalsIgnoreCase("Yes") || ans.equalsIgnoreCase("y")){
				System.out.println("How much would you like to wager");
				wager = sc.nextInt();
				sc.nextLine();
				while(wager > sum || wager <= 0){
					System.out.println("Make sure your wager is a number bigger than 0 and less than your sum");
					System.out.println("How much would you like to wager");
					wager = sc.nextInt();
					sc.nextLine();
				}
				a = (int)(Math.random()* 9 + 1);
				b = (int)(Math.random()* 9 + 1);
				c = (int)(Math.random()* 9 + 1);
				System.out.println(" ");
				System.out.println("   " + a + "   " + b + "   " + c);
				if(a == b && a == c){
					sum = sum + (wager*2);
					System.out.println("JACKPOT");
					System.out.println("Your balance is now " + sum);
				}
				else if(a == b || a == c || b == c){
					System.out.println("You won");
					sum = sum + wager;
					System.out.println("Your balance is now " + sum);
				}
				else{
					sum = sum - wager;
					System.out.println("You lost");
					System.out.println("Your balance is now " + sum);
				}
			
		}
		System.out.println("Game over");
	}
}
}