package edu.kyleknobloch.APCS.Classwork.January;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   This program demonstrates how a FileNotFoundException
   exception can be handled.
*/

public class OpenFile
{
   public static void main(String[] args)
   {
      File file;         // For file input
      Scanner inputFile = null; // For file input
      String fileName;   // To hold a file name
      int counter = 1;
      

   do
   {
            // Get a file name from the user.
      fileName = JOptionPane.showInputDialog("Enter the name of a file:");
      // Attempt to open the file.
      try
      {
         file = new File(fileName);
         inputFile = new Scanner(file);
         JOptionPane.showMessageDialog(null, "The file WAS found. \nFile name: " + file.getName());
      }
      catch (FileNotFoundException e)
      {

         if (counter == 3)
            JOptionPane.showMessageDialog(null, "File NOT found (MAX attempts reached, 3)\nError: " + e); //display the error message
         else
            JOptionPane.showMessageDialog(null, "File NOT found (attempt " + counter + ")\nError: " + e); //display the error message

         counter++;
         //System.out.println(e); //DEBUG
      }
    } while ( inputFile == null && counter < 4);


      if (counter < 4) { //finish program message
         JOptionPane.showInputDialog(null, "Too many tries! ");
         System.exit(-1);
      } else {
         JOptionPane.showMessageDialog(null, "Bye bye.");
         System.exit(0);
      }

   }
}