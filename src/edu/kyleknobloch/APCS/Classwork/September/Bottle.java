//package edu.kyleknobloch.APCS.Classwork.September;

public class Bottle {

    public Bottle(String message) {
        //String constrictor

        System.out.println(message);

    }

    public Bottle() {

        System.out.println("This is the default constructor.");

    }

    public Bottle(double v, String c, String l) {


        System.out.println(toString(v,c,l));

    }

    public String toString(double v, String m, String l) {

        String msg = "Volume is: " + v + ". Material is: " + m + ". Lable is: " + l;

        return(msg); //return String

    }
}
