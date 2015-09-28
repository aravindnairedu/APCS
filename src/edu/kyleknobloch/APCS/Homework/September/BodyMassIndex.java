package edu.kyleknobloch.APCS.Homework.September;


import java.util.Scanner;

public class BodyMassIndex {

    private double weight;
    private double height;
    private double BMI;

    public BodyMassIndex() {
        /**
         * Default constructor
         */

        //Moved the setting of the variables to own method.
        setVarables();

        //math time!
        BMI = weight * 704 / Math.pow(height, 2);
        System.out.println("Your BMI is " + BMI + ".");

        //find if you're skinny or fat.
        if (BMI >= 25) {
            System.out.println("You may be overweight...");
        }
        if (BMI > 18.5 && BMI < 25) {
            System.out.println("You look to be in good shape!...");
        }
        if (BMI < 18.5) {
            System.out.println("You may be underweight...");
        }
        if (BMI >= 0 && BMI <=2.1) {
            System.out.println("\n\n***\nTest did not work. Users are stupid.\n***\n");
        }

        //display final result

        System.out.println("The BMI scale is not always accurate and dose not take into as many variables as it " +
                           "should but it is a good estimate. ");


    }

    public double BodyMassIndex(double weight, double height) {
        /**
         * Pre: have double weight and double height
         * Post: return final BMI
         *
         * Note: Created to have way to set own variables through somewhere else.
         */

        BMI = weight * 704 / Math.pow(height, 2);

        return (BMI);

    }

    private void setVarables() {
        /**
         * Setting varables
         */

        Scanner console = new Scanner(System.in);


        System.out.println("Calculate your Body Mass Index");
        System.out.println("Please enter your weight in US pounds");
        weight = console.nextDouble();
        System.out.println("Please enter your height in intches");
        height = console.nextDouble();

    }
}
