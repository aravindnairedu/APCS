package edu.kyleknobloch.APCS.Homework.December;

/**
 * Chapter 10 Ex 1: Employee and ProductionWorker Classes
 */
public class Chap10Ex1 {

    public static void main (String args[]) {

        ProductionWorker JJ = new ProductionWorker("John James Drugan", "0045-K", "9/11/2015");
        ProductionWorker KK = new ProductionWorker("Kyle Knobloch", "0043-M", "10/12/1990", 2, 9.00);



        System.out.println(JJ.toString());
        System.out.println(KK.toString());

    }
}
