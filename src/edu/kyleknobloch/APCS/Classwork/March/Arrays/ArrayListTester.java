package edu.kyleknobloch.APCS.Classwork.March.Arrays;

/**
 * ArrayList Utilities Tester
 */
public class ArrayListTester {

    public static void main (String args[]) {

        ArrayListUtilities ALU = new ArrayListUtilities("Array.txt");

        ALU.sysLinePrintArray();

        System.out.println("Value 543 is at index " + ALU.search(543) + ".");

    }
}
