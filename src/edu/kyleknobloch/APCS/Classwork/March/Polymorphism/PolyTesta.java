package edu.kyleknobloch.APCS.Classwork.March.Polymorphism;

import java.util.ArrayList;

/**
 * Created by kyleknobloch on 3/29/16,
 * For
 * *
 * Actions:
 */
public class PolyTesta {

    public static void main (String args[]) {

        ArrayList<MyList> array = new ArrayList<>();

        array.add(new MyArray("num1.txt"));
        array.add(new MyArray("num2.txt"));
        array.add(new MyArray("num3.txt"));
        array.add(new MyArray("num4.txt"));
        array.add(new MyArray("num5.txt"));
        array.add(new MyArrayList("num1.txt"));
        array.add(new MyArrayList("num2.txt"));
        array.add(new MyArrayList("num3.txt"));
        array.add(new MyArrayList("num4.txt"));
        array.add(new MyArrayList("num5.txt"));

        for (int i =0; i < array.size(); i++)
            System.out.print(array.get(i).printArray());


    }
}
