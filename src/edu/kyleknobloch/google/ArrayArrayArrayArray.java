package edu.kyleknobloch.google;

import java.util.ArrayList;

public class ArrayArrayArrayArray {


    public static void main(String[] args) {

        ArrayList<ArrayList> threeD = new ArrayList<>();

        threeD.add(new ArrayList<Integer>());
        threeD.add(new ArrayList<String>());
        threeD.add(new ArrayList<ArrayList>());
        threeD.get(2).add(new ArrayList<Integer>());
        threeD.get(2).add(new ArrayList<String>());
        Object test = threeD.get(2).get(1);
        //test.add("string");





    }

}
