/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int size = (int) (Math.random() * 150) + 51;
        int[] array = new int[size];
        int sum;
        sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        int min = Integer.MAX_VALUE;
        for (int b = 0; b < size; b++) {
            if (array[b] < min) {
                min = array[b];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int a = 0; a < size; a++) {
            if (array[a] > max) {
                max = array[a];
            }
        }
        for (int c = 0; c < size; c++) {
            sum += array[c];
        }
        double average = (double) sum / size;
        System.out.println("Size: " + size);
        System.out.println("Minimum: " + min);
        System.out.println("Manimum: " + max);
        System.out.println("Average: " + average);
        System.out.println("Elements: ");
        for (int d = 0; d < size; d++) {
            System.out.println(array[d] + " ");
        }
    }
}
