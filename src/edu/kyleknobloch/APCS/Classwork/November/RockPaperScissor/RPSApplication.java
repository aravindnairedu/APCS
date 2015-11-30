package edu.kyleknobloch.APCS.Classwork.November.RockPaperScissor;

import javax.swing.*;

/**
 * Rock Paper Scissor!
 * Author: @fredghostkyle
 * GitHub: github.com/fredghostkyle
 */

public class RPSApplication {

    public static void main (String args[]) {
        RPS rps = new RPS();
        Player player1;
        Player computer = new Player("Artificial Intelligence");
        String input;

        //Display game information
        JOptionPane.showMessageDialog(null, "Welcome to Rock! Paper! Scissor! SHOOE!!!!!!\n" +
                                            "You'll be playing against " + computer.getName() + ". He is very smart!\n" +
                                            "But don't worry I'm sure you'll be able to beat him!\n\n" +
                                            "Here's how to play: \n" +
                                            "You will select Rock, Paper or Scissor. Then we will compare it to the\n" +
                                            "computer's selection. We promise we are not cheating, the AI will \n" +
                                            "pick before you based on your previous hand. \n\nGOOD LUCK! ");

        //Get the player's name
        input = JOptionPane.showInputDialog(null, "What is your name?");
        player1 = new Player(input); //setup player1.

        //Run the rounds untill the playher hits exit (then it will System.exit())
        do {

            //Get Computers's hand
            computer.setHand(rps.calcAIHand(player1.getHand()));
            //System.out.print(computer.getHand()); //DEBUG

            //Get Player's hand
            player1.setHand(rps.calcPlayerHand());

            //check the results
            String check = rps.calcResult(computer.getHand(), player1.getHand());

            //Display what happened with the results
            if (check.equalsIgnoreCase("exit")) {

                String message = "";

                if (computer.getScore() == player1.getScore()) {
                    message = "\nIt's a TIE!!! Better luck next time. ";
                } else if (computer.getScore() > player1.getScore()) {
                    message = "\n" + computer.getName() + " WINS! Better luck next time";
                } else if (player1.getScore() > computer.getScore()) {
                    message = "\nCongratulations " + player1.getName() + "! You win!!!!";
                }

                JOptionPane.showMessageDialog(null, "The final scores are:\n" + computer.getName() + ": " + computer.getScore() + "\n" + player1.getName() + ": " + player1.getScore() + message);
                System.exit(0);
            }
            else if (check.equalsIgnoreCase("tie")) {
                JOptionPane.showMessageDialog(null, "You both threw " + computer.getHand() + "! It's a tie. No points given."  + "\nThe score is still\n" + computer.getName() + ": " + computer.getScore() + "\n" + player1.getName() + ": " + player1.getScore());
            } else if (check.equalsIgnoreCase("computer")) {
                JOptionPane.showMessageDialog(null, "You chose " + player1.getHand() + " and the comptuer chose " + computer.getHand() + ".\n" + "The computer won! Better luck next time! " + "\nThe score is now\n" + computer.getName() + ": " + computer.getScore() + "\n" + player1.getName() + ": " + player1.getScore());
                computer.plusOneScore();
            } else if (check.equalsIgnoreCase("player")){
                JOptionPane.showMessageDialog(null, "You chose " + player1.getHand() + " and the comptuer chose " + computer.getHand() + ".\n" + "YOU WIN! You get a point!" + "\nThe score is now\n" + computer.getName() + ": " + computer.getScore() + "\n" + player1.getName() + ": " + player1.getScore());
                player1.plusOneScore();
            } else {
               JOptionPane.showMessageDialog(null, "Sorry, something went wrong!!!!! Quick put out the flames! ");
            }

        } while (true); //Just keep swimming, just keep swimming!

    }

}
