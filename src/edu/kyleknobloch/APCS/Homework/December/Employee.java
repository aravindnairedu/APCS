package edu.kyleknobloch.APCS.Homework.December;

/**
 * Chapter 10 Ex 1, 2 and 3
 */
public class Employee {


    private String name;
    private String ID;
    private String hireDate;


    public Employee (String name, String ID, String hireDate) {
        this.hireDate = hireDate;
        this.ID = ID;
        this.name = name;

    }


    /**
     * Display the Employee's Information
     * @return toString
     */
    @Override
    public String toString() {
        return "Employee Data:\nName: "+ getName() + "\nID: " + getID() + "\nHire Date: " + getHireDate() + "\n";
    }


    /**
     * get methods
     */
    public String getName() {
        return name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getID() {
        return ID;
    }


}
