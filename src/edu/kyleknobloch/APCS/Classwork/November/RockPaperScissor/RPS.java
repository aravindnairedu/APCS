package edu.kyleknobloch.APCS.Classwork.November.RockPaperScissor;

import javax.swing.*;

/**
 * Rock Paper Scissor!
 * Author: @fredghostkyle
 * GitHub: github.com/fredghostkyle
 */

public class RPS {

    public RPS() {
        //I do nothing, trust me I'm a default constructor.
    }


    /**
     * Calculate the AI's hand.
     *
     * @param previous The player's previous hand
     * @return The AI's Hand
     */
    public String calcAIHand(String previous) {

        if (previous == null || previous.equalsIgnoreCase("none"))
            return "Rock";
        else if (previous.equalsIgnoreCase("Rock"))  //rock
            return "Paper";
        else if (previous.equalsIgnoreCase("Paper"))  //paper
            return "Scissor";
        else if (previous.equalsIgnoreCase("Scissor"))  //scissor
            return "Rock";
        else
            return "Rock"; //R is favored
    }


    /**
     * Calcuate the player's hand (using JOptionPane)
     *
     * @return the player's hand
     */
    public String calcPlayerHand() {
        Object[] options = {"ROCK!",
                "PAPER!",
                "SCISSORS! ",
                "Exit"};
        int n = JOptionPane.showOptionDialog(null, "Please choose your throw:", "RPS!!!!",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);

        //System.out.println(n); //DEBUG

        switch (n) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissor";
            case 3:
                return "EXIT";
            case -1:
                System.exit(-1);
            default:
                return "none";
        }
    }


    /**
     * Calculate the result of the round
     *
     * @param computer computer's hand
     * @param player   player's hand
     * @return who won (Tie, computer, player, EXIT, ERROR)
     */
    public String calcResult(String computer, String player) {
        if (player.equalsIgnoreCase("exit"))
            return "exit";
        else if (computer.equalsIgnoreCase(player))
            return "tie";
        else if (computer.equalsIgnoreCase("Rock") && player.equalsIgnoreCase("Paper"))
            return "player";
        else if (computer.equalsIgnoreCase("Paper") && player.equalsIgnoreCase("Scissor"))
            return "player";
        else if (computer.equalsIgnoreCase("Scissor") && player.equalsIgnoreCase("Rock"))
            return "player";
        else if (player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Paper"))
            return "computer";
        else if (player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Scissor"))
            return "computer";
        else if (player.equalsIgnoreCase("Scissor") && computer.equalsIgnoreCase("Rock"))
            return "computer";
        else
            return "error";
    }

}
