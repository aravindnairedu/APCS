package edu.kyleknobloch.APCS.Homework.Chap15HW;

public class Ex1 {
    /**
     * @param base the first number to multiply
     * @param multiplier the second number to multiply
     * @return the base * multiplier
     */
    public double multiply(double base, double multiplier) {
        if (multiplier > 0)
            return base + multiply(base,  multiplier-1);
        else
            return 0;
    }
}
