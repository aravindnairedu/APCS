package edu.kyleknobloch.APCS.Classwork.March.Chap15HW;

import java.util.ArrayList;

/**
 * Created by kyleknobloch on 3/2/16,
 * For
 * *
 * Actions:
 */
public class Ex2Tester {
    public static void main (String args[]) {
        Ex2 ex2 = new Ex2();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(9035);arr.add(94230);arr.add(43290);arr.add(952340);arr.add(9043);arr.add(17);

        System.out.println(ex2.intSearch(arr, 17, 0));
    }
}
