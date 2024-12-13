/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a sentence so i can make it into Spongebob case");
		String x = sc.nextLine();
		while(true){
			if(x.IndexOf(" ") == 1){
				break;
			}
			int space = x.IndexOf(" ");
			String word = x.substring(0,space);
			System.out.print(spongeCase(word))
		}
	}	
	public static String spongeCase(String x){
		int len = x.length();
		x = x.toLowerCase();
		String y = "";
		String z = "";
		
		for(int i = 0; i<len; i++){
			if(i%2 == 1){
				y = x.substring(i, i+1).toUpperCase();
			}
			else{
				y = x.substring(i,i+1);
			}
			z = z + y;
		}
		System.out.println(z);
	}
}
