package edu.kyleknobloch.APCS.Homework.October;

/**
 * Chapter 5
 * Excersise 5
 */
public class FallingDistance {

    public double d; //meters
    public double g = 9.2;
    public double t; //seconds

    public FallingDistance() {

        double i = 1;

        do {

            calcD(i); //Run the calculations

            System.out.println(i + " | " + d); //print the calculations

            i++; //increment
        } while (i < 11);

    }


    private void calcD(double t) {
        this.d = 0.5 * this.g * t;
    }

}
