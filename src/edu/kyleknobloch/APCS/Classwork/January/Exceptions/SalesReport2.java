package edu.kyleknobloch.APCS.Classwork.January.Exceptions;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
 
/**
  This program demonstrates how exception handlers can
  be used to recover from errors.
*/
 public class SalesReport2
 {
    public static void main(String[] args)
    {
       String filename = "SalesData.txt"; // File name
       int months = 0;                    // Month counter
       double oneMonth;                   // One month's sales
       double totalSales = 0.0;           // Total sales
       double averageSales;               // Average sales
       boolean fileErrorSent = false;
       boolean usingNewFile = false;
 
       // Create a DecimalFormat object.
       DecimalFormat dollar = new DecimalFormat("#,##0.00");

       //Check if you want to use the file or not.
       Object[] options = {"Use the usual file", "Use new file", "Quit"};
       int n = JOptionPane.showOptionDialog(null, "How would you like to run this report? ", "Sales Report Class",
               JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);

       switch (n) {
          case 0:
             break;
          case 1:
             usingNewFile = true;
             break;
          case 2:
             System.exit(1);
             break;
       }


       // Attempt to open the file by calling the
       // openfile method.
       Scanner inputFile = null;

       if (usingNewFile) {
          filename = JOptionPane.showInputDialog(null, "Enter a new file name: ");
          inputFile = openFile(filename);

          // If the openFile method returned null, then
          // the file was not found. Get a new file name.
          while (inputFile == null) {
             filename = JOptionPane.showInputDialog(null, "ERROR: " + filename + " does not exist.\n" + "Enter another file name: ");
             inputFile = openFile(filename);
          }
       } else {
          inputFile = openFile(filename);
       }

       // Process the contents of the file.
       while (inputFile.hasNext())
       {
          try
          {
             // Get a month's sales amount.
             oneMonth = inputFile.nextDouble();
  
             // Accumulate the amount.
             totalSales += oneMonth;
                
             // Increment the month counter.
             months++;
          }
          catch(InputMismatchException e)
          {

             if (!fileErrorSent) {
                // Display an error message.
                JOptionPane.showMessageDialog(null, "Non-numeric data found in the file.\nThe invalid record(s) will be skipped.");
                fileErrorSent = true;
                System.out.println("Here is the bad data: ");
             }

             // Skip past the invalid data.
             System.out.println(inputFile.nextLine());

          }
       }
 
       // Close the file.
       inputFile.close();
 
       // Calculate the average.
       averageSales = totalSales / months;
 
       // Display the results.
       JOptionPane.showMessageDialog(null,
                 "Number of months: " + months +
                 "\nTotal Sales: $" +
                 dollar.format(totalSales) +
                 "\nAverage Sales: $" +
                 dollar.format(averageSales));
       System.exit(0);
    }
 
    /**
       The opeFile method opens the specified file and
       returns a reference to a Scanner object.
       @param filename The name of the file to open.
       @return A Scanner reference, if the file exists
               Otherwise, null is returned.
    */
 
    public static Scanner openFile(String filename)
    {
       Scanner scan;
 
       // Attempt to open the file.
       try
       {
          File file = new File(filename);
          scan = new Scanner(file);
       }
       catch(FileNotFoundException e)
       {
          scan = null;
       }
 
       return scan;
    }
 }
