package edu.kyleknobloch.APCS.Classwork.September.Numbers;
import java.text.DecimalFormat;

/**
   This program uses the DecimalFormat class to display
   formatted numbers in a message dialog.
*/

public class Format4
{
   public static void main(String[] args)
   {
       double number1 = 0.12;
       double number2 = 0.05;
       double number3 = 1.25;

             
       // Create a DecimalFormat object.
       DecimalFormat formatter = new DecimalFormat("#00%");

       // Display the formatted variable contents.
       System.out.println(formatter.format(number1));
       System.out.println(formatter.format(number2));
       System.out.println(formatter.format(number3));
   }
}
