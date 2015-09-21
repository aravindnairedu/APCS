package edu.kyleknobloch.APCS.Classwork.September;

public class Can {

    private String name;
    private String contents;
    private double volume;
    private double cost;

    public Can() {
        //default constructor

        name     = "Diet Doctor Pepper";
        contents = "Diet Doctor Pepper";
        volume   = 11.5;
        cost     = 1.29;

        toString();

    }

    public Can(String n, String c, double v, double cost) {
        //Set evreything

        name      = n;
        contents  = c;
        volume    = v;
        this.cost = cost;

        toString();
    }

    public String toString() {
        //public toString

        String msg = "Name: " + getName() + ".\nContents: " + getContents() + ".\nVolume: " + getVolume() + ".\nCost: $" + getCost();


        System.out.println(msg);
        return msg;

    }


    /*
     * Get methods
     */

    public String getContents() {

        return contents;
    }

    public double getVolume() {

        return volume;
    }

    public double getCost() {

        return cost;
    }

    public String getName() {

        return name;
    }

}
