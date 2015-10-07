package edu.kyleknobloch.APCS.Homework.October;

import java.util.Random;

public class CoinToss {

    public String sideUp;


    public  CoinToss() {
        /*
         * Default Contructor | toss the coin then display "Heads" or "Tails"
         */

        toss();
        System.out.println(getSideUp());
    }

    private void toss() {
        /*
         * Toss the coin.
         */

        Random r = new Random();
        int side =  r.nextInt(2) + 1;

        //set the side
        switch (side) {
            case 1:
                sideUp = "Heads";
                break;
            case 2:
                sideUp = "Tails";
                break;
            default:
                System.out.println("Ya fakn' broke it");
                break;
        }
    }

    /**
     * Get method
     */

    public String getSideUp() {
        return sideUp;
    }

}
