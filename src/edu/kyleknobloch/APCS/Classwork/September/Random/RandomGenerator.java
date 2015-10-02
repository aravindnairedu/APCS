package edu.kyleknobloch.APCS.Classwork.September.Random;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by kyleknobloch on 9/25/15,
 * For
 * *
 * Actions:
 */
public class RandomGenerator {

    public static void main (String[] args) {
        Random random = new Random();
        JOptionPane JO = new JOptionPane();
        int again =0;
        String input;
        int number;
        int highest;


        input = JO.showInputDialog(null, "What should be the highest number possible to get when generating a number?");
        highest = Integer.parseInt(input);

        while(again == 0) {

            number = random.nextInt(highest) +1;
            //JO.showMessageDialog(null, "Your number is " + number + ".");

            again = JO.showConfirmDialog(null, "Your number is " + number + "\nWould you like to go again?");

        }

        System.out.println("Okay bye :/");
    }
}
