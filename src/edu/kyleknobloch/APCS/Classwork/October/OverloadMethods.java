package edu.kyleknobloch.APCS.Classwork.October;


public class OverloadMethods {

    public static void main (String[] args) {

        double ten = 10;
        double elevin = 11;
        short sTen = 10;
        short sElevin = 11;


        System.out.println(add(10, 11));
        System.out.println(add(ten, elevin));
        System.out.println(add(10f, 11f));
        System.out.println(add(10l, 11l));
        System.out.println(add(sTen, sElevin));
        System.out.println(add("ten", "elevin"));

    }

    public static int add(int one, int two) {
        System.out.println("Integer");
        return one + two;
    }

    public static double add(double one, double two) {
        System.out.println("Double");
        return one + two;
    }

    public static float add(float one, float two) {
        System.out.println("Float");
        return one + two;
    }

    public static long add(long one, long two) {
        System.out.println("Long");
        return one + two;
    }

    public static short add(short one, short two) {
        System.out.println("Short");
        int sum = one + two;
        return (short) sum;
    }

    public static String add(String one, String two) {
        System.out.println("String");
        return one + " " + two;
    }

}
