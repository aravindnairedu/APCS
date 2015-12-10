package edu.kyleknobloch.APCS.Classwork.December.Animals;

import java.util.ArrayList;


/**
 * Report Class
 */
public class Report {

    private ArrayList<Mammal> mammals = new ArrayList<>();
    private ArrayList<Reptile> reptiles = new ArrayList<>();


    public Report (ArrayList<Mammal> Mammal, ArrayList<Reptile> Reptiles) {
        mammals = Mammal;
        reptiles = Reptiles;

    }


    public String getReport () {

        String report = "0.) Type    | Name, Category | Species | Envierment | Food Source\n";
        int mainINDEX = 1;

        //$number.) $type, $name, $catagory, $species, $envierment, $FoodSource

        for (int i = 0; i < mammals.size(); i++) {

            report = report + mainINDEX + ".) Mammal  | " +  mammals.get(i).getName() + ", " + mammals.get(i).getCatagory() + " | " +
            mammals.get(i).getSpecies() + " | " + mammals.get(i).getClimate() + " | " + mammals.get(i).getFoodSource() +"\n";

            mainINDEX++;

        }

        for (int i = 0; i < reptiles.size(); i++) {

            report = report + mainINDEX + ".) Reptial | " +  reptiles.get(i).getName() + ", " + reptiles.get(i).getCatagory() + " | " +
                    reptiles.get(i).getSpecies() + " | " + reptiles.get(i).getClimate() + " | " + reptiles.get(i).getFoodSource() + "\n";

            mainINDEX++;

        }

        return report;

    }

}
