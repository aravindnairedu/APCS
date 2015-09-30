package edu.kyleknobloch.APCS.Classwork.September.Challenge;
import javax.swing.*;


public class Game {

    private int score;

    public Game() {

        int dice1, dice2, dice3, dice4, dice5, sum, turnsLeft;
        int turn = 0;
        boolean scored = false;
        String message = "";
        JOptionPane JO = new JOptionPane();


        do {
            //Calculate dice information
            dice1 = Die.roll();
            dice2 = Die.roll();
            dice3 = Die.roll();
            dice4 = Die.roll();
            dice5 = Die.roll();
            sum  = dice1 + dice2 + dice3 + dice4 + dice5;


            JO.showMessageDialog(null, "Your dice are: \n" + dice1 + "\n" + dice2 + "\n" + dice3 + "\n" + dice4 + "\n" + dice5 + "\n\nCalculating your score for this turn now!");

            //Check for YAHTEZZ
            if (dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5) {
                message ="You've rolled all the same numbers! Congratulations. Would you like 50 points? Good, I have them to you already!";
                addScore(50);
                scored = true;
            }

            //Check for a straight


            //Check for full house


            //Calculate chance
            if (!scored) {
                message = "Chance, we summed up the dice for you and added it to your score. It was " + sum + ".";
                addScore(sum);
                scored = true;
            }

            //Run some calculations
            turn++;
            turnsLeft = 5 - turn;
            scored = false; //reset the fact that there was a score added.

            //Display the score at the end of the round.
            JO.showMessageDialog(null, message + "\n\nYour score is currently " + getScore() + ". \nYou now have " + turnsLeft + " turns left.");


        } while (turn <= 4); //only 5 turns.

        JO.showMessageDialog(null, "This round has ended! Your final score was " + getScore() + "! Hope to see you again.");
    }

    /**
     * Get methods
     */

    public int getScore() {
        return score;
    }

    /**
     * Add methods
     */

    public void addScore(int addition) {
        score = score + addition;
    }
}
