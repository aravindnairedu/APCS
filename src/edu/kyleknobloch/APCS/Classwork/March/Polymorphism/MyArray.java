package edu.kyleknobloch.APCS.Classwork.March.Polymorphism;

import edu.kyleknobloch.APCS.Classwork.March.Arrays.ArrayUtilities;

/**
 *
 */
public class MyArray extends MyList {

    private ArrayUtilities au;

    public MyArray(String filepath) {
        au = new ArrayUtilities(filepath);
    }

    public void insert(int element) {au.insert(element);}

    public int search(int element) {return au.search(element);}

    public String printElement(int index) {return index + ": " + au.getFromIndex(index);}

    public String printArray() {
        String print = "";

        for (int i = 0; i < au.getArray().length; i++)
            print += i + ": " + au.getFromIndex(i) + "\n";

        return print;
    }
}
