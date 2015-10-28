package edu.kyleknobloch.APCS.Classwork.October.Challenges;

/**
 * Created by kyleknobloch on 10/28/15,
 * For
 * *
 * Actions:
 */
public class Answer {


    public void Answers () {
        //I do nothing
    }


    /**
     * Give the answer to the question
     * @pre none
     * @return the answer in Int form
     */
    public int question1 () {
        return 2;
    }

    public int questoin2 () {
        return 1;
    }

    public int questoin3 () {
        return 3;
    }

    public int questoin4 () {
        return 4;
    }

    public int questoin5 () {
        return 1;
    }

    public int questoin6 () {
        return 4;
    }

    public int questoin7 () {
        return 1;
    }

    public int questoin8 () {
        return 2;
    }

    public int questoin9 () {
        return 4;
    }

    public int questoin10 () {
        return 0;
    }


    /**
     *
     * @param correct The correct answer
     * @param answer  the player's answer
     * @return true if he was correct, false if incorrect.
     */
    public static boolean checkCorrect (int correct, int answer) {

        if (answer == correct)
            return true;
        else if (answer == 0)
            return true;
        else
            return false;

    }
}
