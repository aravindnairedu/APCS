package edu.kyleknobloch.APCS.Exams.December1;

/**
 * Kyle Knobloch
 * AP CS Exam #1
 * Part 2: Question 2
 */
public class QuestionTwo {

    public static void main (String args[]) {

        /**
         * The code given would not compile. This is because all the methods in the class are not static. If you were to
         * change the methods to static, it would compile and run. Once the methods are all static, the class would
         * compile, yes. (or you could make an object of the class). You're also missing the ArrayList import.
         *
         * A; the for each loop will print the contesnts of the ArrayList arr. The contents would be the index + 4.
         *
         * B; nothing would be printed here initially, but each time it goes though, the ArrayList arr's size would be
         * getting smaller, because you are removing elements from the ArrayList, but the int i would never get smaller,
         * eventually an exception would be thrown saying that the index in too high in the ArrayList. It would throw a
         * IndexOutOfBoundsException.
         *
         */

    }
}
