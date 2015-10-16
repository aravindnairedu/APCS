package edu.kyleknobloch.APCS.Classwork.October.Arrays;


import java.util.Random;

public class ArrayConstructors {

    public ArrayConstructors () {
        arrayAllOne();
        arrayRandomNumbers();
        arrayBooleon();
    }


    public void arrayAllOne () {

        int allOnes[] = new int[100];

        for (int i = 0; i <= 99; i++) {
            allOnes[i] = -1;
            System.out.println(i + ": " + allOnes[i]);
        }

    }

    public void arrayRandomNumbers () {
        int randomNumbers[] = new int[100];

        for (int i = 0; i <= 99; i++) {
            randomNumbers[i] = random(1000);
            System.out.println(i + ": " + randomNumbers[i]);
        }

    }

    public void arrayBooleon () {
        boolean booleans[] = new boolean[100];

        for (int i = 0; i <= 99; i++) {
            int n = random(2);
            if (n == 0) {
                booleans[i] = true;
            } else if (n == 1) {
                booleans[i] = false;
            }
            System.out.println(i + ": " + booleans[i]);
        }

    }

    public int random (int n) {
        Random r = new Random();
        return r.nextInt(n);
    }


}
