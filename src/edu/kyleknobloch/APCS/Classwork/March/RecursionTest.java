package edu.kyleknobloch.APCS.Classwork.March;

/**
 * Created by kyleknobloch on 3/30/16,
 * For
 * *
 * Actions:
 */
public class RecursionTest {

    public static void main (String args[]) {
        System.out.print(myPower(1, 3, 3));
    }

    public static int myPower (int init, int base, int power) {

        if (power == 0)
            return init;
        else
            return myPower(init * base, base, power -1);

    }

}
