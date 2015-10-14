package edu.kyleknobloch.APCS.Classwork.October.Payroll;


import javax.swing.*;

public class PayrollTester {


    public static void main (String args[]) {
        String name;
        String input;
        int ID;


        JOptionPane JO = new JOptionPane();

        name = JO.showInputDialog(null, "Please enter the name for your employee");
        input = JO.showInputDialog(null, "Please enter your employee's ID number");
        ID = Integer.parseInt(input);

        Payroll payroll = new Payroll(name, ID);

        input = JO.showInputDialog(null, "Please enter the hourly rate of your employee");
        payroll.setPayRate(Double.parseDouble(input));

        input = JO.showInputDialog(null, "Please enter the hours your employee has worked.");
        payroll.setHoursWorked(Double.parseDouble(input));

        JO.showMessageDialog(null, "The gross pay of " + payroll.getName() + ", with ID Number " + payroll.getIDNumber() + " is \n$" + payroll.grossPay() + ".");


    }


}
