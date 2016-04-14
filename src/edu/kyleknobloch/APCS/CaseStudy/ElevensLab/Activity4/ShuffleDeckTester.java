package edu.kyleknobloch.APCS.CaseStudy.ElevensLab.Activity4;

import edu.kyleknobloch.APCS.CaseStudy.ElevensLab.Deck;

/**
 * ElevensLab Lab Case Study
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
