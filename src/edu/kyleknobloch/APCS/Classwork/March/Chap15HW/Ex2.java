package edu.kyleknobloch.APCS.Classwork.March.Chap15HW;

import java.util.ArrayList;

/**
 * Created by kyleknobloch on 2/29/16,
 * For
 * *
 * Actions:
 */
public class Ex2 {

    public boolean intSearch (ArrayList<Integer> arr, int search, int minIndex) {
        if (arr.get(minIndex) == search)
            return true;
        else if (arr.size() -1 == minIndex) {
            return false;
        } else {
            intSearch(arr, search, minIndex + 1);
        }

        return false;
    }
}
