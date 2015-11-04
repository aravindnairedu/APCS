package edu.kyleknobloch.APCS.Classwork.October.Challenges;

import java.util.ArrayList;

/**
 * Answers
 */
public class Answer {

    private ArrayList<Integer> answers = new ArrayList<>();


    /**
     * pre:  The ArrayList answers has been created
     * post: The answers will be posted to that ArrayList
     */
    public Answer () {
        answers.add(0, -1);
        answers.add(1, 2);
        answers.add(2, 1);
        answers.add(3, 3);
        answers.add(4, 4);
        answers.add(5, 1);
        answers.add(6, 4);
        answers.add(7, 1);
        answers.add(8, 2);
        answers.add(9, 4);
        answers.add(10, 0);
    }


    /**
     * Get the answer to the question
     * @param index the question number
     * @return the question's answer in Int form
     */
    public int getAnswer(int index) {
        return answers.get(index);
    }


}
