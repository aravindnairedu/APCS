//package edu.kyleknobloch.APCS.Classwork.September;

import java.util.Scanner;

/**
 * Created by kyleknobloch on 9/14/15,
 * For
 * *
 * Actions:
 */
public class RomanNumeralTester {

    public static void main (String args[]) {

        Scanner console = new Scanner(System.in);

        int thing  = 3;

        do {
            System.out.println("What are you entering? \n[Roman Numeral {1} or Number {2}]");
            thing = console.nextInt();

            if(thing == 1) {
                findRoman();
            }
            if (thing == 2) {
                findNumber();
            }

        } while (thing != 1 || thing != 2);

    }

    public static void findRoman() {
        int number = 0;
        Scanner console = new Scanner(System.in);

        do {
            System.out.println("Please enter a number between 1-10. ");
            number = console.nextInt();

            if ((number < 1) || (number > 10 )) {
                System.out.println("That number was out of range. \n");
            }
            else {
                RomanNumeral findRoman = new RomanNumeral(number);
                System.out.println(findRoman.toString());
            }


        } while (number < 1 || number > 10);


    }

    public static void findNumber() {
        String numeral;

        /** do {
            System.out.println("Please enter a number between 1-10. ");
            number = console.nextInt();

            if ((number < 1) || (number > 10 )) {
                System.out.println("That number was out of range. \n");
            }
            else {
                RomanNumeral findRoman = new RomanNumeral(number);
            }

        } while (number < 1 || number > 10);
        **/
    }
}
