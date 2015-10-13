package edu.kyleknobloch.APCS.Homework.October;

import javax.swing.*;

public class TestScores {

    public double avg, grade1, grade2, grade3, grade4, grade5;


    public TestScores() {
        //default constuctor

        String input;
        JOptionPane JO = new JOptionPane();


        //get the 5 letter grades
        input = JO.showInputDialog(null, "Please enter grade 1");
        grade1 = Double.parseDouble(input);
        JO.showMessageDialog(null, grade1 + ": " + determineLetterGrade(grade1));

        input = JO.showInputDialog(null, "Please enter grade 2");
        grade2 = Double.parseDouble(input);
        JO.showMessageDialog(null, grade2 + ": " + determineLetterGrade(grade2));

        input = JO.showInputDialog(null, "Please enter grade 3");
        grade3 = Double.parseDouble(input);
        JO.showMessageDialog(null, grade3 + ": " + determineLetterGrade(grade3));

        input = JO.showInputDialog(null, "Please enter grade 4");
        grade4 = Double.parseDouble(input);
        JO.showMessageDialog(null, grade4 + ": " + determineLetterGrade(grade4));

        input = JO.showInputDialog(null, "Please enter grade 5");
        grade5 = Double.parseDouble(input);
        JO.showMessageDialog(null, grade5 + ": " + determineLetterGrade(grade5));


        calcAvg(); //find the avg

        //display the avg
        JOptionPane.showMessageDialog(null, "The average for the 5 test scors was a " + determineLetterGrade(getAvg()) + ".");
    }

    public TestScores(double grade1, double grade2, double grade3, double grade4, double grade5) {
        //Default constructor that takes in the 5 grades and prints out the avg.
        //techinicaly could be used as a toSting but I don't think that would make sense to submit with my homework.
        //this is more for me to have because I can. 
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
        calcAvg();
        System.out.println("The average for the 5 test scores was a " + determineLetterGrade(getAvg()) + ".");
    }



    private void calcAvg() {
        //Average Finder Method

        avg = (getGrade1() + getGrade2() + getGrade3() + getGrade4() + getGrade5() ) / 5;

    }

    private String determineLetterGrade(Double grade) {
        //find Letter Grade Method

        String letterGrade;


        //would use a switch statment but that would of been a lot more lines thus, less efficient (to my knowlage)
        if (grade >= 90) {
            letterGrade = "A";
        }
        else if (grade >= 80) {
            letterGrade = "B";
        }
        else if (grade >= 70) {
            letterGrade = "C";
        }
        else if (grade >= 60) {
            letterGrade = "D";
        }
        else if (grade <= 60) {
            letterGrade = "F";
        }
        else {
            letterGrade = "Something went wrong";
        }

        return letterGrade;
    }


    /**
     * Get Methods
     */

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public double getGrade4() {
        return grade4;
    }

    public double getGrade5() {
        return grade5;
    }

    public double getAvg() {
        return avg;
    }
}
