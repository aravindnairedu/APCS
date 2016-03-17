package edu.kyleknobloch.APCS.Classwork.March.Arrays;

/**
 * Class Array List Util. Tester
 */
public class ClassArrayListTester {

    public static void main (String args[]) {

        ClassArrayListUtilities CALU = new ClassArrayListUtilities("num.txt");

        CALU.sysLinePrintArray();

        System.out.println("Value 45 is at index " + CALU.search(new ArrayIntClass(45)) + " with " +
                CALU.getNumberOfOccurrences(CALU.search(new ArrayIntClass(45))) + " occurrences.");

    }
}
