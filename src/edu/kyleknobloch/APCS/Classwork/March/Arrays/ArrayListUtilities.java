package edu.kyleknobloch.APCS.Classwork.March.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Array List Utilities
 */
public class ArrayListUtilities {

    private ArrayList<Integer> array = new ArrayList<>();


    /**
     * Constructor
     * @param filePath - file with ints' path
     */
    public ArrayListUtilities(String filePath) {

        try {
            File file = new File(filePath);
            Scanner filling = new Scanner(file);

            System.out.print("File size: " + filling.nextInt());

            while (filling.hasNext()) {
                insert(filling.nextInt());
            }

        } catch (FileNotFoundException e) {
            System.out.print("The file was not found. \nError: " + e);
        }

        sortList();

    }


    /**
     * Search the Array List
     * @param element - what to search for
     * @return - the index of the element
     */
    public int search(int element) {
        int left = 0, right = array.size() -1, middle, index = -1;

        while (left <= right) {
            middle = (left + right) /2;

            if (element > array.get(middle))
                left = middle + 1;
            else if (element < array.get(middle))
                right = middle -1;
            else {
                index = middle;
                break;
            }
        }

        return index;
    }

    public void sortList() {
        Collections.sort(array);
    }


    /**
     * Insert into the Array List
     * @param element - what to insert
     */
    public void insert(int element) {
        //System.out.println("call"); //DEBUG

        if (!array.contains(element)) {
            for (int i = 0; i <= array.size(); i++) {
                //System.out.print("loop"); //DEBUG
                if (i == array.size() || element < array.get(i)) {
                    //System.out.print("if"); //DEBUG
                    array.add(i, element);
                    break;
                }
            }
        }
    }


    /**
     * print array list with System.out.print();
     */
    public void sysLinePrintArray() {
        System.out.print("\n");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(i + ": " + array.get(i));
        }
    }


    /**
     * get ArrayList
     * @return array - the ArrayList
     */
    public ArrayList<Integer> getArray() {
        return array;
    }
}
