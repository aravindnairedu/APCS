package edu.kyleknobloch.APCS.Classwork.October.Challenges;

/**
 * Players
 */
public class Player {

    private int score;
    private String name;

    /**
     * Default constructor. Sets the name of the user as score would already be 0.
     * @param name the player's name
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
