package edu.kyleknobloch.APCS.Classwork.October;


public class CircleTester {

    public static void main (String args[]) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(8);


        circle.setRadius(10);
        System.out.println(circle.toString());
        System.out.println("\n" + circle1.toString());


    }
}
