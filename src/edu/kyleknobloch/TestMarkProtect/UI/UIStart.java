package edu.kyleknobloch.TestMarkProtect.UI;

import javax.swing.*;

/**
 * Created by kyleknobloch on 11/30/15,
 * For
 * *
 * Actions:
 */
public class UIStart {

    public UIStart() {

    }

    public int showCommandUI () {
        Object[] options = {"Search for Swim Test",
                "Add Swim Test",
                "Exit "};
        int n = JOptionPane.showOptionDialog(null, "What would you like to do?", "Test Mark Protect",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);

        System.out.println(n); //DEBUG
        return n;
    }


    public String showSearchUI(String searchType) {
        return JOptionPane.showInputDialog(null, "Enter the child's " + searchType + ": ");

    }


    public String showAddChildUI () {

        String tokenizedString = "";

        Object[] options = {"Green",
                "Yellow",
                "Red"};

        tokenizedString = JOptionPane.showInputDialog(null, "Enter the child's FIRST name: ");

        tokenizedString = JOptionPane.showInputDialog(null, "Enter the child's LAST name: ");

        tokenizedString = tokenizedString + "_" + JOptionPane.showInputDialog(null, "Child's birthday: ");

        tokenizedString = tokenizedString + "_" + JOptionPane.showOptionDialog(null, "Select the child's swim band color", "Add Child: Swim Test Color", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);

        return tokenizedString;

    }

}
