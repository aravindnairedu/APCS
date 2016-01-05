package edu.kyleknobloch.APCS.Classwork.January;

import javax.swing.*;

/**
   This program demonstrates how the Integer.parseInt
   method throws an exception.
*/

public class ParseIntError
{
   public static void main(String[] args)
   {
       String str;
       int number;

       for (int i = 0; i < 3; i++) {
           str = JOptionPane.showInputDialog(null, "Please enter a number: ");

           try {
               number = Integer.parseInt(str);
               JOptionPane.showMessageDialog(null, "Here's the int: " + number);
           } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Conversion error: " + e.getMessage());
           }
       }
   }
}
