package edu.kyleknobloch.APCS.Classwork.September.Challenge;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kyleknobloch on 9/25/15,
 * For
 * *
 * Actions:
 */
public class CrapCasino {

    public static int roll1;
    public static int roll2;

    public static void main (String[] args) {
        JOptionPane JO = new JOptionPane();
        int again;
        int addition;
        String message;


        again = JO.showConfirmDialog(null, "Would you like to play some Crap?");

        while (again == 0) {

            //Roll the dice!
            //add 1 because you can't get 0 as a Coin.

            roll1 = Die.roll();
            roll2 = Die.roll();
            addition = roll1 + roll2;

            //figure out the message, if any

            switch (addition) {
                case 2:
                    message = "You got SNAKE EYES! You lost. ";
                    break;
                case 7:
                case 11:
                    message = "You win!";
                    break;
                case 12:
                    message = "You got the other thingie. You lost. ";
                    break;
                default:
                    message = "You lost :(";
                    break;
            }

            again = JO.showConfirmDialog(null, "First dice: " + roll1 + "" + "\nSecond dice: " + roll2 + "\n\n" + message + " \n\nWould you like to play again? </html>");

            if (again == 2) {
                System.exit(2);
            }
        }

        JO.showMessageDialog(null, "Have a very very very nice day! ");

    }


}
