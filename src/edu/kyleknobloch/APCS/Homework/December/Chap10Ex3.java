package edu.kyleknobloch.APCS.Homework.December;

/**
 * Chapter 10 Ex 3: TeamLeader Class
 */
public class Chap10Ex3 {

    public static void main (String args[]) {
        TeamLeader KT = new TeamLeader("Kathrin Tracie", "4324-T", "11/12/43", 2, 6.00);
        TeamLeader MF = new TeamLeader("Matt Files", "4325-K", "42/31/13", 2, 10.00, 350.00, 10, 8);

        KT.setMinTrainingHours(400);
        KT.setTrainingHours(4);
        KT.setMonthyBonus(1.00);

        System.out.println(KT.toString());
        System.out.println(MF.toString());


    }


}
