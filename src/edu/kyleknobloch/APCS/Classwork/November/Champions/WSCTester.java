package edu.kyleknobloch.APCS.Classwork.November.Champions;

import javax.swing.*;
import java.io.IOException;

/**
 *
 * Page 520 (pdf) - 494 book
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
public class WSCTester {

    public static void main (String args[]) throws IOException {
        JOptionPane JO = new JOptionPane();
        WSC wsc = null;
        String input;

        input = JO.showInputDialog(null, "Welcome, Check to see how many times a team/name has come up in the file. Enter a file's name.\nCurrent Files:\nWorldSeriesWinners.txt - The World Series From 1903 to 2009. Note that the World Series was not played in 1904 or 1994, those years are not included.");

        try {
            wsc = new WSC(input);
        } catch (IOException e) {
            JO.showMessageDialog(null, "File not found. \nError Message:" + e);
            System.exit(0);
        }

        do {
            input = JO.showInputDialog(null, "What is the team you're searching for?");
            JO.showMessageDialog(null, input + " won " + wsc.teamCount(input) + " times. ");
        } while (!input.isEmpty());



    }
}
