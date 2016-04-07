package edu.kyleknobloch.APCS.CaseStudy.Activity3;

/**
 * Shuffler (proof of concept)
 */
public class Shuffler {


    /**
     * "perfect shuffle"
     * @param values  array of int
     */
    public static void perfectShuffle(int[] values) {
        int[] temp = new int[values.length];
        int mid = values.length / 2;

        // Interleave elements 0 ... mid-1 with elements mid ... length-1
        int unshuffledPos = 0;
        int k = 0;
        for ( ; k < mid; k++) {
            temp[unshuffledPos] = values[k];
            unshuffledPos += 2;
        }
        unshuffledPos = 1;
        for ( ; k < values.length; k++) {
            temp[unshuffledPos] = values[k];
            unshuffledPos += 2;
        }

        // Copy elements back to values
        for (k = 0; k < values.length; k++) {
            values[k] = temp[k];
        }

    }


    /**
     * "efficient selection shuffle"
     * @param values array of int
     */
    public static void selectionShuffle(int[] values) {

        for (int k = values.length - 1; k > 0; k--) {
            int pos = (int) (Math.random() * (k + 1));  // range 0 to k, inclusive
            int temp = values[pos];
            values[pos] = values[k];
            values[k] = temp;
        }

    }

}
