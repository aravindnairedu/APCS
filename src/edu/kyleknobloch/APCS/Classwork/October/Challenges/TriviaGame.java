package edu.kyleknobloch.APCS.Classwork.October.Challenges;

import javax.swing.*;

/**
 * Trivia Game Tester
 */
public class TriviaGame {

    public static void main (String args[]) {
        Question questions = new Question(); //Setup my things
        Answer answers = new Answer();
        JOptionPane JO = new JOptionPane();  //
        String input;                        //for JO
        int winner;


        //Get player names
        input = JO.showInputDialog(null, "What is Player 1's Name?");
        Player player1 = new Player(input);

        input = JO.showInputDialog(null, "What is player 2's Name?");
        Player player2 = new Player(input);


        //ready?

        JO.showMessageDialog(null, "Okay! " + player1.getName() + " Will start. Ready?");


        //question 1
        if (answers.checkCorrect(answers.question1(), questions.runQuestion(questions.question1()))) {
            player1.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 2
        if (answers.checkCorrect(answers.questoin2(), questions.runQuestion(questions.questoin2()))) {
            player1.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 3
        if (answers.checkCorrect(answers.questoin3(), questions.runQuestion(questions.question3()))) {
            player1.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 4
        if (answers.checkCorrect(answers.questoin4(), questions.runQuestion(questions.question4()))) {
            player1.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 5
        if (answers.checkCorrect(answers.questoin5(), questions.runQuestion(questions.question5()))) {
            player1.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player1.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");


        //Time for player 2!
        JO.showMessageDialog(null, "That's it for " + player1.getName() + ". Now it's time for " + player2.getName() + "!!! Ready?");


        //question 6
        if (answers.checkCorrect(answers.questoin6(), questions.runQuestion(questions.question6()))) {
            player2.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 7
        if (answers.checkCorrect(answers.questoin7(), questions.runQuestion(questions.question7()))) {
            player2.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 8
        if (answers.checkCorrect(answers.questoin8(), questions.runQuestion(questions.question8()))) {
            player2.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 9
        if (answers.checkCorrect(answers.questoin9(), questions.runQuestion(questions.question9()))) {
            player2.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");

        //question 10
        if (answers.checkCorrect(answers.questoin10(), questions.runQuestion(questions.question10()))) {
            player2.addOneToScore();
            JO.showMessageDialog(null, "That was correct! Good job. Your score is now " + player2.getScore() + ". Next question...");
        } else
            JO.showMessageDialog(null, "That was wrong, sorry... Next question...");



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
