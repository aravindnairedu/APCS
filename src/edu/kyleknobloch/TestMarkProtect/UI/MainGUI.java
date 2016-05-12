package edu.kyleknobloch.TestMarkProtect.UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Main GUI
 */
public class MainGUI extends JFrame implements ItemListener {


    private JButton JBTNExit, JBTNAdd, JBTNSearch, JBTNAdmin;


    /**
     * Main GUI Constructor.
     * Creates all the buttons and the JFrame for the main window.
     */
    public MainGUI() {


        /**
         * button init
         */
        JBTNAdd = new JButton("Add Swim Test");
        JBTNAdd.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNAdd.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBTN();
            }
        });
        JBTNAdd.setEnabled(true);


        JBTNExit = new JButton("Exit");
        JBTNExit.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNExit.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitBTN();
            }
        });
        JBTNExit.setEnabled(true);


        JBTNSearch = new JButton("Search for Swim Test");
        JBTNSearch.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNSearch.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchBTN();
            }
        });
        JBTNSearch.setEnabled(true);


        /**
         * JFrame
         */

        setTitle("Test Mark Protect | Emilison");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(mainLayout());

        setVisible(true);


    }


    /**
     * Creates a 3 column JPanel for the Main GUI, adds the buttons initialized in constructor.
     * @return JPanel for use in Main GUI
     */
    private JPanel mainLayout() {
        JPanel buttonJP = new JPanel();
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();

        // Grid Setup, 3 rows 1 column for the return Frame
        buttonJP.setLayout(new GridLayout(3, 1));
        //This is the 3 rows, 1 column for the middle row of the return Frame
        row2.setLayout(new GridLayout(1, 3));


        row2.add(JBTNExit);
        row2.add(JBTNAdd);
        row2.add(JBTNSearch);


        buttonJP.add(row1);
        buttonJP.add(row2);
        buttonJP.add(row3);


        return buttonJP; //return Frame

    }


    /**
     * Exit button function - Close application.
     */
    public void exitBTN() {
        System.exit(0);
    }


    /**
     * Add button function - add a new user to the database - this is graphics function only
     */
    public void addBTN() {
        AddGUI aGUI = new AddGUI();
    }


    /**
     * Search button function - search for a user in the database - this is graphics function only
     */
    public void searchBTN() {
        SearchGUI sGUI = new SearchGUI();
    }


    /**
     * changes the visibility of the main GUI.
     * @param vis (visibility) true/false to show the MainGUI.
     */
    public void visibility(boolean vis) {
        setVisible(vis);
    }


    /**
     * <3 from JFrame and ItemListener
     * @param e ItemEvent
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        //
    }

}
