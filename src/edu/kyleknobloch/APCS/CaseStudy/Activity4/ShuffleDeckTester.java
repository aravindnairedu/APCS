package edu.kyleknobloch.APCS.CaseStudy.Activity4;

import edu.kyleknobloch.APCS.CaseStudy.Deck;

/**
 * Elevens Lab Case Study
 *
 * Activity 4
 * Deck Shuffle Tester Tester
 */
public class ShuffleDeckTester {

    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.print(deck.toString());

        deck.shuffleDeck();

        System.out.println(deck.toString());

    }

}
