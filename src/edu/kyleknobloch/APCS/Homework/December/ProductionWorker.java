package edu.kyleknobloch.APCS.Homework.December;

/**
 * Chapter 10 Ex 1:
 */
public class ProductionWorker extends Employee {

    private int shift;
    private double payRate;


    /**
     * constructor that takes evreything
     * @param name
     * @param ID
     * @param hireDate
     * @param shift
     * @param payRate
     */
    public ProductionWorker (String name, String ID, String hireDate, int shift, double payRate) {
        super(name, ID, hireDate);
        this.shift = shift;
        this.payRate = payRate;

    }

    /**
     * Constructo that satasfies the Employee Class
     * @param name
     * @param ID
     * @param hireDate
     */
    public ProductionWorker (String name, String ID, String hireDate) {
        super(name, ID, hireDate);

    }


    /**
     * Display the Employee's Information
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + "Shift: " + getShiftName() + "\nPay Rate: $" + getPayRate() + "\n";
    }


    /**
     * get methods
     */
    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getHireDate() {
        return super.getHireDate();
    }

    public double getPayRate() {
        return payRate;
    }

    public int getShift() {
        return shift;
    }

    public String getShiftName () {
        if (shift == 1)
            return "day";
        else if (shift == 2)
            return "night";
        else
            return "no shift assigned";

    }


    /**
     * set methods
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
}
