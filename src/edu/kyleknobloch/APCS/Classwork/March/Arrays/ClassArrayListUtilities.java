package edu.kyleknobloch.APCS.Classwork.March.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Array List Utilities (int)
 */
public class ClassArrayListUtilities {

    private ArrayList<ArrayIntClass> array = new ArrayList<>();


    /**
     * Constructor
     * @param filePath - file with ints' path
     */
    public ClassArrayListUtilities(String filePath) {

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

    }


    /**
     * Search the Array List
     * @param element - what to search for
     * @return - the index of the element
     */
    public int search(ArrayIntClass element) {
        int left = 0, right = array.size() -1, middle, index = -1;

        while (left <= right) {
            middle = (left + right) /2;

            if (element.getElement() > array.get(middle).getElement())
                left = middle + 1;
            else if (element.getElement() < array.get(middle).getElement())
                right = middle -1;
            else {
                index = middle;
                break;
            }
        }

        return index;
    }


    /**
     * Insert into the Array List
     * @param element - what to insert
     */
    public void insert(int element) {
        //System.out.println("call"); //DEBUG

        ArrayIntClass aic = new ArrayIntClass(element);
        int inArrayIndex = search(aic);


        if (inArrayIndex >= 0)
            array.get(inArrayIndex).incidentOccurrences();

        else {
            for (int i = 0; i <= array.size(); i++) {
                //System.out.print("loop"); //DEBUG
                if (i == array.size() || aic.getElement() < array.get(i).getElement()) {
                    //System.out.print("if"); //DEBUG
                    array.add(i, aic);
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
            System.out.println(i + ": " + array.get(i).toString());
        }
    }


    /**
     * get ArrayList
     * @return array - the ArrayList
     */
    public ArrayList<ArrayIntClass> getArray() {
        return array;
    }

    /**
     * Returns the number of Occurrences
     * @param index - Element's index
     * @return the number of occurrences
     */
    public int getNumberOfOccurrences(int index) {
        return array.get(index).getOccurrences();
    }


    /**
     * Returns the element at index
     * @param index - index of the requested element
     * @return the element
     */
    public int getElement(int index) {
        return array.get(index).getElement();
    }

}
