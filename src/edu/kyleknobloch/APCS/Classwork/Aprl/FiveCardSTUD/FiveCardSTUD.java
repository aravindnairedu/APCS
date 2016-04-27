package edu.kyleknobloch.APCS.Classwork.Aprl.FiveCardSTUD;

import java.util.ArrayList;

/**
 * Five Card STUD
 */
public class FiveCardSTUD {

    private ArrayList<Card> hand1 = new ArrayList<>();
    private ArrayList<Card> hand2 = new ArrayList<>();

    private int ace, two, three, four, five, six, seven, eight, nine, ten, J, Q, K;
    private int heart, diamonds, spades, clubs;

    public FiveCardSTUD() {

        ace = two = three = four = five = six = seven = eight = nine = ten = J = Q = K = 0;
        heart = diamonds = spades = clubs = 0;

        Deck deck = new Deck();
        deck.shuffleDeck();


        /**
         * deal the cards to the hands
         */
        for (int i = 0; i < 5; i++) {
            hand1.add(deck.deal());
            hand2.add(deck.deal());
        }

        /**
         * toString for hands
         */
        System.out.println("Hand 1:");
        for (int i = 0; i < hand1.size(); i++)
            System.out.print(hand1.get(i).getName() + ", ");


        System.out.print("\n\nHand 2:\n");
        for (int i = 0; i < hand2.size(); i++)
            System.out.print(hand2.get(i).getName() + ", ");

        System.out.print("\n\n");

        /**
         * hand 1
         */
        calcStats(hand1);

        if (find2Rank() || find5Suit())
            System.out.println("Hand 1 has a winning hand.");
        else
            System.out.println("Hand 1 is not a winning hand.");

        /**
         * hand 2
         */
        calcStats(hand2);
        if (find2Rank() || find5Suit())
            System.out.println("Hand 2 has a winning hand.");
        else
            System.out.println("Hand 2 is not a winning hand.");

    }


    /**
     * Calculate the statistics on cards in a array
     * @param array array to calculate stats on
     */
    public void calcStats(ArrayList<Card> array) {
        //stats
        for(int i = 0; i < array.size(); i++) {
            switch (array.get(i).getRank()) {
                case "A":
                    ace++;
                    break;
                case "2":
                    two++;
                    break;
                case "3":
                    three++;
                    break;
                case "4":
                    four++;
                    break;
                case "5":
                    five++;
                    break;
                case "6":
                    six++;
                    break;
                case "7":
                    seven++;
                    break;
                case "8":
                    eight++;
                    break;
                case "9":
                    nine++;
                    break;
                case "10":
                    ten++;
                    break;
                case "J":
                    J++;
                    break;
                case "Q":
                    Q++;
                    break;
                case "K":
                    K++;
                    break;
                default:
                    break;
            }


            switch (array.get(i).getSuit()) {
                case "Hearts":
                    heart++;
                    break;
                case "Diamonds":
                    diamonds++;
                    break;
                case "Clubs":
                    clubs++;
                    break;
                case "Spades":
                    spades++;
                    break;
            }

        }
    }


    /**
     * Determines if there is 2 or more of a rank
     * @return 2 or more of any rank
     */
    private boolean find2Rank() {
        return  (ace >= 2) || (two >= 2) || (three >= 2) || (four >= 2) || (five >= 2) || (six >= 2) || (seven >= 2) ||
                (eight >= 2) || (nine >= 2) || (ten >= 2) || (J >= 2) || (Q >= 2) || (K >= 2);
    }

    /*public boolean find3() {
        return  (ace >= 3) || (two >= 3) || (three >= 3) || (four >= 3) || (five >= 3) || (six >= 3) || (seven >= 3) ||
                (eight >= 3) || (nine >= 3) || (ten >= 3) || (J >= 3) || (Q >= 3) || (K >= 3);
    }
    public boolean find4() {
        return  (ace >= 4) || (two >= 4) || (three >= 4) || (four >= 4) || (five >= 4) || (six >= 4) || (seven >= 4) ||
                (eight >= 4) || (nine >= 4) || (ten >= 4) || (J >= 4) || (Q >= 4) || (K >= 4);
    } */


    /**
     * Determines if there is 5 or more of a suit
     * @return 5 or more of any suit
     */
    private boolean find5Suit() {
        return (heart >= 5) || (diamonds >= 5) || (clubs >= 5) || (spades >= 5);
    }

}

