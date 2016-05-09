package edu.kyleknobloch.APCS.Exams.midterm.Question3;

/**
 * Kyle Knobloch
 * AP Computer Science Midterm Exam
 *
 * Question 3:
 * 35pt, 5 extra credit points
 *
 * TESTER CLASS
 */
public class MonthTester {

    public static void main (String args[]) {

        Month jan = new Month(1); //set with int
        Month noVar = new Month(); //default
        Month name = new Month("january");
        Month feb = new Month(2);
        Month negative = new Month(-100);


        System.out.println(jan.toString());
        System.out.println(noVar.getMonthName());
        System.out.println(name.getMonthName());
        System.out.println(feb.getMonthName() + " " + feb.getMonthNumber());
        System.out.println(negative.getMonthNumber());

    }
}
