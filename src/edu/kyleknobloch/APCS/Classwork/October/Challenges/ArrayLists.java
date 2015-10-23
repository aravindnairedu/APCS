package edu.kyleknobloch.APCS.Classwork.October.Challenges;


import java.util.ArrayList;

public class ArrayLists {

    private ArrayList<String> arrayList = new ArrayList<String>();

    /**
     * Constructors
     */
    public ArrayLists () {
        //I do nothing, trust me I'm a default constructor
    }


    /**
     * Display method
     * @return message
     */
    public String display() {
        String message = "";

        for (int index = 0; index < arrayList.size(); index++) {
            message = message + index + ".) " + arrayList.get(index)+ "\n";
        }

        return message;
    }


    /**
     * toString
     * @return display() String, message
     */
    @Override
    public String toString() {
        return display();
    }

    /**
     *
     * addTo methods
     *
     * Add a item to the ArrayList
     * @param position where to add? (addToEnd and addToBegining do not require a position)
     * @param item what to add? (String as it can take anything and I don't have to do any parsing of stuff)
     */
    public void addTo(int position, String item) {
        try {
            arrayList.add(position, item);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("That was too large of an position. Please use a smaller position. [" + e + "]\n");
        }
    }

    public void addTo(String item) {
        arrayList.add(item);
    }

    public void addToBegining(String item) {
        arrayList.add(0, item);
    }

    public void addToEnd(String item) {
        arrayList.add(arrayList.size(), item);
    }


    /**
     * removeFrom methods
     *
     *
     * Remove a object or item from the ArrayList
     * @param position
     * or
     * @param item
     */
    public void removeFrom(int position) {
        try {
            arrayList.remove(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("That was too large of index. The item was not removed.[" + e + "]\n");
        }

    }
    public void removeFrom(String item) {
        if (!arrayList.remove(item))
            System.out.println("That item was not found. The item was not in existence in the first place. \n");
        else
            arrayList.remove(item);

    }


    /**
     * Search method
     *
     * Check to see if item is in the array.
     *
     * @param item
     * @return position
     *     -2 or -1: Dose not exist
     *     Positive number: item's position
     */
    public int searchFor(String item) {
        int position = -2;

        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index).equalsIgnoreCase(item)) {
                position = index;
            }
        }

        return position;
    }

    /**
     * Gives the size of the array.
     * @return size of the array
      */
    public int getSize() {
        return arrayList.size();
    }



}
