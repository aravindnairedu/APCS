package edu.kyleknobloch.APCS.Homework.November;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Chapter 7 Ex 5: Driver's License Exam
 */
public class Chap7Ex5 {

    public static void main (String args[]) {

        ArrayList<Character> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        answers.add(0, null);

        for (int i = 1; i < 21; i++) {
            System.out.println("Question " + i +" Answer: ");
            answers.add(i, scanner.nextLine().charAt(0));

        }

        Chap7Ex5 RMVTest = new Chap7Ex5(answers.get(1), answers.get(2), answers.get(3), answers.get(4), answers.get(5), answers.get(6), answers.get(7), answers.get(8), answers.get(9), answers.get(10), answers.get(11), answers.get(12), answers.get(13), answers.get(14), answers.get(15), answers.get(16), answers.get(17), answers.get(18), answers.get(19), answers.get(20));


        JOptionPane.showMessageDialog(null, RMVTest.toString() + "\n" + RMVTest.getQuestionsMissed());

    }


    private boolean passed;
    private int correct;
    private int incorrect;
    private ArrayList<Integer> questionsMissed = new ArrayList<>();
    private ArrayList<Character> studentAnswers = new ArrayList<>();
    private ArrayList<Character> correctAnswers = new ArrayList<>();


    public Chap7Ex5 (char q1, char q2, char q3, char q4, char q5, char q6, char q7, char q8, char q9, char q10, char q11, char q12, char q13, char q14, char q15, char q16, char q17, char q18, char q19, char q20) {
        passed = false;
        correct = -1;
        incorrect = -1;

        studentAnswers.add(0, 'A');
        studentAnswers.add(1, q1);
        studentAnswers.add(2, q2);
        studentAnswers.add(3, q3);
        studentAnswers.add(4, q4);
        studentAnswers.add(5, q5);
        studentAnswers.add(6, q6);
        studentAnswers.add(7, q7);
        studentAnswers.add(8, q8);
        studentAnswers.add(9, q9);
        studentAnswers.add(10, q10);
        studentAnswers.add(11, q11);
        studentAnswers.add(12, q12);
        studentAnswers.add(13, q13);
        studentAnswers.add(14, q14);
        studentAnswers.add(15, q15);
        studentAnswers.add(16, q16);
        studentAnswers.add(17, q17);
        studentAnswers.add(18, q18);
        studentAnswers.add(19, q19);
        studentAnswers.add(20, q20);

        correctAnswers.add(0, 'A');
        correctAnswers.add(1, 'B');
        correctAnswers.add(2, 'D');
        correctAnswers.add(3, 'A');
        correctAnswers.add(4, 'A');
        correctAnswers.add(5, 'C');
        correctAnswers.add(6, 'A');
        correctAnswers.add(7, 'B');
        correctAnswers.add(8, 'A');
        correctAnswers.add(9, 'C');
        correctAnswers.add(10, 'D');
        correctAnswers.add(11, 'B');
        correctAnswers.add(12, 'C');
        correctAnswers.add(13, 'D');
        correctAnswers.add(14, 'A');
        correctAnswers.add(15, 'D');
        correctAnswers.add(16, 'C');
        correctAnswers.add(17, 'C');
        correctAnswers.add(18, 'B');
        correctAnswers.add(19, 'D');
        correctAnswers.add(20, 'A');


        scoreTest();

    }


    /**
     * Calculate pass/fail
     */
    public void scoreTest () {

        correct = incorrect = 0; //reset the values from initilization.

        for (int i = 1; i < 20; i++) {
            if (correctAnswers.get(i) == studentAnswers.get(i)) {
                correct++;
            } else {
                incorrect++;
                questionsMissed.add(i);
            }
        }

        passed = correct >= 15;

    }


    /**
     * Returns weather or not the test taker passed or failed
     * @return
     */
    @Override
    public String toString() {
        if (passed)
            return "The student passed the test.";
        else
            return "The student did not pass the test.";

    }


    /**
     * get methods
     */
    public int getCorrect() {
        return correct;
    }

    public int getIncorrect() {
        return incorrect;
    }

    public boolean getPassed() {
        return passed;
    }

    public ArrayList<Integer> getQuestionsMissedArray() {
        return questionsMissed;
    }

    /**
     * Basicly an advanced toString method
     */
    public String getQuestionsMissed () {
        String message = "Questions Missed: \n";

        for (int i = 0; i < questionsMissed.size(); i++){
            message = message + questionsMissed.get(i) + ".) " + correctAnswers.get(questionsMissed.get(i)) + " \n";
        }

        return message;
    }
}
