package edu.kyleknobloch.APCS.Classwork.March.Arrays;

import java.util.ArrayList;

/**
 * Array Utilities
 */
public class ArrayUtilities {

    private int[] array;

    public ArrayUtilities(String filepath) {
        ArrayListUtilities ALU = new ArrayListUtilities(filepath);

        fillFromArrayList(ALU.getArray());
    }


    /**
     * Fill the array with the ArrayList
     * @param arrayList the ArrayList that we are filling from.
     */
    public void fillFromArrayList(ArrayList<Integer> arrayList) {

        array = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++)
            array[i] = arrayList.get(i);


    }


    /**
     * Find a element in the array
     * @param element - element to look for
     * @return the index of that element
     */
    public int search(int element) {

        int left = 0, right = array.length -1, middle, index = -1;

        while (left <= right) {
            middle = (left + right) /2;

            if (element > array[middle])
                left = middle + 1;
            else if (element < array[middle])
                right = middle -1;
            else {
                index = middle;
                break;
            }
        }

        return index;
    }


    /**
     * Insert a element into a array
     * @param element - element to be inserted
     */
    public void insert(int element) {
        int[] temp = new int[array.length +1];
        int insertIndex = 0;


        //fill the array
        for (int i = 0; i < array.length; i++)
            temp[i] = array[i];


        if (search(element) >= 0)
            //check to see if the element is already in the array
            System.out.print("This item is already in the array.");

        else { //Well, it's not a dupe soooo


            for (int i = 0; i <= array.length; i++) {
                if (i == array.length || element < array[i]) {
                    insertIndex = i;
                    break;
                }
            }

            //moving elements
            for (int i = temp.length -1; i > insertIndex ; i--) {
                temp[i] = temp[i-1];
            }

            temp[insertIndex] = element; //add the new element

        }

        array = temp; //finished, reassign to array in class

    }


    /**
     * Return a element from Index
     * @param index the index
     * @return the element from index
     */
    public int getFromIndex(int index) { return array[index]; }


    /**
     * Return the Array
     * @return the array
     */
    public int[] getArray() {
        return array;
    }


    /**
     * print array list with System.out.print();
     */
    public void sysLinePrintArray() {
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) System.out.println(i + ": " + array[i]);
    }
}
