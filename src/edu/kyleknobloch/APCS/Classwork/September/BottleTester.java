
package edu.kyleknobloch.APCS.Classwork.September;

public class BottleTester {

    public static void main(String args[]) {

        //we're able to take the main from Bottle.java and move it to another class and it will still compile.
                                                                //Assuming the Bootle.java is in the same dir.

        String forUse = "This is a new object.";
        double volume;
        String container;
        String lable;
        String cap;
        String contents;

        volume    = 20.9;
        container = "Glass";
        lable     = "Poland Springs";
        cap       = "Medal Cap";
        contents  = "Water";


        //Bottle btl  = new Bottle(); //use Default constructor
        //Bottle btl2 = new Bottle(forUse); //this no-longer exists
        //Bottle btl3 = new Bottle(volume, container, lable, contents, cap); //Set everything constructor
        //Bottle btl4 = new Bottle(volume); //set double (Volume) constructor
        Bottle getCoke = new Bottle(250, "Glass", "Coke", "Coke", "screw top"); //set everything constructor

        //System.out.println(getCoke.toString());


    }
}
