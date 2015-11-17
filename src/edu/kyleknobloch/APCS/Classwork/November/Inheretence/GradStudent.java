package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

/**
 * Created by kyleknobloch on 11/16/15,
 * For
 * *
 * Actions:
 */
public class GradStudent extends Student {

    private String major;
    private String minors;


    public GradStudent (String firstName, String lastName, String middleInitiel, String addres, String phoneNumber, String contactNumbers) {
        super(firstName, lastName, middleInitiel, addres, phoneNumber, contactNumbers);
        this.major = "undefined";
        this.minors = "undefined";
    }


    @Override
    public String toString() {
        return super.toString() + "Major: " + getMajor() + "\nMinors: " + getMinors() + "\n";
    }

    /**
     * get methods
     */
    public String getMajor() {
        return major;
    }

    public String getMinors() {
        return minors;
    }

    /**
     * set methods
     */

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinors(String minors) {
        this.minors = minors;
    }

}
