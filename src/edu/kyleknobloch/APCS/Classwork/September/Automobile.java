

public class Automobile {

    private int year;
    private String make;
  	private String model;
  	private double mileage;
  	private String color;
  	private double engineType;
  	private double stickerPrice;


    public Automobile (int year, String make, String model, double mileage, String color, double engineType, double stickerPrice) {

        setYear(year);
        setMake(make);
        setModel(model);
        setMileage(mileage);
        setColor(color);
        setEngineType(engineType);
        setStickerPrice(stickerPrice);

    }

    public Automobile (double stickerPrice) {

        setYear(2000);
        setMake("Honda");
        setModel("Mr. Drugan");
        setMileage(10);
        setColor("Blue");
        setEngineType(4.5);
        setStickerPrice(stickerPrice);

    }

    /**
     * ToString
     */

    public String toString() {

        String msg =       "Year: " + getYear() + "\n" +
                           "Make: " + getMake() + "\n" +
                           "Model: " + getModel() + "\n" +
                           "Mileage: " + getMileage() + "\n" +
                           "Color: " + getColor() + "\n" +
                           "Engine Type:" + getEngineType() + "\n" +
                           "Sticker Price: " + getStickerPrice();

        return msg;

    }

    private String toString(int year, String make, String model, double mileage, String color, double engineType, double stickerPrice) {

        String msg =    "Year: " + year + "\n" +
                        "Make: " + make + "\n" +
                        "Model: " + model + "\n" +
                        "Mileage: " + mileage + "\n" +
                        "Color: " + color + "\n" +
                        "Engine Type:" + engineType + "\n" +
                        "Sticker Price: " + stickerPrice;

        return msg;
    }

    /**
     * Set Methods
     */

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineType(double engineType) {
        this.engineType = engineType;
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

