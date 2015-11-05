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
 If you have downloaded this book's source code (the companion Web site is available at www.pearsonhiglicred.com/gaddis),
 you will find a file named WorltiSeriesWinners.txt. This file contains a chronological list of the winning teams in the
 World Scries from 1903 through 2009. (The first line in the file is the name of the team that won in 190 J, and the last
 line is the name of the team that won in 2009. Note that the World Series was not played in 1904 or 1994, so those years
 are skipped in the file.)
 Write a program that lets the user enter the name of a team, and then displays the number of times that team has won
 the World Series in the time period from 1903 through 2009.
 */
public class ChapApplication {

    public static void main (String args[]) throws IOException {
        // TODO: More options for things to have champions of. Example that Drugan gave us was for multiple olympics years, the models they won and in what areas they won them.

        String input;
        String message = "";
        int i = 0;
        int INDEX;
        ChapApplication CA = new ChapApplication();
        ArrayList<String> sport = new ArrayList<>();
        ArrayList<String> championship = new ArrayList<>();
        ArrayList<String> fileName = new ArrayList<>();

        File file = new File("MasterList.txt");
        Scanner filling = new Scanner(file);


        // Fill up the array
        while (filling.hasNextLine()) {
            sport.add(i, filling.next()); // Sport name

            // Championship
            StringTokenizer ST = new StringTokenizer(filling.next(), "_");
            String champ="";
            while (ST.hasMoreElements()) {
                champ = champ + " " + ST.nextElement();
            }
            championship.add(i, champ);

            fileName.add(i, filling.next()); // File name
            i++; // Increment
        }

        // Messages String for the menu
        for (int index = 0; index < sport.size(); index++){
            message = message + index + ".) " + sport.get(index) + " - " + championship.get(index) + ".\n";
        }
        message = message + "Please enter the number of your selection.";


        input = JOptionPane.showInputDialog(null, message); // Display the menu
        INDEX = Integer.parseInt(input); //Your option is now an int! Congratulations.


        // Now we get the file setup
        Championship champ = null;
        try {
            champ = new Championship(fileName.get(INDEX));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There was an error finding that file. Sorry about that. Here's the error message:\n" + e);
        }

        // SEARCH
        do {        // Run the search methods
            input = JOptionPane.showInputDialog(null, "What is the team you're searching for?");
            if (input.isEmpty()) break;              // It works, don't worry about it.
            JOptionPane.showMessageDialog(null, input + " won " + champ.search(input) + " times in the " + championship.get(INDEX));

        } while (!input.isEmpty());

        // Finish
        JOptionPane.showMessageDialog(null, "Goodbye! ");


    }


}
