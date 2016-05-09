package edu.kyleknobloch.APCS.Exams.December1;

/**
 * Kyle Knobloch
 * AP CS Exam #1
 * Part 2: Question 3
 */
public class Shoe {

    private double shoeSize;
    private String desc;


    /**
     * default constructor
     */
    public Shoe () {
        shoeSize = -1;
        desc = "I have no description";

    }

    /**
     * Shoe Constructor
     * @param desc the shoe's description
     * @param shoeSize the shoe's size
     */
    public Shoe (String desc, double shoeSize) {
        this.desc = desc;
        this.shoeSize = shoeSize;

    }


    /**
     * get methods
     */
    public String getDesc() {
        return desc;
    }

    public double getShoeSize() {
        return shoeSize;
    }


    /**
     * set methods
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }
}
