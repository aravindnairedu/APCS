package edu.kyleknobloch.APCS.Homework.October;


public class KnoblochOct7HW {

    public static void main (String args[] ) {

        /**
         * RetialItem
         */

        //Set up each item
        RetailItem RI1 = new RetailItem("Pizza Box", 150, 0.99);
        RetailItem RI2 = new RetailItem("NightCrow", 1, 10000.0);
        RetailItem RI3 = new RetailItem("AP Computer Science Classes", 0, 5.75);
        RetailItem RI4 = new RetailItem();

        //Proof that my set methods work
        RI4.setUnits(5);
        RI4.setCost(50.80);
        RI4.setDesc("Mr. Drugan");


        //Display the toString method to prove that the GetMethods work.
        System.out.println(RI1.toString());
        System.out.println(RI2.toString());
        System.out.println(RI3.toString());
        System.out.println(RI4.toString());

        /**
         * CoinToss Simulator
         */


        int heads = 0 ;
        int tails = 0;
        int i = 0;
        do {
            //toss the coin
            CoinToss CT = new CoinToss();

            //Heads & tails counter
            if (CT.getSideUp() == "Heads") {
                heads++;
            }
            if (CT.getSideUp() == "Tails") {
                tails++;
            }


            i++; //increment
        } while (i < 20);

        System.out.println("\nHeads: " + heads + "\nTails: " + tails);
    }
}
