package edu.kyleknobloch.APCS.Classwork.October.Medical;


public class MedicalStatsTester {

    public static void main (String args[]) {

        MedicalStats medStat1 = new MedicalStats();
        System.out.println(medStat1.toString());

        System.out.println();

        MedicalStats medStat2 = new MedicalStats(85, 120);
        System.out.println(medStat2.toString());


    }
}
