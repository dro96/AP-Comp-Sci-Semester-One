/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme a sentence so I can piglatin it");
        String sent = sc.nextLine();
        int space = sent.indexOf(" ");
        String word1 = "";
        String word2;
        while (true) {
            if (space == -1) {
                if (sent.substring(0, 1).equals("a") || sent.substring(0, 1).equals("e") || sent.substring(0, 1).equals("i") || sent.substring(0, 1).equals("o") || sent.substring(0, 1).equals("u")) {
                    word1 = word1 + sent + "-way";
                } else {
                    word1 = word1 + sent.substring(1) + "-" + sent.substring(0, 1) + "ay";
                }
                break;
                
                
                
                
                
            }
        }
        word2 = sent.substring(0,space);
        if(sent.substring(0, 1).equals("a") || sent.substring(0, 1).equals("e") || sent.substring(0, 1).equals("i") || sent.substring(0, 1).equals("o") || sent.substring(0, 1).equals("u")))
        {
        	word1 = word1 + word2 + "-way ";
        }
        else{
        	word1 = word1 + word2.substring(1) + "-" + word2.substring(0,1) + "ay ";
        }
        sent = sent.substring(space + 1);
        
        
        space = sent.indexOf(" ");
        System.out.println(word1);
        
    }
}
