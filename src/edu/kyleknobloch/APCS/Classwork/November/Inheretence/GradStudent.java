package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

/**
 * Created by kyleknobloch on 11/16/15,
 * For
 * *
 * Actions:
 */
public class GradStudent extends Student {

    private String major;
    private String minor;
    private String thesis;


    public GradStudent (String firstName, String lastName, String middleInitiel, String addres, String phoneNumber, String contactNumbers) {
        super(firstName, lastName, middleInitiel, addres, phoneNumber, contactNumbers);
        setMajor("undefined");
        setMinor("undefined");
        setThesis("undefined");
    }


    @Override
    public String toString() {
        return super.toString() + "Major(s): " + getMajor() + "\nMinor(s): " + getMinor() + "\nThesis: " + getThesis() + "\n";
    }

    /**
     * get methods
     */
    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    public String getThesis() {
        return thesis;
    }

    /**
     * set methods
     */

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }
}
