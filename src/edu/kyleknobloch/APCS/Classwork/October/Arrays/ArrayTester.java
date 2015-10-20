package edu.kyleknobloch.APCS.Classwork.October.Arrays;


public class ArrayTester {

    public static void main (String args[]) {
        //This is the main in the tester. I am not wrighting PRE and POST conditions for this. Come on Mr. Drugan

        ArrayConstructors ac = new ArrayConstructors();

        ArrayConstructors ac1 = new ArrayConstructors("rand");

        System.out.println(ac1.toString());

        ac.arrayAllOne();
        System.out.println(ac.toString());
        ac.arrayRandomNumbers();
        System.out.println(ac.toString());
        ac.arrayBoolean();
        System.out.println(ac.toStringBoolean());

    }
}

