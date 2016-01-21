package edu.kyleknobloch.APCS.Tests.midterm.Question1;

import javax.swing.*;

/**
 * Kyle Knobloch
 * AP Computer Science Midterm Exam
 *
 * Question 1:
 * 35pt
 *
 * Boys and Girls Names
 *
 *
 * THIS IS THE TESTER CLASS
 *
 */
public class Names {

    public static void main (String args[]) {

        BoysAndGirls names = new BoysAndGirls();

        String name = JOptionPane.showInputDialog(null, "What is the name you're searching for? ");
        JOptionPane.showMessageDialog(null, names.search(name));

    }

}
