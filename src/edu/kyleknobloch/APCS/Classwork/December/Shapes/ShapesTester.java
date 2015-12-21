package edu.kyleknobloch.APCS.Classwork.December.Shapes;

/**
 * Tester for TwoD and ThreeD abstract classes
 */
public class ShapesTester {

    public static void main (String args[]) {


        Shape[] shapes = new Shape[4];

        shapes[0] = new Square(80);
        shapes[1] = new Cube(6);
        shapes[2] = new Square(243);
        shapes[3] = new Cube(90);


    }
}
