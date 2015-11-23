package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

/**
 * NonMatriculating extending Student
 */
public class NonMatriculatingStudent extends Student {

    private String classes;


    public NonMatriculatingStudent(String firstName, String lastName, String middleInitiel, String addres, String phoneNumber, String contactNumbers) {
        super(firstName, lastName, middleInitiel, addres, phoneNumber, contactNumbers);

        setClasses("undefined");
        super.setYoG(-1);
    }


    /**
     * @override
     *
     * toString displays all the information that we have for the student. It extends the Super.toString class to
     * include that information along with the information in this class.
     * @return toString message
     */
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
     * set methods
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }

}
