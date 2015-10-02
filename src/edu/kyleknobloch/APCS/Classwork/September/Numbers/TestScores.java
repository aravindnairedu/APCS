package edu.kyleknobloch.APCS.Classwork.September.Numbers;

public class TestScores {

    public double avg, grade1, grade2, grade3;


    public TestScores (double grade1, double grade2, double grade3) {
        //Average Finder Constructor
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;

        avg = (getGrade1() + getGrade2() + getGrade3() ) / 3;

    }

    public String findLetterGrade(Double grade) {
        //find Letter Grade

        String letterGrade;


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

    public String toString() {

        String msg = "The average letter grade is " + findLetterGrade(getAvg()) + ".";
        return msg;
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

    public double getAvg() {
        return avg;
    }
}
