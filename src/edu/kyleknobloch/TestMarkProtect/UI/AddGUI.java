package edu.kyleknobloch.TestMarkProtect.UI;


import edu.kyleknobloch.TestMarkProtect.Database.Commands;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;


/**
 * Add GUI
 */
public class AddGUI extends JFrame implements ItemListener {


    private JTextField JTEXTFName, JTEXTLName, JTEXTTester;
    private JPanel JPANColors;
    private JButton JBTNSubmit;


    /**
     * Start the Add GUI
     */
    public AddGUI() {

        /**
         * Buttons and text areas
         */
        JTEXTFName = new JTextField();
        JTEXTFName.setColumns(50);


        JTEXTLName = new JTextField();
        JTEXTLName.setColumns(50);


        JTEXTTester = new JTextField();
        JTEXTTester.setColumns(4); //initials


        //radio buttons
        JRadioButton JRB_Green = new JRadioButton("Green");
        JRB_Green.setActionCommand("Green");

        JRadioButton JBR_Yellow = new JRadioButton("Yellow");
        JBR_Yellow.setActionCommand("Yellow");

        JRadioButton JBR_Red = new JRadioButton("Red");
        JBR_Red.setActionCommand("Red");

        ButtonGroup group = new ButtonGroup();
        group.add(JRB_Green);
        group.add(JBR_Yellow);
        group.add(JBR_Red);

        JPANColors = new JPanel();
        JPANColors.add(JRB_Green);
        JPANColors.add(JBR_Yellow);
        JPANColors.add(JBR_Red);


        JBTNSubmit = new JButton("Add Swim Test");
        JBTNSubmit.setVerticalTextPosition(AbstractButton.CENTER);
        JBTNSubmit.setHorizontalTextPosition(AbstractButton.LEADING);
        JBTNSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitAddToDB();
            }
        });
        JBTNSubmit.setEnabled(true);


        /**
         * JFrame
         */

        setTitle("Test Mark Protect | Emilison");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        add(addLayout());

        setVisible(true);
    }


    /**
     * Returns the layout for AddGUI
     * @return JPanel for the JFrame
     */
    public JPanel addLayout() {
        JPanel addJPanel = new JPanel(); //3r, 1c
        JPanel rowOne = new JPanel(); //f/l name | 1r, 2c
        JPanel rowTwo = new JPanel(); //colors & tester 1r, 2c
        JPanel rowThree = new JPanel(); //date check + submit, 1r, 2c


        addJPanel.setLayout(new GridLayout(3, 1));
        rowOne.setLayout(new GridLayout(1, 2));
        rowTwo.setLayout(new GridLayout(1, 2));
        rowThree.setLayout(new GridLayout(1, 2));

        rowOne.add(JTEXTFName);
        rowOne.add(JTEXTLName);

        rowTwo.add(JPANColors);

        rowThree.add(JTEXTTester);
        rowThree.add(JBTNSubmit);


        addJPanel.add(rowOne);
        addJPanel.add(rowTwo);
        addJPanel.add(rowThree);


        return addJPanel;
    }


    /**
     * Call to the DB command to add the new swim test
     */
    private void submitAddToDB() {
        boolean sucsess;


        Date date = new Date();
        System.out.println(date.toString());

        /**
         * Call to the DB command
         */
        sucsess = Commands.add(JTEXTFName.getText(), JTEXTLName.getText(), JPANColors.getUIClassID(), date.toString(), JTEXTTester.getText());

        if (sucsess)
            JOptionPane.showMessageDialog(null, "Addition worked.");

        else
            JOptionPane.showMessageDialog(null, "Addition failed, please try again later");


    }



    /**
     * <3 from ItemListener
     * @param e ItemEvent
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        //
    }
}
