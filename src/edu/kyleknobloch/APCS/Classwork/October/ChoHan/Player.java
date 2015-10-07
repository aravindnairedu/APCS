package edu.kyleknobloch.APCS.Classwork.October.ChoHan;
import java.util.Random;

/**
   Player class for the game of ChoHan
*/
   
public class Player
{
    private String name;    // The player's name
    private String guess;   // The player's guess
    private String cheepGuess; //I'm lazy
    private int points;     // The player's points
    private int d1, d2, d3, d4; //the player's dice
    private int sum;
   
   /**
      Constructor
      @param playerName The player's name.
   */
   
   public Player(String playerName) {

       name = playerName;
       guess = "";
       points = 0;
       rollDice();
       sumDice();

   }

    private void sumDice() {
        sum = d1 + d2 + d3 + d4;
    }


    public void rollDice() {
        final int SIDES = 6; // Number of sides for the dice

        // Create the two dice. (This also rolls them.)
        ChoHanDie die1 = new ChoHanDie(SIDES);
        ChoHanDie die2 = new ChoHanDie(SIDES);
        ChoHanDie die3 = new ChoHanDie(SIDES);
        ChoHanDie die4 = new ChoHanDie(SIDES);

        // Record their values.
        d1 = die1.getValue();
        d2 = die2.getValue();
        d3 = die3.getValue();
        d4 = die4.getValue();
    }
   
   /**
      The makeGuess method causes the player to guess
      either "Cho (even)" or "Han (odd)".
   */
   
   public void makeGuess() {
       // Create a Random object.
       Random rand = new Random();

       // Get a random number, either 0 or 1.
       int guessNumber = rand.nextInt(2);

       // Convert the random number to a guess of
       // either "Cho (even)" or "Han (odd)".
       if (guessNumber == 0) {
           guess = "Cho (low)";
           cheepGuess = "low";
       }
       else {
           guess = "Han (high)";
           cheepGuess = "high";
       }
   }

   public String diceResult () {
       return d1 + ", " + d2 + ", " + d3 + ", " + d4;
   }
   
   /**
      The addPoints method adds a specified number of
      points to the player's current balance.
      @newPoints The points to add.
   */
   
   public void addPoints(int newPoints) {
       points += newPoints;
   }


    /**
     * Get methods
     */
   
    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
       return points;
    }

    public int getSum() {
        return sum;
    }

    public String getCheepGuess() {
        return cheepGuess;
    }
}