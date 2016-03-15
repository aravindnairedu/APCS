package edu.kyleknobloch.APCS.Classwork.March.Arrays;

/**
 * Class used in ClassArrayListUtilities for the ArrayList
 */
public class ArrayIntClass {
    
    private int element;
    private int occurrences;
    
    ArrayIntClass(int element) {
        this.element = element;
        occurrences = 1;
    }
    
    public void incidentOccurrences() {
        occurrences++;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public int getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "" + element;
    }
}
