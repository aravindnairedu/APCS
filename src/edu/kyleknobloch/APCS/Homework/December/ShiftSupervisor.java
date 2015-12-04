package edu.kyleknobloch.APCS.Homework.December;

/**
 * Created by kyleknobloch on 12/3/15,
 * For
 * *
 * Actions:
 */
public class ShiftSupervisor extends Employee {

    private double annualSalary;
    private double annualProductionBouns;


    /**
     * constructor to satasfife Employee Class
     * @param name
     * @param ID
     * @param hireDate
     */
    public ShiftSupervisor (String name, String ID, String hireDate) {
        super(name, ID, hireDate);
        this.annualSalary = -1.0;
        this.annualProductionBouns = -1.0;

    }

    /**
     * constructor to satasfie the Employee and this classes
     * @param name
     * @param ID
     * @param hireDate
     * @param annualSalary
     * @param annualProductionBouns
     */
    public ShiftSupervisor (String name, String ID, String hireDate, double annualSalary, double annualProductionBouns) {
        super(name, ID, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBouns = annualProductionBouns;
    }


    /**
     * Display the Employee's Information
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + "Annual Salary: $" + getAnnualSalary() + "\nAnnual Production Bonus: $" + getAnnualProductionBouns() + "\n";
    }


    /**
     * get methods
     */
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getHireDate() {
        return super.getHireDate();
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getAnnualProductionBouns() {
        return annualProductionBouns;
    }


    /**
     * set methods
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualProductionBouns(double annualProductionBouns) {
        this.annualProductionBouns = annualProductionBouns;
    }
}
