import java.lang.System;

public class Sep4 {
    public static void main(String args[]) {

        //How many bits are being used below?
        //Answer: 18 bits.
        int x, y;
        double j, k;
        char letter;

        Sep4 mjc; //Class makes new data types

        x = 66;
        y = 100;

        j = 3.14159;
        k = 12.01;

        letter = 'J';

        mjc = new Sep4(); //Now object


        System.out.println("X = " + x + ". Y = " + y + ". J = " + j + ". K = " + k + ". Letter = " + letter);

        k = mjc.MyPow(10,2); //10^2

        System.out.println("K = " + k); //print out new k value


    } //end main

    public double MyPow(int base, int exp) {

                                     //Run the actual program, Math.pow.
        return(Math.pow(base, exp)); //return the final answer

    } //end MyPow

} //end class