package edu.kyleknobloch.APCS.Classwork.March;

import java.util.Scanner;

/**
 * Created by kyleknobloch on 3/22/16,
 * For
 * *
 * Actions:
 */
public class MathPy {

    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        int max;
        double sum = 1.0;


        System.out.print("How far would you like to go? ");
        max = console.nextInt();


        for (double i = 2.0; i < max; i++) {
            double math = 1.0 - ( 1.0 / i);
            sum = sum * math;
        }

        System.out.print("Sum is: " + sum);

    }
}
