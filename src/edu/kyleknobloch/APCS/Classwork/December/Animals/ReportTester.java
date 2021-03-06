package edu.kyleknobloch.APCS.Classwork.December.Animals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Report Tester
 */
public class ReportTester {

    private static String file;

    private static ArrayList<Mammal> mammals = new ArrayList<>();
    private static ArrayList<Reptile> reptiles = new ArrayList<>();


    public static void main (String args[]) throws FileNotFoundException, UnsupportedEncodingException {
        file = "Animals.txt";


        fillArrays();


        Report report = new Report(mammals, reptiles, file);


        System.out.println(report.getReport());
        report.printReportToFile("test");

    }


    /**
     * We're filling up the arrays here.
     */
    public static void fillArrays() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(file));
        }catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }

        int index = 0;

        //full up the object arrays from the text file.
        while (scanner.hasNext()) {

            String typ;
            String nam;
            String cat;
            String spe = "";
            String env = "";
            String fod = "";

            typ = scanner.next();
            //System.out.println(typ); //DEBUG

            nam = scanner.next();

            cat = scanner.next();

            StringTokenizer ST3 = new StringTokenizer(scanner.next(), "_");
            while (ST3.hasMoreElements())
                spe = spe + " " + ST3.nextElement();

            StringTokenizer ST4 = new StringTokenizer(scanner.next(), "_");
            while (ST4.hasMoreElements())
                env = env + " " + ST4.nextElement();

            StringTokenizer ST6 = new StringTokenizer(scanner.next(), "_");
            while (ST6.hasMoreElements())
                fod = fod + " " + ST6.nextElement();


            //fill object arrays
            if (typ.equalsIgnoreCase("mammal")) {
                mammals.add(new Mammal(nam, spe, cat, env, fod));
                //System.out.println("mammal add"); //DEBUG
            }
             else if (typ.equalsIgnoreCase("reptile")) {
                reptiles.add(new Reptile(nam, spe, cat, env, fod));
                //System.out.println("reptile add"); //DEBUG

            }

            index++;

        }

    }


}
