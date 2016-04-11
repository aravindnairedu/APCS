package edu.kyleknobloch.APCS.CaseStudy.Activity3;


/**
 * Elevens Lab Case Study
 *
 * Activity 3
 * Shuffler Tester
 */
public class ShufflerTester {

    private static final int SHUFFLE_COUNT = 1;

    public static void main(String[] args) {
        System.out.println("\n" + System.currentTimeMillis() + "\n"); //time trials

        //"perfect" shuffle
        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");

        int[] values = {0, 1, 2, 3, 4, 5};



        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            Shuffler.perfectShuffle(values);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values.length; k++) {
                System.out.print(" " + values[k]);
            }
            System.out.println();
        }


        System.out.println("\n" + System.currentTimeMillis() + "\n"); //time trials


        //efficient selection shuffle
        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");


        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            Shuffler.selectionShuffle(values);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values.length; k++) {
                System.out.print(" " + values[k]);
            }
            System.out.println();
        }

        System.out.println("\n" + System.currentTimeMillis() + "\n"); //time trials
    }
}
