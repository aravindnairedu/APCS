package edu.kyleknobloch.APCS.Homework.October;


public class RetailItem {

    private String desc;
    private int units;
    private double cost;

    public RetailItem (String desc, int units, double cost) {
        /*
         * Take in Descm Units and Cost
         * Set said items.
         */

        setCost(cost);
        setDesc(desc);
        setUnits(units);
    }

    public RetailItem () {
        //I do nothing
    }

    @Override
    public String toString() {
        /*
         * toString overide method. This displays all the information on the product.
         */

        return "Item's Decription: " + getDesc() + "\nUnits on hand: " + getUnits() + "\nCost: " + getCost() +"\n";
    }


    /**
     * Set Methods
     */

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    /**
     * Get Methods
     */

    public String getDesc() {
        return desc;
    }

    public int getUnits() {
        return units;
    }

    public double getCost() {
        return cost;
    }
}
