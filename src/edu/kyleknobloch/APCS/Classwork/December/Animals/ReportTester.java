package edu.kyleknobloch.APCS.Classwork.December.Animals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Report Tester
 */
public class ReportTester {

    private static String file;

    private static ArrayList<String> type = new ArrayList<>();
    private static ArrayList<String> name = new ArrayList<>();
    private static ArrayList<String> catagory = new ArrayList<>();
    private static ArrayList<String> species = new ArrayList<>();
    private static ArrayList<String> envierment = new ArrayList<>();
    private static ArrayList<String> foodSource = new ArrayList<>();

    private static ArrayList<Mammal> mammals = new ArrayList<>();
    private static ArrayList<Reptile> reptiles = new ArrayList<>();


    public static void main (String args[]) {
        file = "Animals.txt";

        fillArrays();
        fillObjectArrays();

        Report report = new Report(mammals, reptiles);

        System.out.println(report.getReport());

    }


    public static void fillArrays() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(file));
        }catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }

        int index = 0;

        while (scanner.hasNext()) {

            String typ;
            String nam;
            String cat;
            String spe = "";
            String env = "";
            String fod = "";

            typ = scanner.next();
            //System.out.println(typ); //DEBUG
            type.add(index, typ);

            nam = scanner.next();
            name.add(index, nam);

            cat = scanner.next();
            catagory.add(index, cat);

            StringTokenizer ST3 = new StringTokenizer(scanner.next(), "_");
            while (ST3.hasMoreElements())
                spe = spe + " " + ST3.nextElement();
            species.add(index, spe);

            StringTokenizer ST4 = new StringTokenizer(scanner.next(), "_");
            while (ST4.hasMoreElements())
                env = env + " " + ST4.nextElement();
            envierment.add(index, env);

            StringTokenizer ST6 = new StringTokenizer(scanner.next(), "_");
            while (ST6.hasMoreElements())
                fod = fod + " " + ST6.nextElement();
            foodSource.add(index, fod);

            index++;

        }

    }

    public static void fillObjectArrays () {

        int index = 0;
        int mINDEX = 0;
        int rINDEX = 0;

        while (index < type.size()) {

            if (type.get(index).equalsIgnoreCase("Mammal")){
                //System.out.println(index); //DEBUG
                mammals.add(mINDEX, new Mammal(name.get(index), catagory.get(index), species.get(index), envierment.get(index), foodSource.get(index)));
                index++;
                mINDEX++;
            }
            else if (type.get(index).equalsIgnoreCase("Reptile")) {

                reptiles.add(rINDEX, new Reptile(name.get(index), catagory.get(index), species.get(index), envierment.get(index), foodSource.get(index)));
                //System.out.println(index); //DEBUG
                index++;
                rINDEX++;
            }
            else {
                System.out.println("Something went wrong with index" + index);
                index++;
            }

        }

    }

}
