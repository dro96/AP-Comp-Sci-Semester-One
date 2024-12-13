/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int f;
	f = 5;
	int s;
	s = 7;
	int t;
	t = 2;
	int th;
	th = 3;
	int o;
	o = 1;
	int te;
	te = 10;
	int fo;
	fo = 4;
	System.out.println(f + "*" + s + "/" + t + "%" + th + "-" + o);
	System.out.println("---------------");
	System.out.println(f*s/t%th-o);
	System.out.println("");
	System.out.println(te + "%" + th + "-" + fo + "*" + s + "+" + t);
	System.out.println("---------------");
	System.out.println(te+th-fo*s-t);
	System.out.println("");
	System.out.println("(" + th + "-" + s + "/" + t + "*" + f + ")" + "%" + te);
	System.out.println("---------------");
	System.out.println((th-s/t*f)%te);
	}
}
