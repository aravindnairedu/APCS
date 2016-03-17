package edu.kyleknobloch.APCS.Classwork.March.Arrays;

/**
 * Array Tester
 */
public class ArrayTester {

    public static void main(String args[]) {

        ArrayUtilities au = new ArrayUtilities("num.txt");

        au.sysLinePrintArray();

        System.out.println("\n45 is at index " + au.search(45) + ".");

    }
}
