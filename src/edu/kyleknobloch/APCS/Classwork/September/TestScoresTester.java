package edu.kyleknobloch.APCS.Classwork.September;

import java.util.Scanner;

public class TestScoresTester {

    public static void main (String args[]) {

        double grade1, grade2, grade3;

        Scanner console = new Scanner(System.in);
        TestScores test = new TestScores();


        System.out.println("Grade 1: ");
        grade1 = console.nextDouble();
        System.out.println("Letter grade is: " + test.findLetterGrade(grade1));
        System.out.println("Grade 2: ");
        grade2 = console.nextDouble();
        System.out.println("Letter grade is: " + test.findLetterGrade(grade2));
        System.out.println("Grade 3: ");
        grade3 = console.nextDouble();
        System.out.println("Letter grade is: " + test.findLetterGrade(grade3));


        TestScores avg = new TestScores(grade1, grade2, grade3);




    }
}
