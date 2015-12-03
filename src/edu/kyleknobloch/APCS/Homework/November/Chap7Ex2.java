package edu.kyleknobloch.APCS.Homework.November;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Chapter 7 Excersie 2
 * Payroll Class
 */
public class Chap7Ex2 {

    public static void main (String args[]) {
        Chap7Ex2 payroll = new Chap7Ex2(5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489); //set the IDs

        //got to store the vars somewhere
        double in1, in2, in3, in4, in5, in6, in7;
        double ra1, ra2, ra3, ra4, ra5, ra6, ra7;


        //ASK ALL THE QUESTIONS!
        //The Block of Code!
        ra1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(1) + "'s Pay Rate:"));
        in1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(1) + "'s Hours Worked:"));
        ra2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(2) + "'s Pay Rate:"));
        in2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(2) + "'s Hours Worked:"));
        ra3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(3) + "'s Pay Rate:"));
        in3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(3) + "'s Hours Worked:"));
        ra4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(4) + "'s Pay Rate:"));
        in4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(4) + "'s Hours Worked:"));
        ra5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(5) + "'s Pay Rate:"));
        in5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(5) + "'s Hours Worked:"));
        ra6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(6) + "'s Pay Rate:"));
        in6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(6) + "'s Hours Worked:"));
        ra7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(7) + "'s Pay Rate:"));
        in7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Employee ID " + payroll.getID(7) + "'s Hours Worked:"));


        //run data check!
        if (in1 <= -1 || in2 <= -1 || in3 <= -1 || in4 <= -1 || in5 <= -1 || in6 <= -1 || in7 <= -1 ||
            ra1 <= 9.00 || ra2 <= 9.00 || ra3 <= 9.00 || ra4 <= 9.00 || ra5 <= 9.00 || ra6 <= 9.00 || ra7 <= 9.00) {
            JOptionPane.showMessageDialog(null, "You entered a number that is too low (min. wage is 9.00 and you can't work negative numbers). Try again with better wages and hours!");
            System.exit(-1);
        }

        // Set the Hours Worked and Pay Rates
        payroll.setAllHoursWorked(in1, in2, in3, in4, in5, in6, in7);
        payroll.setAllPayRates(ra1, ra2, ra3, ra4, ra5, ra6, ra7);


        //toString and demonstrate the get functions.
        System.out.println(payroll.toString());
        System.out.println("ID " + payroll.getID(1) + "'s net gain: $" + payroll.getWage(1));


    }


    private final int NoEmployees = 7;

    private ArrayList<Integer> employeeID = new ArrayList<>();  //Employee's IDs
    private ArrayList<Double> hoursWorked = new ArrayList<>(); //Number of Hours Worked
    private ArrayList<Double> payRate = new ArrayList<>();     //Pay Rate
    private ArrayList<Double> wages = new ArrayList<>();       //wages


    /**
     * Constructor
     * @param ID1 employee ID
     * @param ID2 employee ID
     * @param ID3 employee ID
     * @param ID4 employee ID
     * @param ID5 employee ID
     * @param ID6 employee ID
     * @param ID7 employee ID
     */
    public Chap7Ex2 (int ID1, int ID2, int ID3, int ID4, int ID5, int ID6, int ID7) {
        employeeID.add(0, -1);
        employeeID.add(1, ID1);
        employeeID.add(2, ID2);
        employeeID.add(3, ID3);
        employeeID.add(4, ID4);
        employeeID.add(5, ID5);
        employeeID.add(6, ID6);
        employeeID.add(7, ID7);

    }

    /**
     * toString methods
     * @return information about the employee
     */
    @Override
    public String toString() {
        String message = "";

        calcAllWages(); //if we have not run this, we will now run it so we do not get null vars.

        for (int i = 1; i < NoEmployees; i++)
            message = message + employeeID.get(i) + ".) $" + payRate.get(i) + " * " + hoursWorked.get(i) + "hr = $" + wages.get(i) + "\n";

        return message;
    }

    /**
     * fill the array wages
     */
    public void calcAllWages () {
        wages.add(0, -1.0);
        for (int i = 1; i < NoEmployees; i++)
        wages.add(i, hoursWorked.get(i) * payRate.get(i));


    }

    /**
     * set methods
     */
    public void setAllHoursWorked (double h1, double h2, double h3, double h4, double h5, double h6, double h7) {

        hoursWorked.add(0, -1.0);
        hoursWorked.add(1, h1);
        hoursWorked.add(2, h2);
        hoursWorked.add(3, h3);
        hoursWorked.add(4, h4);
        hoursWorked.add(5, h5);
        hoursWorked.add(6, h6);
        hoursWorked.add(7, h7);
    }

    public void setAllPayRates (double w1, double w2, double w3, double w4, double w5, double w6, double w7) {

        payRate.add(0, -1.0);
        payRate.add(1, w1);
        payRate.add(2, w2);
        payRate.add(3, w3);
        payRate.add(4, w4);
        payRate.add(5, w5);
        payRate.add(6, w6);
        payRate.add(7, w7);

    }


    /**
     * get methods (based off INDEX)
     */
    public int getID (int index) {
        return employeeID.get(index);
    }

    public double getWage (int index) {
        return wages.get(index);
    }
}
