package edu.kyleknobloch.APCS.Classwork.Aprl.FiveCardSTUD;

/**
 * Card object
 */
public class Card {

    private String suit;
    private String suitName;
    private String rank;
    private String rankName;
    private int pointValue;
    private String imageValue;
    private String imageValueS;


    /**
     * For each card
     * DO NOT USE: (these are the pre-conditions)
     * "five" use "5"
     * "heart" use "Hearts"
     * "King" use "K"
     *
     * @param suit Hearts/Spades/Clubs/Diamonds || H/S/C/D
     * @param value 2-10/A/J/Q/K
     * @param pointValue This game's point value
     */
    public Card (String suit, String value, int pointValue) {

        this.suit = suit;
        this.rank = value;
        this.pointValue = pointValue;


        if (getRank().length() <= 2) {
            switch (getRank()) {
                case "A":
                    rankName = "Ace";
                    break;
                case "1":
                    this.rank = "A";
                    rankName = "Ace";
                    break;
                case "2":
                    rankName = "Two";
                    break;
                case "3":
                    rankName = "Three";
                    break;
                case "4":
                    rankName = "Four";
                    break;
                case "5":
                    rankName = "Five";
                    break;
                case "6":
                    rankName = "Six";
                    break;
                case "7":
                    rankName = "Seven";
                    break;
                case "8":
                    rankName = "Eight";
                    break;
                case "9":
                    rankName = "Nine";
                    break;
                case "10":
                    rankName = "Ten";
                    break;
                case "J":
                    rankName = "Jack";
                    break;
                case "Q":
                    rankName = "Queen";
                    break;
                case "K":
                    rankName = "King";
                    break;
                default:
                    rankName = "Rank was not recognised: " + getRank();
                    break;
            }
        } else
            rankName = rank;


        if (getSuit().length() == 1) {
            switch (getSuit()) {
                case "C":
                    suitName = "Clubs";
                    break;
                case "D":
                    suitName = "Diamonds";
                    break;
                case "S":
                    suitName = "Spades";
                    break;
                case "H":
                    suitName = "Hearts";
                    break;
                default:
                    suitName = "Suit was not recognised: " + getSuit();
                    break;
            }
        } else
            suitName = suit;

    }


    /**
     * Should ONLY be called 1 time.
     * Set the image values for selected and not selected for GUI.
     * @param imageValue Not-selected image
     * @param imageValueS Selected image
     */
    public void setImageStringLocation(String imageValue, String imageValueS) {

        this.imageValue = imageValue;
        this.imageValueS = imageValueS;

    }


    /**
     *
     * @param otherCard The other card
     * @return if the card matches or not.
     */
    public boolean matches(Card otherCard) {
        return ( otherCard.getSuit().equals(getSuit()) ) &&
                ( otherCard.getRank().equals(getRank()) ) &&
                ( otherCard.getPointValue() == getPointValue() );
    }


    /**
     * Getters
     */

    public String suit() { return getSuit(); }
    public String getSuit() {
        return suit;
    }

    public String getSuitName() {
        return suitName;
    }

    public String rank() {return getRank(); }
    public String getRank() {
        return rank;
    }

    public String getRankName() {
        return rankName;
    }

    public int pointValue() { return getPointValue(); }
    public int getPointValue() {
        return pointValue;
    }

    public String getImageValue() {
        return imageValue;
    }

    public String getImageValueS() {
        return imageValueS;
    }


    public String getName() {
        return getRankName() + " of " + getSuitName();
    }


    /**
     * toString
     * @return Suit and Value in readable form
     */
    @Override
    public String toString() {
        return getName() + " (point value: " + getPointValue() + ")";
    }

}
