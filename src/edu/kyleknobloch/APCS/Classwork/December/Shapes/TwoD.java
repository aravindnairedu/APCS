package edu.kyleknobloch.APCS.Classwork.December.Shapes;


public abstract class TwoD {

    private double length;
    private double width;


    public TwoD(double l, double w) {
        length = l;
        width = w;

    }


    /**
     * get methods
     */
    public abstract double getArea();

    public abstract double getPerimeter();

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
