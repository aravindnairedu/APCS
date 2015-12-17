package edu.kyleknobloch.APCS.Classwork.December.Shapes;

/**
 * Tester for TwoD and ThreeD abstract classes
 */
public class ShapesTester {

    public static void main (String args[]) {

        Square sq = new Square(80);
        Cube   cb = new Cube(90);

        System.out.println("Square " + sq.getLength() + "\nArea: " + sq.getArea() + "\nPerimeter: " + sq.getPerimeter());

        System.out.println("\nCube " + cb.getLength() + "\nPerimeter: " + cb.getPerimeter() + "\nSA: " + cb.getSA() +
                           "\nVolume: " + cb.getVolume());


    }
}
