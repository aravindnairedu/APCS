package edu.kyleknobloch.APCS.Classwork.September.Challenge;
import javax.swing.JOptionPane;


public class YAHTEZZ {

    public static void main (String[] args) {
        JOptionPane JO = new JOptionPane();
        int option;


        do {
            //Would you like to play a game?
            option = JO.showConfirmDialog(null, "Would you like to play some YAHTEZZ!??!?!?!");

            switch (option) {                   //What was the answer?
                case 0:                         //Yes
                    introduction();
                    Game yahtezz = new Game();
                    break;
                case 1:                         //No & Cancel
                case 2:
                    JOptionPane.showMessageDialog(null, "Good bye!");
                    break;
                default:                        //you clicked out of the box, dumb ass
                    JO.showMessageDialog(null, "The world has ended. (Something went wrong)");
                    break;
            }

        } while (option == 0); //Re-ask since you played one round.
    }

    public static void introduction() {
        //Run the introduction

        JOptionPane.showMessageDialog(null, "Welcome to YAHTEZZ! \nHere's how to gain points:\n\n" +
                                            "Four of a kind:                                30pt" + "\n" +
                                            "Straight (consecutive numbers):     40pt" + "\n" +
                                            "Full House (3 and 2 of a kind):       35pt" + "\n" +
                                            "YAHTEZZ (all 5 dice are the same): 50pt" + "\n" +
                                            "Chance (sum of the die):                varies\n\n" +
                                            "You will have 5 turns, each turn will result in points. " +
                                            "\n5 dice will be rolled on each turn.\n" + "" +
                                            "Points will be added and then you will get a final score.\n\n" +
                                            "Ready? Okay, lets start playing! ");

    }
}
