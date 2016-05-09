package edu.kyleknobloch.APCS.Exams.December1;

import java.util.Random;

/**
 * Kyle Knobloch
 * AP CS Exam #1
 * Part 2: Question 1
 */
public class QuestionOne {

    public static void main (String args[]) {
        QuestionOne app = new QuestionOne();
    }


    private final int SIZE = 25;
    private int[] intArray = new int[SIZE];
    private char[] charArray = new char[SIZE];


    public QuestionOne() {
        Random r = new Random();

        for (int i = 0; i < SIZE; i++) {
            intArray[i] = r.nextInt(80) + 20; //highest 100. lowest 20

            charArray[i] = (char) intArray[i];

            System.out.println(intArray[i] + ".) " + charArray[i]);
            //System.out.println(intArray[i]); //DEBUG
        }

        System.out.println("Some values are blank because they are command codes or not supported by your font.");

    }

}
