package edu.kyleknobloch.APCS.Classwork.October;

import javax.swing.*;

/**
 * Extra Credit Tester for Chapter 4, Excersise 12.
 */
public class ExtraCreditTester {

    public static void main (String args[]) {
        double s1, s2, s3, s4, s5;
        String input;
        JOptionPane JO = new JOptionPane();


        Chap4Ex12 ec = new Chap4Ex12(2453, 4324, 784, 8395, 4389);
        Chap4Ex12 ec2 = new Chap4Ex12();

        JO.showMessageDialog(null, ec.toString());

        ec2.setStores(700, 800, 900, 1000, 1100);

        JO.showMessageDialog(null, ec2.toString());


        input = JO.showInputDialog(null, "Store 1 Sales: ");
        s1 = Double.parseDouble(input);

        input = JO.showInputDialog(null, "Store 2 Sales: ");
        s2 = Double.parseDouble(input);

        input = JO.showInputDialog(null, "Store 3 Sales: ");
        s3 = Double.parseDouble(input);

        input = JO.showInputDialog(null, "Store 4 Sales: ");
        s4 = Double.parseDouble(input);

        input = JO.showInputDialog(null, "Store 5 Sales: ");
        s5 = Double.parseDouble(input);


        Chap4Ex12 ec3 = new Chap4Ex12(s1, s2, s3, s4, s5);

        JO.showMessageDialog(null, ec3.toString());

        System.out.println("bye");

    }
}
