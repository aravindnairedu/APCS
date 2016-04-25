package edu.kyleknobloch.APCS.Classwork.Aprl.FiveCardSTUD;

import java.util.ArrayList;

/**
 *
 */
public class FiveCardSTUD {

    private ArrayList<Card> hand1 = new ArrayList<>();
    private ArrayList<Card> hand2 = new ArrayList<>();

    public FiveCardSTUD() {

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



        if (findWin(hand1))
            System.out.println("Hand 1 is a winning hand");
        if (findWin(hand2))
            System.out.println("Hand 2 is a winning hand");
        else
            System.out.println("No 1 wins.");


    }


    public boolean findWin(ArrayList<Card> array) {
        int ace, two, three, four, five, six, seven, eight, nine, ten, J, Q, K;
        ace = two = three = four = five = six = seven = eight = nine = ten = J = Q = K = 0;

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
        }

        return  (ace >= 2 && ace <= 4 ) || (two >= 2 && two <= 4 ) || (three >= 2 && three <= 4 ) ||
                (four >= 2 && four <= 4 ) || (five >= 2 && five <= 4 ) || (six >= 2 && six <= 4 ) ||
                (seven >= 2 && seven <= 4 ) || (eight >= 2 && eight <= 4 ) || (nine >= 2 && nine <= 4 ) ||
                (ten >= 2 && ten <= 4 ) || (J >= 2 && J <= 4 ) || (Q >= 2 && Q <= 4 ) || (K >= 2 && K <= 4 );

    }

}
