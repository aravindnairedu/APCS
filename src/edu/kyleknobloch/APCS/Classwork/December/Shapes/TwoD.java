package edu.kyleknobloch.APCS.Classwork.December.Shapes;

/**
 * 2D Objects
 */
public class TwoD extends Shape{

    public TwoD(double l, double w) {
        super(l, w);

    }


    /**
     * get methods
     */
    public double getArea() { return getLength() * getWidth(); }

    public double getPerimeter() { return getLength() * getLength() * getLength(); }


}
