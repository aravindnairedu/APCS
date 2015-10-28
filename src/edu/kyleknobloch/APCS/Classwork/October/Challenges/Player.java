package edu.kyleknobloch.APCS.Classwork.October.Challenges;

/**
 * Players
 */
public class Player {

    private int score;
    private String name;

    /**
     * Default constructor. Sets the name of the user as score would already be 0.
     * @param name
     */
    public Player (String name) {
        this.name = name;
    }

    /**
     * Add one to the score (I'm lazy)
     */
    public void addOneToScore() {
        score++;
    }

    /**
     * Figure out the winner by checking each player's scores
     * @param score1 First score to check
     * @param score2 Second score to check
     * @return Sents back
     *         1: Player one wins
     *         2: Player two wins
     *         0: both win
     *        -1: it's broken
     */
    public int calcWinner (int score1, int score2) {
        if (score1 > score2)
            return 1;
        else if (score2 > score1)
            return  2;
        else if (score1 == score2)
            return 0;
        else
            return -1;
    }

    /**
     * Get methods
     * @return the requested varable.
     */
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
