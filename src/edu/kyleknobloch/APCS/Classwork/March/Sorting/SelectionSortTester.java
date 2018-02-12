package edu.kyleknobloch.APCS.Classwork.March.Sorting;


import java.util.Random;

/**
 * Created by kyleknobloch on 3/23/16,
 * For
 * *
 * Actions:
 */
public class SelectionSortTester {

    public static void main (String args[]) {

        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {


            array[i] = new Random().nextInt(1000000);
            //System.out.println(array[i]);
        }

        SelectionSort.sort(array);


    }
}
