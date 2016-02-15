package edu.kyleknobloch.APCS.Classwork.Febuary;

/**
   This program demonstrates the recursive fib method.
*/

public class FibNumbers
{
   public static void main(String[] args)
   {
      System.out.println("The first ten numbers in " +
                         "the Fibonacci series are:");

      for (int i = 0; i < 10; i++)
         System.out.print(fib(i,"Loop") + " ");

      System.out.println();
   }
   
   /**
      The fib method calculates the nth
      number in the Fibonacci series.
      @param n The nth number to calculate.
      @return The nth number.
   */
   
   public static int fib(int n, String msg)
   {
   
      System.out.println(msg);
      if (n == 0)
         return 0;
      else if (n == 1)
         return 1;
      else
         return fib((n - 1), "First Call:") + fib((n - 2), "Second Call:");
   }
}
