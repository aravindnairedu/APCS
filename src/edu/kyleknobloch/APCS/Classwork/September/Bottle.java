package edu.kyleknobloch.APCS.Classwork.September;

public class Bottle {

    private double volume;
    private String container;
    private String contents;
    private String label;
    private String cap;


    public Bottle() {
        //default constructor

        volume    = 20.9;
        container = "Glass";
        label     = "Poland Springs";
        contents  = "Water";
        cap       = "Bottle Cap";


        System.out.println("This is the default constructor.");
        //System.out.println(toString(volume, container, label, contents, cap));
        System.out.println(toString());

    }

    public Bottle(double volume) {
        //double constructor

        this.volume = volume;
        container   = "Glass";
        label       = "Poland springs";
        contents    = "Water";
        cap         = "Bottle Cap";


        System.out.println(toString(this.volume, container, label, contents, cap));

    }

    //we're able to create many constructors using the same name as long as they take different things (Have different signatures)

    public Bottle(double v, String m, String l, String c, String cap) {
        //set everything constructor

        volume    = v;
        container = m;
        label     = l;
        contents  = c;
        this.cap  = cap;

        System.out.println(toString(volume, container, label, contents, this.cap));

    }

    private String toString(double v, String m, String l, String c, String cap) {
        //Private toSting to be used inside this class


        String msg = "Volume is: " + v + ". Material is: " + m + ". Lable is: " + l + ". Contents is: " + c + ". Cap is " + cap;

        return msg; //return String

    }

    public String toString() {
        //Public toString to be used anywhere, used the get methods


        String msg = "Volume is: " + getVolume() + ". Material is: " + getContaner() + ". Lable is: " + getLabel() + ". Contents is: " + getContents() + ". Cap is " + cap;

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

    public String getContaner() {

        return container;
    }

    public String getCap() {

        return cap;
    }

    public String getLabel() {

        return label;
    }

    /*
     * Set methods
     */

    public void setContents(String contents) {

        this.contents = contents;

    }

    public void setVolume(double volume) {

        this.volume = volume;

    }

    public void setLabel(String label) {

        this.label = label;

    }

    public void setCap(String cap) {

        this.cap = cap;

    }

    public void setContainer(String container) {

        this.container = container;

    }
}

