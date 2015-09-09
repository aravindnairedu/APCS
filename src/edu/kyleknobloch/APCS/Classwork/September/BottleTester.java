//package edu.kyleknobloch.APCS.Classwork.September;


public class BottleTester {

    public static void main(String args[]) {

        //we're able to take the main from Bottle.java and move it to another class and it will still compile.
                                                                //Assuming the Bootle.java is in the same dir.

        String forUse = "This is a new object.";
        double volume;
        String container;
        String lable;

        volume    = 20.9;
        container = "Glass";
        lable     = "Poland Springs";


        Bottle btl  = new Bottle();
        Bottle btl2 = new Bottle(forUse);
        Bottle btl3 = new Bottle(volume, container, lable);

    }
}
