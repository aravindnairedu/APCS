package edu.kyleknobloch.APCS.Notes;


public class OverloadMethods {

    public static void main (String[] args) {

        double ten = 10;
        double elevin = 11;
        short sTen = 10;
        short sElevin = 11;
        OverloadMethods OLM = new OverloadMethods();


        System.out.println(OLM.add(10, 11));
        System.out.println(OLM.add(ten, elevin));
        System.out.println(OLM.add(10f, 11f));
        System.out.println(OLM.add(10l, 11l));
        System.out.println(OLM.add(sTen, sElevin));
        System.out.println(OLM.add("ten", "elevin"));
        OLM.add();

    }

    private void add() {
        System.out.println("Nothing");
    }

    private int add(int one, int two) {
        System.out.println("Integer");
        return one + two;
    }

    private double add(double one, double two) {
        System.out.println("Double");
        return one + two;
    }

    private float add(float one, float two) {
        System.out.println("Float");
        return one + two;
    }

    private long add(long one, long two) {
        System.out.println("Long");
        return one + two;
    }

    private short add(short one, short two) {
        System.out.println("Short");
        int sum = one + two;
        return (short) sum;
    }

    private String add(String one, String two) {
        System.out.println("String");
        return one + " " + two;
    }

}
