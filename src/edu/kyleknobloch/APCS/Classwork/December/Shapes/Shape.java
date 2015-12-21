package edu.kyleknobloch.APCS.Classwork.December.Shapes;

/**
 * Shape
 */
public abstract class Shape {

    private double length;
    private double width;


    public Shape (double l, double w) {
        length = l;
        width = w;

    }


    /**
     * get methods
     */

    public double getLength() { return length; }

    public double getWidth() { return width; }

}
