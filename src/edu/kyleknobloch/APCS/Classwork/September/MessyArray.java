package edu.kyleknobloch.APCS.Classwork.September;


public class MessyArray {

    public static void main (String[] args) throws ArrayIndexOutOfBoundsException {

        int[] testArray = new int[] {6,6,6,4,4};


        testArray[4] = 4;

        //Arrays are usefull for printing out large ammounts of datas very easly, as shown below.

        try {
            System.out.println(testArray.length);

            for (int i = 0; i < 6; i++) {
                System.out.println(testArray[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }


        System.out.println(testArray.toString());

    }
}
