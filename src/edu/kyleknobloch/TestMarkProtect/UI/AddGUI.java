package edu.kyleknobloch.TestMarkProtect.UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * Add GUI
 */
public class AddGUI extends JFrame implements ItemListener {


    private JTextField JTEXTFName, JTEXTLName, JTEXTTester;
    private JRadioButton JRADIOColor;
    private JButton JBTNSubmit;


    public AddGUI() {

        /**
         * Buttons and text areas
         */
        JTEXTFName = new JTextField();
        JTEXTFName.setColumns(50);

        /**
         * JFrame
         */

        setTitle("Test Mark Protect | Emilison");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(addLayout());

        setVisible(true);
    }


    public JPanel addLayout() {
        JPanel addJPanel = new JPanel(); //3r, 1c
        JPanel rowOne = new JPanel(); //f/l name | 1r, 2c
        JPanel rowTwo = new JPanel(); //colors & tester 1r, 2c
        JPanel rowThree = new JPanel(); //date check + submit, 1r, 2c


        addJPanel.setLayout(new GridLayout(3, 1));
        rowOne.setLayout(new GridLayout(1, 2));
        rowTwo.setLayout(new GridLayout(1, 2));
        rowThree.setLayout(new GridLayout(1, 2));








        addJPanel.add(rowOne);
        addJPanel.add(rowTwo);
        addJPanel.add(rowThree);


        return addJPanel;
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
