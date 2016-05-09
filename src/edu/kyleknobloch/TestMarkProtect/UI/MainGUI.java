package edu.kyleknobloch.TestMarkProtect.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by kyleknobloch on 11/30/15,
 * For
 * *
 * Actions:
 */
public class MainGUI extends JFrame implements ItemListener {

    private JButton JBTNExit, JBTNAdd, JBTNSearch;


    public MainGUI() {


        /**
         * button information
         */
        JBTNAdd = new JButton("Add Swim Test");
        JBTNAdd.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNAdd.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNAdd.setActionCommand("disable");
        JBTNAdd.setEnabled(true);


        JBTNExit = new JButton("Exit");
        JBTNExit.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNExit.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNExit.setActionCommand("disable");
        JBTNExit.setEnabled(true);


        JBTNSearch = new JButton("Search for Swim Test");
        JBTNSearch.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNSearch.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNSearch.set(this.searchBTN());
        JBTNSearch.setEnabled(true);


        setTitle("Test Mark Protect | Emilision");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(mainLayout());

        setVisible(true);


    }


    private JPanel mainLayout() {
        JPanel buttonJP = new JPanel();
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();

        buttonJP.setLayout(new GridLayout(3, 1));
        row2.setLayout(new GridLayout(1, 3));


        row2.add(JBTNExit);
        row2.add(JBTNAdd);
        row2.add(JBTNSearch);


        buttonJP.add(row1);
        buttonJP.add(row2);
        buttonJP.add(row3);


        return buttonJP;

    }


    public void exitBTN() {
        System.exit(0);
    }


    public void addBTN() {

    }


    public void searchBTN() {

    }


    public void visibilaty(boolean vis) {
        setVisible(vis);
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




    //<3 JFrame and ItemListener
    @Override
    public void itemStateChanged(ItemEvent e) {
        //
    }

}
