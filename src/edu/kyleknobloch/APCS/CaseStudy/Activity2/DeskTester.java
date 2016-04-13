package edu.kyleknobloch.APCS.CaseStudy.Activity2;

import edu.kyleknobloch.APCS.CaseStudy.Deck;

/**
 * Elevens Lab Case Study
 *
 * Activity 2
 * Deck Tester
 */
public class DeskTester {

    public static void main(String[] args) {

        Deck deck = new Deck();

        //System.out.print(deck.toString());

        String[] suits = {"D", "H", "S", "C"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck deck1 = new Deck(ranks, suits, values);

        deck1.shuffleDeck();

        System.out.println(deck1.toString());



    }
}
