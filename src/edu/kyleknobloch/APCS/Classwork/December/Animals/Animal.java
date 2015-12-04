package edu.kyleknobloch.APCS.Classwork.December.Animals;

/**
 * Kyle Knobloch and Andrew Brook
 * Animal Inheritance
 *
 * Animal Super
 */
public class Animal {

    private String name;
    private String catagory;
    private String species;

    public Animal(String name, String species, String catagory) {
        this.name = name;
        this.species = species;
        this.catagory = catagory;


    }


    @Override
    public String toString() {
        return "Animal Information\n------------------\nName: " + getName() + "\nSpecies: " + getSpecies() + "\nCatagory: " + getCatagory() + "\n";
    }

    /**
     * get methods
     */
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public String getCatagory() {
        return catagory;
    }


}
