package edu.kyleknobloch.APCS.CaseStudy;

/**
 * Card object
 */
public class Card {

    private String suit;
    private String value;
    private String imageValue;
    private String imageValueS;


    /**
     * For each card
     * DO NOT USE:
     * "five" use "5"
     * "heart" use "Hearts"
     * "King" use "K"
     *
     * @param suit Hearts/Spades/Clubs/Diamonds
     * @param value 2-10/A/J/Q/K
     */
    public Card (String suit, String value) {

        this.suit = suit;
        this.value = value;

    }


    /**
     * Should ONLY be called 1 time.
     * Set the image values for slected and not slected for GUI.
     * @param imageValue Not-selected image
     * @param imageValueS Selected image
     */
    public void setImageStringLocation(String imageValue, String imageValueS) {

        this.imageValue = imageValue;
        this.imageValueS = imageValueS;

    }


    /**
     * Getters
     */

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public String getImageValue() {
        return imageValue;
    }

    public String getImageValueS() {
        return imageValueS;
    }


    public String getName() {
        return getValue() + " of " + getSuit();
    }

    /**
     * toString
     * @return Suit and Value in readable form
     */
    @Override
    public String toString() {
        return "Suit: " + getSuit() + "\nValue: " + getValue();
    }
}
