package edu.kyleknobloch.APCS.Classwork.November.RockPaperScissor;

/**
 * Rock Paper Scissor!
 * Author: @fredghostkyle
 * GitHub: github.com/fredghostkyle
 */

public class Player {

    private String name;
    private int score;
    private String hand;


    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = "none";

    }


    /**
     * score methods
     */
    public void increeseScore (int v) {
        score = score + v;

    }

    public void decreeseScore (int v) {
        score = score - v;

    }

    public void plusOneScore () {
        score++;

    }


    /**
     * get methods
     */
    public int getScore() {
        return score;
    }

    public String getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }


    /**
     * set methods
     */
    public void setHand(String hand) {
        this.hand = hand;
    }

    public void setScore(int score) {
        this.score = score;
        System.out.print("WARNING! JUST OVERRIDE SCORE! (ignore me if you're a user)");
    }

}
