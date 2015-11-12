package edu.kyleknobloch.APCS.Classwork.November.Champions;


import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * Page 520 (pdf) - 494 (book)
 *
 * 14. World Series Champions
 * If you have downloaded this book's source code (the companion Web site is available at www.pearsonhiglicred.com/gaddis),
 * you will find a file named WorldSeriesWinners.txt. This file contains a chronological list of the winning teams in the
 * World Series from 1903 through 2009. (The first line in the file is the name of the team that won in 190 J, and the last
 * line is the name of the team that won in 2009. Note that the World Series was not played in 1904 or 1994, so those years
 * are skipped in the file.)
 * Write a program that lets the user enter the name of a team, and then displays the number of times that team has won
 * the World Series in the time period from 1903 through 2009.
 */
public class ChampionshipsApp {


    private ArrayList<String> sport = new ArrayList<>();
    private ArrayList<String> championship = new ArrayList<>();
    private ArrayList<String> fileName = new ArrayList<>();

    public static void main (String args[]) throws IOException {
        // TODO: Make the menu run in a do while loop.

        String input;
        int INDEX;
        ChampionshipsApp app = new ChampionshipsApp();


        app.fillArray();

        input = JOptionPane.showInputDialog(null, app.message()); // Display the menu
        INDEX = Integer.parseInt(input); // Your option is now an int! Congratulations.


        // Now we get the file setup
        Championship champ = null;
        try {
            champ = new Championship(app.fileName.get(INDEX));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There was an error finding that file. Sorry about that. Here's the error message:\n" + e);
        }


        // Preform the forever search!
        do {
            input = JOptionPane.showInputDialog(null, "What is the team you're searching for?");
            if (input.isEmpty()) break;              // It works, don't worry about it.
            JOptionPane.showMessageDialog(null, input + " won " + champ.search(input) + " times in the " + app.championship.get(INDEX));

        } while (!input.isEmpty());


        // Finish
        JOptionPane.showMessageDialog(null, "Goodbye! ");


    }


    private void fillArray() throws FileNotFoundException {
        File masterFile = new File("MasterList.txt");
        Scanner scanner = new Scanner(masterFile);
        int i = 0;

        while (scanner.hasNext()) {
            sport.add(i, scanner.next()); // Sport name

            // Championship
            StringTokenizer ST = new StringTokenizer(scanner.next(), "_");
            String champ = "";
            while (ST.hasMoreElements())
                champ = champ + " " + ST.nextElement();

            championship.add(i, champ);

            fileName.add(i, scanner.next()); // File name
            i++; // Increment

        }

        scanner.close();
    }

    private String message() {
        String message = "";

        // Messages String for the menu
        for (int i = 0; i < sport.size(); i++){
            message = message + i + ".) " + sport.get(i) + " - " + championship.get(i) + ".\n";
        }
        message = message + "Please enter the number of your selection.";

        return message;
    }


}
