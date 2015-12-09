package edu.kyleknobloch.APCS.Classwork.December.Animals;

/**
 * Kyle Knobloch and Andrew Brook
 * Animal Inheritance
 *
 * Mammal sub class
 */
public class Mammal extends Animal {

    private boolean aquatic;
    private boolean fur;
    private boolean hair;
    private String foodSource;
    private String climate;


    public Mammal (String name, String species, String catagory) {
        super(name, species, catagory);
        aquatic = false;
        fur = false;
        hair = false;
        foodSource = "yummy food (default)";
        climate = "somewhere nice (default)";

    }

    public Mammal (String name, String species, String catagory, String climate, String foodSource) {
        super(name, species, catagory);
        this.foodSource =foodSource;
        this.climate = climate;
        aquatic = false;
        fur = false;
        hair = false;

    }


    /**
     * toString method
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + "Food Source: " + getFoodSource() + "\nClimate: " + getClimate() + "\nAquatic: " + isAquatic() + "\nFur: " + isFur() + "\nHair: "+ isHair() + "\n";
    }


    /**
     * get methods
     */
    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    @Override
    public String getCatagory() {
        return super.getCatagory();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getFoodSource() {
        return foodSource;
    }

    public String getClimate() {
        return climate;
    }

    public boolean isAquatic() {
        return aquatic;
    }

    public boolean isFur() {
        return fur;
    }

    public boolean isHair() {
        return hair;
    }

    /**
     * set methods
     */
    public void setAquatic(boolean aquatic) {
        this.aquatic = aquatic;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }
}
