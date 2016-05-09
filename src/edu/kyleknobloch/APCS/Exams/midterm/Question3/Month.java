package edu.kyleknobloch.APCS.Exams.midterm.Question3;


import javax.naming.SizeLimitExceededException;
import javax.swing.*;

/**
 * Kyle Knobloch
 * AP Computer Science Midterm Exam
 *
 * Question 3:
 * 35pt, 5 extra credit points
 */
public class Month {

    private int monthNumber; //jan:1, feb:2, mar:3, apr:4, may:5, jun:6, jul:7, aug:8, sep:9, oct:10, nov:11, dec:12




    public Month () {
        monthNumber = 1;
    }

    public Month (int monthNumber) {
        try {
            if (monthNumber > 12 || monthNumber < 0)
                throw new SizeLimitExceededException("The number you entered is too big or too small!");
            else
                this.monthNumber = monthNumber;

        }
        catch (SizeLimitExceededException e) {
            JOptionPane.showMessageDialog(null, e);
            this.monthNumber = 1;
        }

    }

    public Month (String monthName) {
        try {
            if (monthNumber > 12 || monthNumber < 0)
                throw new SizeLimitExceededException("The number you entered is too big or too small!");
            else if (monthName.equalsIgnoreCase("january"))
                monthNumber = 1;
            else if (monthName.equalsIgnoreCase("february"))
                monthNumber = 2;
            else if (monthName.equalsIgnoreCase("march"))
                monthNumber = 3;
            else if (monthName.equalsIgnoreCase("april"))
                monthNumber = 4;
            else if (monthName.equalsIgnoreCase("may"))
                monthNumber = 5;
            else if (monthName.equalsIgnoreCase("june"))
                monthNumber = 6;
            else if (monthName.equalsIgnoreCase("july"))
                monthNumber = 7;
            else if (monthName.equalsIgnoreCase("august"))
                monthNumber = 8;
            else if (monthName.equalsIgnoreCase("september"))
                monthNumber = 9;
            else if (monthName.equalsIgnoreCase("october"))
                monthNumber = 10;
            else if (monthName.equalsIgnoreCase("november"))
                monthNumber = 11;
            else if (monthName.equalsIgnoreCase("december"))
                monthNumber = 12;

        } catch (SizeLimitExceededException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void setMonthNumber(int monthNumber) {
        try {
            if (monthNumber > 12 || monthNumber < 0)
                throw new SizeLimitExceededException("The number you entered is too big or too small!");
            else
                this.monthNumber = monthNumber;
        }
        catch (SizeLimitExceededException e) {
            JOptionPane.showMessageDialog(null, e);
            this.monthNumber = 1;
        }
    }


    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String monthName;

        switch (getMonthNumber()) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Something is not right.";
                break;
        }

        return monthName;
    }

    @Override
    public String toString() {
        return "Month name: " + getMonthName() + "\nMonth number: " + getMonthName();
    }
}
