package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

import java.util.Random;

/**
 * Created by kyleknobloch on 11/16/15,
 * For
 * *
 * Actions:
 */
public class Student {


    final int CURRENTYEAR = 2015;

    private String firstName;
    private String lastName;
    private String middleInitiel;
    private String addres;
    private String phoneNumber;
    private String contactNumbers;
    private int studentID;
    private int YoG;


    public Student (String firstName, String lastName, String middleInitiel, String addres, String phoneNumber, String contactNumbers) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitiel = middleInitiel;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.contactNumbers = contactNumbers;

        studentID = setStudentID();
        YoG = CURRENTYEAR + 4;

    }


    @Override
    public String toString () {
        return "Student information: " +
                "\nFull Name: " + getFirstName() + " " + getMiddleInitiel() + " " + getLastName() +
                "\nAddress: " + getAddres() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nContact Numbers: " + getContactNumbers() +
                "\nID: " + getStudentID() +
                "\nYoG: " + getYoG() + " \n";
    }

    /**
     * get methods
     */

    public int getStudentID() {
        return studentID;
    }

    public int getYoG() {
        return YoG;
    }

    public String getAddres() {
        return addres;
    }

    public String getContactNumbers() {
        return contactNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitiel() {
        return middleInitiel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * set methods
     */

    public void setYoG(int yoG) {
        YoG = yoG;
    }

    private int setStudentID() {
        Random r = new Random();

        return r.nextInt(999999999) + 1;
    }
}
