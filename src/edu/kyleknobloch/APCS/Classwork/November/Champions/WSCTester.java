package edu.kyleknobloch.APCS.Classwork.November.Champions;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by kyleknobloch on 11/2/15,
 * For
 * *
 * Actions:
 */
public class WSCTester {

    public static void main (String args[]) throws IOException {
        JOptionPane JO = new JOptionPane();
        WSC wsc = null;
        String input;
        int teamCount;

        input = JO.showInputDialog(null, "Welcome, Check to see how many times a team/name has come up in the file. Enter a file's name.\nCurrent Files:\nWorldSeriesWinners.txt - The World Series From 1903 to 2009. Note that the World Series was not played in 1904 or 1994, those years are not included.");

        try {
            wsc = new WSC(input);
        } catch (IOException e) {
            JO.showMessageDialog(null, "File not found. " + e);
            System.exit(0);
        }

        input = JO.showInputDialog(null, "What is the team you're searching for?");


        teamCount = wsc.teamCount(input); //get the number of teams

        JO.showMessageDialog(null, input + " won " + teamCount + " times. ");


    }
}
