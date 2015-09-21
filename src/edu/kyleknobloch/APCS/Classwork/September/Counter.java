package edu.kyleknobloch.APCS.Classwork.September;
import javax.swing.JOptionPane;


public class Counter {

    private static int counter = 0;
    private static int sum = 0;
    private static int number = 0;

    public static void main (String arg[]) {

        String input;


        input  = JOptionPane.showInputDialog("Enter number");
        number = Integer.parseInt(input);

        System.out.println("Original Number=" + number);

        do {
            counter++;
            sum += counter;
        } while (counter <= number);

        System.out.println("Sum=" + sum);
        System.out.println("Counter=" + counter);


    }
}
