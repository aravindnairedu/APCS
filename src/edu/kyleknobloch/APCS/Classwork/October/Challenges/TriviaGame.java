package edu.kyleknobloch.APCS.Classwork.October.Challenges;

import javax.swing.*;

/**
 * Trivia Game Tester
 */
public class TriviaGame {

    public static void main(String args[]) {
        Question questions = new Question(); //Setup my things
        Answer answers = new Answer();
        TriviaGame game = new TriviaGame();
        JOptionPane JO = new JOptionPane();
        String input;                        //for JO
        int winner;                          //I could find a way to not use this int but whatever.


        JOptionPane.showMessageDialog(null, "Welcome to the AP CS Trivia Game!\nI wish you luck. I didn't pass and I \nmade the test.. HAHAHAHA");

        //Get player names
        input = JOptionPane.showInputDialog(null, "What is Player 1's Name?");
        Player player1 = new Player(input);

        input = JOptionPane.showInputDialog(null, "What is player 2's Name?");
        Player player2 = new Player(input);


        //ready?
        JOptionPane.showMessageDialog(null, "Okay! " + player1.getName() + " Will start. Ready?");

        //player 1!
        for (int i = 1; i <= 5; i++) {
            if (checkCorrect(answers.getAnswer(i), game.runQuestion(questions.getQuestion(i)))) {
                player1.addOneToScore();
                JOptionPane.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
            } else
                JOptionPane.showMessageDialog(null, "That was wrong, sorry... Next question...");

        }


        //Time for player 2!
        JOptionPane.showMessageDialog(null, "That's it for " + player1.getName() + ". Now it's time for " + player2.getName() + "!!! Ready?");

        for (int i = 6; i <= 10; i++) {
            if (checkCorrect(answers.getAnswer(i), game.runQuestion(questions.getQuestion(i)))) {
                player2.addOneToScore();
                JOptionPane.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
            } else
                JOptionPane.showMessageDialog(null, "That was wrong, sorry... Next question...");

        }

        //Time to tally up the scores and see who won!
        JOptionPane.showMessageDialog(null, "That's it for the questions now. Who's ready to see who won?!?!?!!?!");

        winner = game.calcWinner(player1.getScore(), player2.getScore());

        if (winner == 1)
            JOptionPane.showMessageDialog(null, "The winner is " + player1.getName() + "!!!!! Congratulations. You won!");

        else if (winner == 2)
            JOptionPane.showMessageDialog(null, "The winner is " + player2.getName() + "!!!!! Congratulations. You won!");

        else if (winner == 0)
            JOptionPane.showMessageDialog(null, "The winner is BOTH OF YOU!!!!! Congratulations. You won!");

        else
            JOptionPane.showMessageDialog(null, "it's broken. "); // It's broken1


    }


    /**
     * Figure out the winner by checking each player's scores
     *
     * @param score1 First score to check
     * @param score2 Second score to check
     * @return 1: Player one wins
     *         2: Player two wins
     *         0: both win
     *        -1: it's broken
     */
    public int calcWinner (int score1, int score2) {
        if (score1 > score2)
            return 1;
        else if (score2 > score1)
            return  2;
        else if (score1 == score2)
            return 0;
        else
            return -1; // Something went wrong here!

    }


    /**
     * Run the question
     *
     * @param question What is the question?
     * @return Returns the player's score
     */
    public int runQuestion(String question) {

        return Integer.parseInt(JOptionPane.showInputDialog(null, question + "\n\nEnter the number that is correct."));
    }


    /**
     * Check to see if the answer is correct.
     *
     * @param correct The correct answer
     * @param answer  the player's answer
     * @return true if he was correct, false if incorrect.
     */
    public static boolean checkCorrect (int correct, int answer) {

        if (answer == correct)
            return true;
        else // Where any answer is correct (or all answers are correct)
            return correct == 0;

    }

}
