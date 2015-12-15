package edu.kyleknobloch.APCS.Classwork.December.Animals;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;


/**
 * Report Class
 */
public class Report {

    private ArrayList<Mammal> mammals = new ArrayList<>();
    private ArrayList<Reptile> reptiles = new ArrayList<>();
    private String report;
    private boolean calcRan;

    /**
     * default constructro
     * @param Mammal mammal ArrayList<Mammal>
     * @param Reptiles reptile ArrayList<Reptile>
     */
    public Report (ArrayList<Mammal> Mammal, ArrayList<Reptile> Reptiles, String headerTitle) {
        Date date = new Date();

        mammals = Mammal;
        reptiles = Reptiles;
        report = headerTitle + " Report\nDate of report: " + date.toString() + "\n";
        calcRan = false;

    }


    /**
     * Generate the report
     * @return Report String
     */
    public String getReport () {

        if (!calcRan) {
            report = report + "0). Type    | Name, Category | Species | Envierment | Food Source\n";

            int mainINDEX = 1;

            //$number.) $type, $name, $catagory, $species, $envierment, $FoodSource

            mammals.get(1).getName().length();

            //mammals
            for (int i = 0; i < mammals.size(); i++) {

                report = report + mainINDEX + ".) Mammal  | " + mammals.get(i).getName() + ", " + mammals.get(i).getCatagory() + " | " +
                        mammals.get(i).getSpecies() + " | " + mammals.get(i).getClimate() + " | " + mammals.get(i).getFoodSource() + "\n";

                mainINDEX++;

            }

            //reptiles
            for (int i = 0; i < reptiles.size(); i++) {

                report = report + mainINDEX + ".) Reptial | " + reptiles.get(i).getName() + ", " + reptiles.get(i).getCatagory() + " | " +
                        reptiles.get(i).getSpecies() + " | " + reptiles.get(i).getClimate() + " | " + reptiles.get(i).getFoodSource() + "\n";

                mainINDEX++;

            }

            calcRan = true;
        }

        return report;

    }


    public void printReportToFile(String fileName) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter(fileName + ".txt", "UTF-8");
        writer.println(getReport());
        writer.close();



    }

}
