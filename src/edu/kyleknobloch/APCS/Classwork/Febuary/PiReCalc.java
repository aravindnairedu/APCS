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

        System.out.println("-----------------------------------------------------------");
        System.out.println(bigPi(1000000, 1000));
    }


    public static BigDecimal bigPi(int max,int digits) {
        BigDecimal num2power6 = new BigDecimal(64);
        BigDecimal sum = new BigDecimal(0);
        for(int i = 0; i < max; i++ ) {
            System.out.println(i);

            BigDecimal tmp;
            BigDecimal term ;
            BigDecimal divisor;
            term = new BigDecimal(-32);
            divisor = new BigDecimal(4*i+1);
            tmp =  term.divide(divisor, digits, BigDecimal.ROUND_FLOOR);
            term = new BigDecimal(-1);
            divisor = new BigDecimal(4*i+3);
            tmp = tmp.add(term.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
            term = new BigDecimal(256);
            divisor = new BigDecimal(10*i+1);
            tmp = tmp.add(term.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
            term = new BigDecimal(-64);
            divisor = new BigDecimal(10*i+3);
            tmp = tmp.add(term.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
            term = new BigDecimal(-4);
            divisor = new BigDecimal(10*i+5);
            tmp = tmp.add(term.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
            term = new BigDecimal(-4);
            divisor = new BigDecimal(10*i+7);
            tmp = tmp.add(term.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
            term = new BigDecimal(1);
            divisor = new BigDecimal(10*i+9);
            tmp = tmp.add(term.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
            int s = ((1-((i&1)<<1)));
            divisor = new BigDecimal(2);
            divisor = divisor.pow(10*i).multiply(new BigDecimal(s));
            sum = sum.add(tmp.divide(divisor, digits, BigDecimal.ROUND_FLOOR));
        }
        sum = sum.divide(num2power6,digits, BigDecimal.ROUND_FLOOR);
        return sum;

    }

}
