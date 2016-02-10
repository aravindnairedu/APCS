package edu.kyleknobloch.APCS.Classwork.Febuary.Recursion;

/**
 *
 */
public class RecursionClass {

    private int count;

    public RecursionClass() {

    }

    public void message(int count) {

        if ( count > 0) {
            System.out.println("Count: " + count);
                message(count - 1);
            System.out.println("Count: " + count);

        } else
            System.out.println("Base case.");


    }

}
