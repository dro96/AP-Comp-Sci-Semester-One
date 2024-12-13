/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] a = new int[20];
        int num = (int) (Math.random() * 10) + 1;
        int dups = 0;        
        int[] dupchecker = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("elements: ");
        for (int b = 0; b < 20; b++) {
            System.out.println(a[b]);
        }
        System.out.println("target number: " + num);
        for (int c = 0; c < 20; c++) {
            if (a[c] == num) {
                dupchecker[dups] = c;
                dups++;
            }
        }

        System.out.println("Duplicates of " + num + "are ");
        if (dups > 0) {
            for (int d = 0; d < dups; d++) {
                System.out.println("Index: " + dupchecker[d]);
            }
            System.out.println("Total duplicates: " + dups);
        } 
        else {
            System.out.println(num+ "has no duplicates");
        }
        System.out.println("duplicates following eachother");
        for (int e = 0; e < 19; e++) {
            if (a[e] == a[e + 1]) {
                System.out.println("Consecutive numbers are " + e + " and " + (e + 1) + " are both " + a[e]);
            }
        }
	}
}
