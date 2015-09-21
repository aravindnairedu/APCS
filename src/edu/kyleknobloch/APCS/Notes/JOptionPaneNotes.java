package edu.kyleknobloch.APCS.Notes;

import javax.swing.JOptionPane;
/**
 * Created by kyleknobloch on 9/21/15,
 * For
 * *
 * Actions:
 */
public class JOptionPaneNotes {
    public static void main (String args[]) {

        double dNum1, dNum2;
        int iNum1, iNum2;
        double average;
        String input;


        input = JOptionPane.showInputDialog("Enter double 1:");
        dNum1 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter double 2:");
        dNum2 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter int 1:");
        iNum1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter int 2");
        iNum2 = Integer.parseInt(input);
    }
}
