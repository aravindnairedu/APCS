package edu.kyleknobloch.APCS.Classwork.Febuary;

import java.math.BigDecimal;

public class PiReCalc {
    public static final int N = 1000000; // # of terms
    public static final int D = 1000; // # decimal places (the more, the less accurate)

    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0);      // final sum
        BigDecimal term = new BigDecimal(0);           // term without sign
        BigDecimal sign = new BigDecimal(1.0);     // sign on each term

        BigDecimal one = new BigDecimal(1.0);
        BigDecimal two = new BigDecimal(2.0);

        for (int k = 0; k <= N; k++) {
            BigDecimal count = new BigDecimal(k);
            //term = 1.0/(2.0*k + 1.0);
            BigDecimal temp1 = two.multiply(count);
            BigDecimal temp2 = temp1.add(one);
            term = one.divide(temp2,D,BigDecimal.ROUND_FLOOR);

            //sum = sum + sign*term;
            BigDecimal temp3 = sign.multiply(term);
            sum = sum.add(temp3);

            sign = sign.negate();

            System.out.println(k);
        }

        BigDecimal pi = new BigDecimal(0);
        BigDecimal four = new BigDecimal(4);
        pi = sum.multiply(four);

        System.out.println("Calculated approx. pi (" + N + " terms and " + D + " Decimal Places): " + pi);
        System.out.println("Actual pi: " + Math.PI);
    }
}
