package edu.kyleknobloch.APCS.Classwork.September;

import javax.swing.*;
import java.util.StringTokenizer;

/**
   This program demonstrates using dialogs with 
   JOptionPane.
*/

public class PayrollDialog
{
   public static void main(String[] args)
   {

       String inputString; // For reading input
       String inputHours;
       String name;        // The user's name
       int hours =0;          // The number of hours worked
       double workingPay;
       double payRate;     // The user's hourly pay rate
       double grossPay=0;    // The user's gross pay


       // Get the user's name.
       name = JOptionPane.showInputDialog("What is your name? ");

       // Get the hours worked.
       inputHours = JOptionPane.showInputDialog("How many hours did you work this week? ");

       StringTokenizer ST = new StringTokenizer(inputHours, ".");

       // Convert the input to an int.
       //hours = Integer.parseInt(inputString);

       // Get the hourly pay rate.
       inputString = JOptionPane.showInputDialog("What is your hourly pay rate? ");

       // Convert the input to a double.
       payRate = Double.parseDouble(inputString);

       // Calculate the gross pay.

       while (ST.hasMoreTokens()) {
           double whileFiles = Integer.parseInt(ST.nextToken());

           workingPay = whileFiles * payRate;


           grossPay = grossPay + workingPay;

       }


       grossPay = hours * payRate;

       // Display the results.
       JOptionPane.showMessageDialog(null, "Hello " + name + ". Your gross pay is $" + grossPay);

       // End the program.
       System.exit(0);
   }
}