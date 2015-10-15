package edu.kyleknobloch.APCS.Classwork.October.Payroll;


public class Payroll {

    private String name;
    private int IDNumber;
    private double payRate;
    private double hoursWorked;


    /**
     * Constructors
     */

    public Payroll () {
        //I do nothing. Trust me, I'm a default constructor
    }

    public Payroll (String name, int IDNumber) {
        //I take the name and ID and set them.
        setName(name);
        setIDNumber(IDNumber);
    }


    /**
     * Calculate grossPay
     *
     * @return [double] gross pay
     */

    public double grossPay () {
        return getHoursWorked() * getPayRate();
    }

    /**
     * Get methods
     */

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }


    /**
     * Set methods
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

}
