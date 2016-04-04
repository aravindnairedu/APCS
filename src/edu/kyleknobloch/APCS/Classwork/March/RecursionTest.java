package edu.kyleknobloch.APCS.Classwork.March;

/**
 *
 */
public class RecursionTest {

    public static void main(String args[]) {
        System.out.print(myPower(1, 3, 3) + "\n");

        showMe(0);
    }


    public static int myPower(int element, int base, int power) {
        if (power == 0)
            return element;
        else
            return myPower(element * base, base, power - 1);
    }


    public static void showMe(int arg) {
        if (arg < 10)
            showMe(arg + 1);
        else
            System.out.print(arg);
    }

}

