package edu.kyleknobloch.APCS.Homework;


import java.util.Scanner;

public class MagicDates {

    private int month;
    private int day;
    private int year;
    private int result;


    public MagicDates () {
        /**
         * Default Constructor
         */

        //Moved the setting of the variables to own method.
        setVarables();

        //math time!
        result = day * month;
        if (result == year) {
            System.out.println("The day is magical!");
        }
        else {
            System.out.println("That day was not magical. ");
        }

    }

    public int MagicDates(int day, int month, int year) {

        /**
         * Pre: int day, int month and int year
         * Post: int result
         *
         * Note: Created to have way to set own variables through somewhere else.
         */
        result = day * month;
        if (result == year) {
            System.out.println("The day is magical!");
        }
        else {
            System.out.println("That day was not magical. ");
        }


        return result;
    }

    private void setVarables() {
        /**
         * Setting varables
         */
        Scanner console = new Scanner(System.in);


        System.out.println("Please enter a day");
        day = console.nextInt();
        System.out.println("Please enter a month");
        month = console.nextInt();
        System.out.println("Please enter a 2-digit year");
        year = console.nextInt();

    }
}
