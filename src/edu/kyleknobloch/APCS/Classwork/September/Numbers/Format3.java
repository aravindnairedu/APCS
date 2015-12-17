package edu.kyleknobloch.APCS.Classwork.September.Numbers;
import java.text.DecimalFormat;

/**
   This program uses the DecimalFormat class to display
   formatted numbers in a message dialog.
*/

public class Format3
{
   public static void main(String[] args)
   {
      double number1 = 123.899;
      double number2 = 1233.899;
      double number3 = 12345.899;
      double number4 = 123456.899;
      double number5 = 1234567.899;

      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("##,##.##");

      // Display the formatted variable contents.
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
      System.out.println(formatter.format(number5));
   }
}
