package edu.kyleknobloch.APCS.Classwork.March.Chap15HW;

import java.util.ArrayList;

public class Ex2 {

    /**
     * Searches for a int in the array with recursion
     *
     * @param arr the ArrayList to search
     * @param search what we're looking for
     * @param minIndex the lowest index to search from
     * @return true - found; false - not found
     */
    public static boolean intSearch (ArrayList<Integer> arr, int search, int minIndex) {

        if (minIndex == arr.size())
            return false;
        else if (arr.get(minIndex) == search)
            return true;
        else
            return intSearch(arr, search, minIndex + 1);

    }
}
