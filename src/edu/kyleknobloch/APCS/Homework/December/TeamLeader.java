package edu.kyleknobloch.APCS.Homework.December;

/**
 * Chapter 10 Ex 3. TeamLeader
 */
public class TeamLeader extends ProductionWorker {

    private double monthyBonus;
    private int minTrainingHours;
    private int trainingHours;


    /**
     * constucor that satasfies ProductionWorker and Employee
     * @param name
     * @param ID
     * @param hireDate
     * @param shift
     * @param payRate
     */
    public TeamLeader (String name, String ID, String hireDate, int shift, double payRate) {
        super(name, ID, hireDate, shift, payRate);

    }

    /**
     * Contructor that takes evreything
     * @param name
     * @param ID
     * @param hireDate
     * @param shift
     * @param payRate
     * @param monthyBonus
     * @param minTrainingHours
     * @param trainingHours
     */
    public TeamLeader (String name, String ID, String hireDate, int shift, double payRate, double monthyBonus, int minTrainingHours, int trainingHours) {
        super(name, ID, hireDate, shift, payRate);
        this.monthyBonus = monthyBonus;
        this.minTrainingHours = minTrainingHours;
        this.trainingHours = trainingHours;

    }


    /**
     * Display the Employee's Information
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + "Monthly Production Bonus: $" + getMonthyBonus() + "\nMin Training Hours Required: " + getMinTrainingHours() + "hr\nHours Trained: " + getTrainingHours() + "hr\n";
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

    @Override
    public double getPayRate() {
        return super.getPayRate();
    }

    @Override
    public int getShift() {
        return super.getShift();
    }

    @Override
    public String getShiftName() {
        return super.getShiftName();
    }

    public double getMonthyBonus() {
        return monthyBonus;
    }

    public int getMinTrainingHours() {
        return minTrainingHours;
    }

    public int getTrainingHours() {
        return trainingHours;
    }


    /**
     * set methods
     */
    @Override
    public void setShift(int shift) {
        super.setShift(shift);
    }

    @Override
    public void setPayRate(double payRate) {
        super.setPayRate(payRate);
    }

    public void setMinTrainingHours(int minTrainingHours) {
        this.minTrainingHours = minTrainingHours;
    }

    public void setMonthyBonus(double monthyBonus) {
        this.monthyBonus = monthyBonus;
    }

    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }
}
