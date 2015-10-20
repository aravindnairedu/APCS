package edu.kyleknobloch.APCS.Classwork.October.Arrays;


import java.util.Random;

public class ArrayConstructors {

    private int arrays[] = new int[100];
    boolean booleans[] = new boolean[100];

    /**
     * Default constructor
     * @PRE  none
     * @POST none
     */
    public ArrayConstructors () {
        //I do nothing, trust me I'm a default constructor
    }

    /**
     * @param type What type of array are you looking for?
     * @return none
     */
    public ArrayConstructors (String type) {

        if (type.equalsIgnoreCase("boolean")) {
            arrayBoolean();
        }
        else if (type.equalsIgnoreCase("rand") || type.equalsIgnoreCase("int")){
            arrayRandomNumbers();
        }
        else {
            arrayAllOne();
        }
    }

    /**
     * @PRE  That the array arrays has ben created
     * @POST none
     */
    public void arrayAllOne () {

        for (int i = 0; i <= 99; i++) {
            arrays[i] = -1;
            //System.out.println(i + ": " + array[i]);
        }

    }

    /**
     * @PRE  That the array arrays has ben created
     * @POST set array arrays to random numbers between 0-999.
     */
    public void arrayRandomNumbers () {

        for (int i = 0; i <= 99; i++) {
            arrays[i] = random(1000);
            //System.out.println(i + ": " + array[i]);
        }

    }


    /**
     * @PRE  That the booleans arrays has ben created
     * @POST Randomly sets array booleons to true or false.
     */
    public void arrayBoolean () {

        for (int i = 0; i <= 99; i++) {
            int n = random(2);
            if (n == 0) {
                booleans[i] = true;
            } else if (n == 1) {
                booleans[i] = false;
            }
            //System.out.println(i + ": " + booleans[i]);
        }

    }

    /**
     * @PRE  That the array arrays has values set, call arrayRandomNumbers or arrayAllOne
     * @POST @return
     * @return String message, prints the array block and it's contents (a number)
     */
    @Override
    public String toString() {

        String message = "";
        for (int i = 0; i <= 99; i++) {
            message = message + "\n" + i + ": " + arrays[i];
        }

        return message;
    }

    /**
     * @PRE  That the array booleans has values set, call arrayBooleon
     * @POST @return
     * @return String message, prints the array block and it's contents (true/false)
     */
    public String toStringBoolean() {

        String message = "";
        for (int i = 0; i <= 99; i++) {
            message = message + "\n" + i + ": " + booleans[i];
        }

        return message;
    }

    /**
     * @PRE  @param
     * @POST @return
     * @param n how high is the random number generator will create numbers
     * @return a number from the random number generator
     */
    public int random (int n) {
        Random r = new Random();
        return r.nextInt(n);
    }


}
