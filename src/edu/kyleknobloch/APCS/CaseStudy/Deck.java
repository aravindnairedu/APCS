package edu.kyleknobloch.APCS.CaseStudy;

import java.util.ArrayList;

/**
 *
 */
public class Deck {

    public ArrayList<Card> deck;


    /**
     * Creates the deck
     */
    public Deck() {

        String case1 = "Hearts";
        String case2 = "Diamonds";
        String case3 = "Spades";
        String case4 = "Clubs";


        for (int caseI = 1; caseI <= 4; caseI++) {
            String activeCase = "";

            switch (caseI) {
                case 1:
                    activeCase = case1;
                    break;
                case 2:
                    activeCase = case2;
                    break;
                case 3:
                    activeCase = case3;
                    break;
                case 4:
                    activeCase = case4;
                    break;
            }


            for (int valueI = 1; valueI <= 13; valueI++) {
                if (valueI == 1)
                    deck.add(new Card(activeCase, "A", 1));

                else if (valueI >= 2 || valueI <= 10)
                    deck.add(new Card(activeCase, valueI + "", valueI));

                else if (valueI == 11)
                    deck.add(new Card(activeCase, "J", valueI));

                else if (valueI == 12)
                    deck.add(new Card(activeCase, "Q", valueI));

                else if (valueI == 13)
                    deck.add(new Card(activeCase, "K", valueI));

            }


        }


    }


    public void shuffleDeck() {

    }



    public ArrayList<Card> getDeck() {
        return deck;
    }


}
