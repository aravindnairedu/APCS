package edu.kyleknobloch.APCS.Classwork.December.Animals;

/**
 * Kyle Knobloch and Andrew Brook
 * Animal Inheritance
 *
 * Reptile sub class
 */
public class Reptile extends Animal {


    private boolean scales;
    private int numberOfScales;
    private boolean aquatic;
    private String foodSource;
    private String climate;


    public Reptile (String name, String species, String catagory) {
        super(name, species, catagory);
        scales = false;
        numberOfScales = 0;
        aquatic = false;
        foodSource = "yummy food (default)";
        climate = "somewhere nice (default)";

    }

    public Reptile (String name, String species, String catagory, String climate, String foodSource) {
        super(name, species, catagory);
        this.foodSource =foodSource;
        this.climate = climate;
        aquatic = false;
        scales = false;
        numberOfScales = 0;

    }


    /**
     * toString
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + "Food Source: " + getFoodSource() + "\nClimate: " + getClimate() + "\nScales: " + isScales() + "\nNumber of Scales: " + getNumberOfScales() + "\nAquatic: " + isAquatic() + "\n";
    }


    /**
     * get methods
     */
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getCatagory() {
        return super.getCatagory();
    }

    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    public String getClimate() {
        return climate;
    }

    public String getFoodSource() {
        return foodSource;
    }

    public int getNumberOfScales() {
        return numberOfScales;
    }

    public boolean isAquatic() {
        return aquatic;
    }

    public boolean isScales() {
        return scales;
    }


    /**
     * set methods
     */
    public void setAquatic(boolean aquatic) {
        this.aquatic = aquatic;
    }

    public void setNumberOfScales(int numberOfScales) {
        this.numberOfScales = numberOfScales;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }
}
