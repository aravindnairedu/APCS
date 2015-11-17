package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

/**
 * Created by kyleknobloch on 11/16/15,
 * For
 * *
 * Actions:
 */
public class StudentTester {

    public static void main (String args[]) {

        GradStudent gradStudent = new GradStudent("Kyle", "Knobloch", "J", "40 Elis Ln, Duxbury, MA, 02332", "4076229995", "I don't have parents.");

        gradStudent.setMajor("Computer Science");
        gradStudent.setMinors("Web Development, Java, C++, American Sign Language");

        System.out.println(gradStudent.toString());


    }
}
