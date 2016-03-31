package edu.kyleknobloch.APCS.Homework.Chap15HW;

/**
 *
 */
public class Ex3 {

    /**
     * Reverse a string, prints with System.out.print.
     * @param orig the string to be converted
     * @param lastLetterIndex how far in the string should we begin?
     */
    public static void reverse(String orig, int lastLetterIndex) {
        if (lastLetterIndex > 0) {
            System.out.print(orig.substring(lastLetterIndex -1, lastLetterIndex));
            reverse(orig, lastLetterIndex - 1);
        }
    }
}
