package edu.kyleknobloch.APCS.Classwork.September.Challenge;
import java.util.Random;

public class Die {
    public static int roll() {
        Random roll = new Random();

        return roll.nextInt(6) + 1;
    }
}
