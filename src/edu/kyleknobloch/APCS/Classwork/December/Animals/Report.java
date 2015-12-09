package edu.kyleknobloch.APCS.Classwork.December.Animals;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.jar.Pack200;

/**
 * Created by kyleknobloch on 12/8/15,
 * For
 * *
 * Actions:
 */
public class Report {

    private String file;

    private ArrayList<String> type = new ArrayList<>();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> catagory = new ArrayList<>();
    private ArrayList<String> species = new ArrayList<>();
    private ArrayList<String> envierment = new ArrayList<>();
    private ArrayList<String> foodSource = new ArrayList<>();

    private ArrayList<Mammal> mammals = new ArrayList<>();
    private ArrayList<Reptile> reptiles = new ArrayList<>();


    public Report (String file) {
        this.file = file;

    }


    public void fillArrays() {
        Scanner scanner = new Scanner(file);
        int index = 0;

        while (scanner.hasNext()) {

            String typ = "";
            String nam = "";
            String cat = "";
            String spe = "";
            String env = "";
            String fod = "";

            StringTokenizer ST = new StringTokenizer(scanner.next(), "_");
            while (ST.hasMoreElements())
                typ = typ + " " + ST.nextElement();
            type.add(index, typ);

            StringTokenizer ST1 = new StringTokenizer(scanner.next(), "_");
            while (ST1.hasMoreElements())
                nam = nam + " " + ST1.nextElement();
            name.add(index, nam);

            StringTokenizer ST2 = new StringTokenizer(scanner.next(), "_");
            while (ST2.hasMoreElements())
                cat = cat + " " + ST2.nextElement();
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

    public void fillObjectArrays () {

        int index = 0;

        while (index < type.size()) {

            if (type.get(index).equalsIgnoreCase("Mammal")){

                mammals.add(new Mammal(name.get(index), catagory.get(index), species.get(index), envierment.get(index), foodSource.get(index)));

            }
            else if (type.get(index).equalsIgnoreCase("reptile")) {

                reptiles.add(new Reptile(name.get(index), catagory.get(index), species.get(index), envierment.get(index), foodSource.get(index)));

            }
            else {
                System.out.println("something went wrong with index" + index);
            }

        }


    }

    public String getReport () {




        return "";
    }

}












