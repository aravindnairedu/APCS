package edu.kyleknobloch.APCS.Classwork.Febuary.Recursion;

import java.math.BigDecimal;

/**
 This program demonstrates the recursive fib method.
 */

public class Fib
{
    public static void main(String[] args)
    {
        System.out.println("The first ten numbers in " +
                "the Fibonacci series are:");

        for (int i = 0; i < 100; i++)
            System.out.print(fib(new BigDecimal(i), "Loop") + " ");

        System.out.println();
    }

    /**
     The fib method calculates the nth
     number in the Fibonacci series.
     @param n The nth number to calculate.
     @param msg the Message that we might display. Mainly used if we're planning on debugging.
     @return The nth number.
     */

    public static BigDecimal fib(BigDecimal n, String msg)
    {

        //System.out.println("N: " + n);
        if (n.stripTrailingZeros().equals(new BigDecimal(0).stripTrailingZeros()) ) {
            //System.out.println("return");
            return new BigDecimal(0);

        } else if (n.stripTrailingZeros().equals(new BigDecimal(1).stripTrailingZeros())) {
            return new BigDecimal(0);
        } else
            return fib(n.subtract(new BigDecimal(1)), "").add(fib(n.subtract(new BigDecimal(2)), ""));
    }
}
