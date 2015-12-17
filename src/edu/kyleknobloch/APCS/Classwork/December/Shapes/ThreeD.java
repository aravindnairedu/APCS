package edu.kyleknobloch.APCS.Classwork.December.Shapes;

/**
 * Created by kyleknobloch on 12/17/15,
 * For
 * *
 * Actions:
 */
public abstract class ThreeD extends TwoD {

    public ThreeD(double l, double w) {
        super(l, w);

    }

    public abstract double getVolume ();

    public abstract double getSA ();

    @Override
    public double getArea() {
        return getSA();
    }


    @Override
    public double getPerimeter() {
        return getLength() * 12;
    }

}
