package edu.kyleknobloch.APCS.Classwork.March.Polymorphism;

import edu.kyleknobloch.APCS.Classwork.March.Arrays.ArrayListUtilities;

/**
 *
 */
public class MyArrayList extends MyList {

    private ArrayListUtilities alu;

    public MyArrayList(String filepath) {
        alu = new ArrayListUtilities(filepath);
    }

    public void insert(int element) {alu.insert(element);}

    public int search(int element) {return alu.search(element);}

    public String printElement(int index) {return index + ": " + alu.getArray().get(index);}

    public String printArray() {

        String print = "";

        for (int i = 0; i < alu.getArray().size(); i++)
            print += i + ": " + alu.getArray().get(i) + "\n";

        return print;
    }

}
