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
        gradStudent.setMinor("Web Development, Java, C++, American Sign Language");

        System.out.println(gradStudent.toString());


        UnderGradStudent underGradStudent = new UnderGradStudent("John", "Drugan", "J", "482 JAva St apt. 420, Marshfield, Ma, 02334", "4233458760", "I disslke my parents");

        underGradStudent.setMajor("Really Big Word");
        underGradStudent.setMinor("really small word");

        System.out.println(underGradStudent.toString());


        NonMatriculatingStudent nonMatriculatingStudentStudent = new NonMatriculatingStudent("Brendan", "Sheean", "F", "342 Some Street, Duxbury, MA, 02332", "3453423489", "His parents are too ritch for this application to even madder");

        nonMatriculatingStudentStudent.setClasses("Computer Science A435, Into to Java F533, Into to C++ and Python D532");

        System.out.println(nonMatriculatingStudentStudent.toString());



    }
}
