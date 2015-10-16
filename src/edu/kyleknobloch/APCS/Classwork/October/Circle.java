package edu.kyleknobloch.APCS.Classwork.October;


public class Circle {

    final private double PI = 3.14159;
    private double radius;


    public Circle () {
        setRadius(0.0);
    }

    public Circle (double radius) {
        setRadius(radius);
    }

    /**
     * Get math methods
     */
    public double getArea() {
        return getPI() * getRadius() * getRadius();
    }

    public double getDiamater() {
        return getRadius() * 2;
    }

    public double getCircumference() {
        return 2 * getPI() * getRadius();
    }


    /**
     * toString
     */
    @Override
    public String toString () {
        return "Radius: " + getRadius() + "\nArea: " + getArea() + "\nDiamater: " + getDiamater() + "\nCircumference: " + getCircumference();
    }

    /**
     * Set methods
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get methods
     */

    public double getRadius() {
        return radius;
    }

    public double getPI() {
        return PI;
    }
}
