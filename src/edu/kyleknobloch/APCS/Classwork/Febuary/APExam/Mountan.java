package edu.kyleknobloch.APCS.Classwork.Febuary.APExam;

import java.util.ArrayList;

/**
 * Kyle Knobloch
 * AP Computer Science A Examp
 * Free Response, 2014, Question 2
 *                      Parts a & b
 */
public class Mountan {

    /**
     * Return the index where the first peak is.
     * -1 if no peak found.
     */
    public int getPeakIndex(ArrayList<Integer> array) {
        int index = -1;
            for (int i = 1; i < array.size() - 1; i++) {
                if (array.get(i) < array.get(i -1)) {
                    //we've found a peak.
                    index = i;
                    break;
                }
            }

        return index;
    }

    /**
     * return if this is a true mnt (only one max).
     */
    public boolean isMountan(ArrayList<Integer> array) {
        boolean is = false;

            for (int i = getPeakIndex(array); i < array.size() - 1; i++){
                if (array.get(i) > array.get(i -1)) {
                    is = true;
                } else {
                    is = false;
                    break;
                }
            }

        return is;
    }


    public boolean isIncresing(ArrayList<Integer> array, int stop) {
        return true;
    }

    public boolean isDecresing(ArrayList<Integer> array, int stop) {
        return true;
    }



}
