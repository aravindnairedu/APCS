package edu.kyleknobloch.APCS.Classwork.September;

import java.util.Scanner;

public class TestScoresTester {

    public static void main (String args[]) {

        double grade1, grade2, grade3;
        Scanner console = new Scanner(System.in);


        System.out.println("Grade 1: ");
        grade1 = console.nextDouble();
        System.out.println("Grade 2: ");
        grade2 = console.nextDouble();
        System.out.println("Grade 3: ");
        grade3 = console.nextDouble();


        TestScores avg = new TestScores(grade1, grade2, grade3);

        System.out.println(avg.toString());
    }
}
