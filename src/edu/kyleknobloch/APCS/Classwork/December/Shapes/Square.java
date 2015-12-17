package edu.kyleknobloch.APCS.Classwork.December.Shapes;


public class Square extends TwoD {

    public Square (double side) {
        super(side, side);

    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4 * getLength();
    }

}
