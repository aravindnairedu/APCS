package edu.kyleknobloch.APCS.Tests.midterm.Question1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kyle Knobloch
 * AP Computer Science Midterm Exam
 *
 * Question 1:
 * 35pt
 */

public class BoysAndGirls {

    private ArrayList<String> boys = new ArrayList<>();
    private ArrayList<String> girls = new ArrayList<>();


    public BoysAndGirls() {
        readArrays(); //Fill the array lists

    }

    private void readArrays() {
        String boysFile = "BoyNames.txt";
        String girlsFile = "GirlNames.txt";

        /* boys */
        try{
            // Open the files
            File boyFILE = new File(boysFile);
            Scanner theBoy = new Scanner(boyFILE);

            File girlFILE = new File(girlsFile);
            Scanner theGirl = new Scanner(girlFILE);

            /**
             * boys
             */
            while (theBoy.hasNext())
            {
                boys.add(theBoy.next());
                //System.out.print("boy"); //DEBUG
            }

            /**
             * girls
             */
            while (theGirl.hasNext())
            {
                girls.add(theGirl.next());
                //System.out.print("girl"); //DEBUG
            }

            // Close the files
            theBoy.close();
            theGirl.close();
        }
        catch(FileNotFoundException e) //Catch if no file found.
        {
            JOptionPane.showMessageDialog(null, "The file " + boysFile + " does not exist.");
        }
        catch(InputMismatchException e) //catch is wrong data type
        {
            JOptionPane.showMessageDialog(null, "Non-numeric data found in the file.");
        }
        catch (Exception e) { //Evreything else
            JOptionPane.showMessageDialog(null, "Some crazy shit went down! Lets try that again... " + e);
        }

        System.out.println("it is done."); //DEBUG
    }

    public String search (String name) {
        int count = 0;


        /**
         * boys search
         */
        for (int i = 0; i < boys.size(); i++) {
            if (name.equalsIgnoreCase(boys.get(i))) {
                count++;
            }
        }


        /**
         * girls search
         */
        for (int i = 0; i < girls.size(); i++) {
            if (name.equalsIgnoreCase(girls.get(i))) {
                count++;
            }
        }

        //return in message form
        return "The name \"" + name + "\" Appeared " + count + " time(s).";
    }


}
