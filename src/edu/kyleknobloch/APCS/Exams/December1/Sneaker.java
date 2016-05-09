package edu.kyleknobloch.APCS.Exams.December1;

/**
 * Kyle Knobloch
 * AP CS Exam #1
 * Part 2: Question 3
 */
public class Sneaker extends Shoe {

    private double price;


    /**
     * default constructor
     */
    public Sneaker () {
        super();
        price = -1;

    }

    /**
     * Sneaker Constructor
     * @param price Sneaker's price
     * @param size Sneaker's size
     * @param desc Sneaker's description
     */
    public Sneaker (String desc, double size, double price) {
        super(desc, size);
        this.price = price;

    }


    /**
     * get methods
     */
    public double getPrice() {
        return price;
    }


    /**
     * set methods
     */
    public void setDesc (String desc) {
        super.setDesc(desc);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
