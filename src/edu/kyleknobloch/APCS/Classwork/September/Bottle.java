//package edu.kyleknobloch.APCS.Classwork.September;

public class Bottle {

    private double volume;
    private String container;
    private String label;


    public Bottle(String message) {
        //String constrictor

        System.out.println(message);

    }

    public Bottle() {
        //default constructor


        volume    = 20.9;
        container = "Glass";
        label     = "Poland springs";


        System.out.println("This is the default constructor.");

    }

    //we're able to create many contructors using the same name as long as they take diffrent things (Have diffrent signetures)

    public Bottle(double v, String c, String l) {


        System.out.println(toString(v,c,l));

    }

    public String toString(double v, String m, String l) {

        String msg = "Volume is: " + v + ". Material is: " + m + ". Lable is: " + l;

        return(msg); //return String

    }
}
