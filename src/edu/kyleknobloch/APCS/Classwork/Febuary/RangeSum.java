package edu.kyleknobloch.APCS.Classwork.Febuary;

import java.util.Scanner;

/**
   This program demonstrates the recursive rangeSum method.
*/

public class RangeSum
{

   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);

      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
      int first;
      int last;

      System.out.print("The elements in the array: ");

      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      }

      System.out.println("\nWhat is the first Element in the array you would like to sum to?");
      first = console.nextInt() + 1;
      System.out.println("And the last element in the array? ");
      last = console.nextInt() - 1;

      System.out.print("The sum of elements is "+ rangeSum(numbers, first, last));
   }
   
   /**
      The rangeSum method calculates the sum of a specified
      range of elements in array. 
      @param start Specifies the starting element.
      @param end Specifies the ending element.
      @return The sum of the range.
   */
   
   public static int rangeSum(int[] array, int start, int end)
   {
      if (start > end)
         return 0;
      else
         return array[start] +
                    rangeSum(array, start + 1, end);
   }
}
