package edu.kyleknobloch.APCS.Classwork.September.TesterProjects;

public class Automobile {

    private int year;
    private String make;
  	private String model;
  	private double mileage;
  	private String color;
  	private double engineType;
  	private double stickerPrice;


    public Automobile (int year, String make, String model, double mileage, String color, double engineType, double stickerPrice) {

        this.year = year;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.engineType = engineType;
        this.stickerPrice = stickerPrice;

    }

    public Automobile (double stickerPrice) {

        year = 2000;
        make = "honda";
        model = "Mr. Drugan";
        mileage = 10;
        color = "Blue";
        engineType = 4.5;
        this.stickerPrice = stickerPrice;
    }

    /**
     * ToString
     */

    public String toString() {

        String msg = "Year: " + getYear() + "\n" +
                     "Make: " + getMake() + "\n" +
                     "Model: " + getModel() + "\n" +
                     "Mileage: " + getMileage() + "\n" +
                     "Color: " + getColor() + "\n" +
                     "Engine Type:" + getEngineType() + "\n" +
                     "Sticker Price: $" + getStickerPrice();

        return msg;

    }

    private String toString(int year, String make, String model, double mileage, String color, double engineType, double stickerPrice) {

        String msg = "Year: " + year + "\n" +
                     "Make: " + make + "\n" +
                     "Model: " + model + "\n" +
                     "Mileage: " + mileage + "\n" +
                     "Color: " + color + "\n" +
                     "Engine Type:" + engineType + "\n" +
                     "Sticker Price: $" + stickerPrice;

        return msg;
    }

    /**
     * Set Methods
     */


    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setStickerPrice(double stickerPrice) {
        this.stickerPrice = stickerPrice;
    }

    /**
     * Get Methods
     */

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getEngineType() {
        return engineType;
    }

    public double getStickerPrice() {
        return stickerPrice;
    }

}

