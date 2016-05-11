package edu.kyleknobloch.TestMarkProtect.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 */
public class SearchGUI extends JFrame implements ItemListener {


    private JTextArea JTXTResults;
    private JTextField JTXTFSearch;
    private JButton JBTNSubmit, JBTNClose;


    /**
     * Start the Search window
     */
    public SearchGUI() {


        /**
         * JFrame
         */

        setTitle("Test Mark Protect | Emilison");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        add(addLayout());

        setVisible(true);


    }


    private JPanel addLayout() {

        return new JPanel(new GridLayout(3,3));
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
