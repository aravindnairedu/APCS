package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

/**
 * Created by kyleknobloch on 11/16/15,
 * For
 * *
 * Actions:
 */
public class NonMatriculatingStudent extends Student {

    private String classes;


    public NonMatriculatingStudent(String firstName, String lastName, String middleInitiel, String addres, String phoneNumber, String contactNumbers) {
        super(firstName, lastName, middleInitiel, addres, phoneNumber, contactNumbers);

        setClasses("undefined");
    }


    @Override
    public String toString() {
        return super.toString() + "Classes: " + getClasses() + "\n";
    }

    /**
     * get methods
     */
    public String getClasses() {
        return classes;
    }

    /**
     * The Year of Graduation for a non matriculating student is undetermined as they're only taking classes and don't
     * plan on "graduating."
     * @return -1 as they don't have an official Year of Graduation
     */
    @Override
    public int getYoG() {
        return -1;
    }

    /**
     * set methods
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }
}
