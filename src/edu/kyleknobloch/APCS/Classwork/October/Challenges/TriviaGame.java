package edu.kyleknobloch.APCS.Classwork.October.Challenges;

import javax.swing.*;

/**
 * Trivia Game Tester
 */
public class TriviaGame {

    public static void main (String args[]) {
        Question questions = new Question(); //Setup my things
        Answer answers = new Answer();
        JOptionPane JO = new JOptionPane();
        String input;                        //for JO
        int winner;                          //I could find a way to not use this int but whatever.


        JO.showMessageDialog(null, "Welcome to the AP CS Trivia Game!\nI wish you luck. I didn't pass and I \nmade the test.. HAHAHAHA");

        //Get player names
        input = JO.showInputDialog(null, "What is Player 1's Name?");
        Player player1 = new Player(input);

        input = JO.showInputDialog(null, "What is player 2's Name?");
        Player player2 = new Player(input);


        //ready?
        JO.showMessageDialog(null, "Okay! " + player1.getName() + " Will start. Ready?");

        //player 1!
        for (int i = 1; i <= 5; i++) {
            if (answers.checkCorrect(answers.getAnswer(i), questions.runQuestion(questions.getQuestion(i)))) {
                player1.addOneToScore();
                JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
            } else
                JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        }


        //Time for player 2!
        JO.showMessageDialog(null, "That's it for " + player1.getName() + ". Now it's time for " + player2.getName() + "!!! Ready?");

        for (int i = 6; i <= 10; i++) {
            if (answers.checkCorrect(answers.getAnswer(i), questions.runQuestion(questions.getQuestion(i)))) {
                player2.addOneToScore();
                JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
            } else
                JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        }

        //Time to tally up the scores and see who won!
        JO.showMessageDialog(null, "That's it for the questions now. Who's ready to see who won?!?!?!!?!");

        winner = player1.calcWinner(player1.getScore(), player2.getScore());

        if (winner == 1)
            JO.showMessageDialog(null, "The winner is " + player1.getName() + "!!!!! Congraduations. You won!");

        else if (winner == 2)
            JO.showMessageDialog(null, "The winner is " + player2.getName() + "!!!!! Congraduations. You won!");

        else if (winner == 0)
            JO.showMessageDialog(null, "The winner is BOTH OF YOU!!!!! Congraduations. You won!");

        else
            JO.showMessageDialog(null, "it's broken. ");


    }


}
