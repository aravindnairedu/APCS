package edu.kyleknobloch.APCS.Classwork.Febuary.APExam;

/**
 * AP CS Exam 2015, Multi-choice
 *                  Question 9
 */
public class randomCUBE {

    public static void main (String args[]) {
        System.out.println( (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1));

        //System.out.println(mystery("noon"));

    }

    public static boolean mystery(String str) {
        String temp = "";

        for (int i = str.length(); i > 0; i--) {
            temp = temp + str.substring(i - 1, i);
        }

        return str.equals(temp);
    }
}
