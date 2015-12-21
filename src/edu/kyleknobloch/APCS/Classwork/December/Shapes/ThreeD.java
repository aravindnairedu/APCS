package edu.kyleknobloch.APCS.Classwork.December.Shapes;

/**
 * 3D Objects
 */
public class ThreeD extends TwoD {

    private double height;

    public ThreeD(double l, double w, double h) {
        super(l, w);
        height = h;

    }


    public double getVolume () { return getLength() * getWidth() * getHeight(); }

    public double getSA () { return 2 * ((getLength()*getWidth()) + (getHeight()*getLength()) + (getHeight()*getWidth())); }


    public double getHeight() { return height; }

}
