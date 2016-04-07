package edu.kyleknobloch.APCS.CaseStudy.Activity1;

import edu.kyleknobloch.APCS.CaseStudy.Card;

/**
 * Elevens Lab Case Study
 *
 * Activity 1
 * Card Tester
 */
public class CardTester {

    public static void main(String[] args) {
        Card KingOfHearts = new Card("Hearts", "K", 13);

        System.out.println(KingOfHearts.getName());

        Card KingOfClubs = new Card("Clubs", "K", 13);

        System.out.println(KingOfClubs.toString());

        System.out.println(KingOfClubs.rank() + KingOfClubs.suit() + KingOfClubs.pointValue() + KingOfClubs.toString() + KingOfClubs.getName());

        Card TwoOfDiamond = new Card("Diamonds", "2", 2);

        System.out.println(TwoOfDiamond.toString());

    }

}
