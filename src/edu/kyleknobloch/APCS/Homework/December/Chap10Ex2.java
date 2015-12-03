package edu.kyleknobloch.APCS.Homework.December;

/**
 * Chapter 10 Ex 2: ShiftSupervisor Class
 */
public class Chap10Ex2 {

    public static void main (String args[]) {
        ShiftSupervisor KO = new ShiftSupervisor("Keith O'connol", "0420-W", "4/20/2015");
        ShiftSupervisor MD = new ShiftSupervisor("Meg Davie", "4322-M", "5/43/2015", 1000.00, 5.00);

        KO.setAnnualProductionBouns(50000000.0);
        KO.setAnnualSalary(69000000.00);

        System.out.println(KO.toString());
        System.out.println(MD.toString());
    }
}
