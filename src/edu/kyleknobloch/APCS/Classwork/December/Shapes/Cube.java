package edu.kyleknobloch.APCS.Classwork.December.Shapes;


public class Cube extends ThreeD {

    public Cube (double side) {
        super(side, side, side);

    }


    @Override
    public double getVolume () {
        return getLength() * 3;
    }

    @Override
    public double getSA () {
        return 6 * getLength() * getLength();
    }



}

