package edu.kyleknobloch.APCS.CaseStudy;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Deck Class
 */
public class Deck {

    private int shuffleCount;
    private ArrayList<Card> deck;
    private int dealtCards;
    private int undealtCards;


    /**
     * Creates a full deck of cards (4 suits * 13 values/ranks)
     */
    public Deck() {

        //Class vars
        shuffleCount = 10;
        dealtCards   = 0;
        undealtCards = 0;
        deck = new ArrayList<>();


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

                else if (valueI >= 2 && valueI <= 10)
                    deck.add(new Card(activeCase, valueI + "", valueI));

                else if (valueI == 11)
                    deck.add(new Card(activeCase, "J", valueI));

                else if (valueI == 12)
                    deck.add(new Card(activeCase, "Q", valueI));

                else if (valueI == 13)
                    deck.add(new Card(activeCase, "K", valueI));

                else
                    undealtCards--; //to combat the undealtCards++ below this line.

                undealtCards++;
            }
        }
    }


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks   (RANK)  is an array containing all of the card ranks.
     * @param suits   (SUIT)  is an array containing all of the card suits.
     * @param values (POINTS) is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {

        /**
         * Users are stupid:
         * We're telling them that they inputted different sizes for ranks and values thus the value will not be
         * assigned to the desired rank by throwing a Exception :)
         */
        try {
            if (!(ranks.length == values.length))
                throw new SizeMismatch();
        } catch (SizeMismatch e) {
            JOptionPane.showMessageDialog(null, "There was a error with the ranks[] and values[] being different sizes, thus " +
                    "the point vaules *may* be wrong. Sorry about that! \nError: " + e);
        }


        dealtCards   = 0;
        undealtCards = 0;
        deck = new ArrayList<>();


        for (int suitsI = 0; suitsI < suits.length; suitsI++) {
            for (int rankI = 0; rankI < ranks.length; rankI++) {
                deck.add(new Card(suits[suitsI], ranks[rankI], values[rankI]));
                undealtCards++;
            }
        }
    }


    /**
     * Shuffles the deck
     * @return a shuffled deck
     *
     * **This is stolen from Shuffler class in Activity 3**
     */
    public void shuffle() { shuffleDeck(); }
    public void shuffleDeck() {
        for (int i = 0; i <= shuffleCount; i++) {
            for (int k = deck.size() - 1; k > 0; k--) {
                int pos = (int) (Math.random() * (k + 1));  // range 0 to k, inclusive
                Card tempC = deck.get(pos);
                //values[pos] = values[k];
                //values[k] = temp;
                deck.set(pos, deck.get(k));
                deck.set(k, tempC);
            }
        }
        //new game is created by shuffling the deck
        undealtCards = deck.size() -1;
        dealtCards = 0;

    }


    /**
     * Determines if the deck is empty
     * @return weather the deck is empty or not
     */
    public boolean isEmpty() {
        return (undealtCards == 0);
    }


    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been previously dealt.
     */
    public Card giveCard() { return deal(); }
    public Card deal() {
        undealtCards--; //deal the card

		return deck.get(undealtCards); //give the card
    }


    /**
     * getters
     */

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getDealtCards() {
        return dealtCards;
    }

    public int size() {return getUndealtCards();} //number of undelt cards
    public int getUndealtCards() {
        return undealtCards;
    }

    public Card getFromIndex(int index) {
        return deck.get(index);
    }


    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        int size = deck.size() -1;
        String rtnString = "size = " + size + "\nUndealt cards: " + undealtCards + "\n\n";
        for (int k = undealtCards - 1; k >= 0; k--) {
            rtnString = rtnString + deck.get(k) + "\n";
        }

        rtnString = rtnString + "\nDealt cards: " + dealtCards + "\n\n";
        for (int k = dealtCards - 1; k >= size; k--) {
            rtnString = rtnString + deck.get(k) + "\n";
        }

        rtnString = rtnString + "\n";
        return rtnString;
    }


}
