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
 * Olympic Gold Medals
 *
 * Show all the sport, in that sport's text file it should have what country has won gold.
 *
 * STORY: I have a user who wants to know how many times the USA has won in Field Hockey (18).
 */
public class OlympicApplication {

    private ArrayList<String> sport = new ArrayList<>();
    private ArrayList<String> medal = new ArrayList<>();
    private ArrayList<String> fileName = new ArrayList<>();

    public static void main (String args[]) throws IOException {
        String input;
        int INDEX;

        OlympicApplication app = new OlympicApplication();
        Scanner console = new Scanner(System.in);

        app.fillArray(); //fill the array


        System.out.println(app.message()); // Display the menu
        INDEX = console.nextInt(); // Your option is now an int! Congratulations.


        // Now we get the file setup
        Championship champ = null;
        try {
            champ = new Championship(app.fileName.get(INDEX));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There was an error finding that sport's file. Sorry about that. Here's the error message:\n" + e);
            System.exit(0);
        }


        // Preform the forever search!
        do {
            input = JOptionPane.showInputDialog(null, "What is the team you're searching for?");
            if (input.isEmpty()) break;              // It works, don't worry about it.
            JOptionPane.showMessageDialog(null, input + " has received " + app.medal.get(INDEX) + " " + champ.search(input) + " times in" + app.sport.get(INDEX));

        } while (!input.isEmpty());


        // Finish
        JOptionPane.showMessageDialog(null, "Goodbye! ");


    }


    private void fillArray() throws FileNotFoundException {
        File masterFile = new File("OlympicMasterList.txt");
        Scanner scanner = new Scanner(masterFile);
        int i = 0;


        // Fill up the array
        while (scanner.hasNextLine()) {
            // Sport
            StringTokenizer ST = new StringTokenizer(scanner.next(), "_");
            String S_sport="";

            while (ST.hasMoreElements())
                S_sport = S_sport + " " + ST.nextElement();

            sport.add(i, S_sport);


            medal.add(i, scanner.next()); //gold/silver/bronze
            fileName.add(i, scanner.next()); // File name
            i++; // Increment
        }

        scanner.close();
    }

    private String message() {
        String message = "Olympic Sports and number of golds below: \n";

        // Messages String for the menu
        for (int i = 0; i < sport.size(); i++){
            message = message + i + ".)" + sport.get(i) + " - " + medal.get(i) +"\n";
        }
        message = message + "Please enter the number of your selection.";

        return message;
    }


}
