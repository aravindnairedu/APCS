package edu.kyleknobloch.APCS.Classwork.October.Arrays;


public class ArrayTester {

    public static void main (String args[]) {
        //This is the main in the tester. I am not wrighting PRE and POST conditions for this. Come on Mr. Drugan

        ArrayConstructors ac = new ArrayConstructors();

        ac.arrayAllOne();
        System.out.println(ac.toString());
        ac.arrayRandomNumbers();
        System.out.println(ac.toString());
        ac.arrayBooleon();
        System.out.println(ac.toStringBoolean());

    }
}
