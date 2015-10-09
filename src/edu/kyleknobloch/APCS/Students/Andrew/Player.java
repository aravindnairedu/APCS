package edu.kyleknobloch.APCS.Students.Andrew;
import java.util.Random;

/**
   Player class for the game of Cho-Han
*/
   
public class Player
{
   private String name;    // The player's name
   private String guess;   // The player's guess
   private int points;     // The player's points
   private int die1Value;  // The value of die #1
   private int die2Value;  // The value of die #2
   private int die3Value;  // The value of die #3
   private int die4Value;  // The value of die #4
   
   /**
      Constructor
      @param playerName The player's name.
   */
   
   public Player(String playerName)
   {
      name = playerName;
      guess = "";
      points = 0;
   }
   
   public void rollDice()
   {
      final int SIDES = 6; // Number of sides for the dice
      
      // Create the two dice. (This also rolls them.)
      Die die1 = new Die(SIDES);
      Die die2 = new Die(SIDES);
      Die die3 = new Die(SIDES);
      Die die4 = new Die(SIDES);
      
      // Record their values.
      die1Value = die1.getValue();
      die2Value = die2.getValue();
      die3Value = die3.getValue();
      die4Value = die4.getValue();
   }
   
   
   /**
      The makeGuess method causes the player to guess
      either "Cho (even)" or "Han (odd)".
   */
   
   public void makeGuess()
   {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random number, either 0 or 1.
      int guessNumber = rand.nextInt(2);
      
      // Convert the random number to a guess of
      // either "Cho (even)" or "Han (odd)".
      if (guessNumber == 0)
         guess = "High";
      else
         guess = "Low";
   }
   
   public int getChoOrHan()
   {
      // Get the sum of the dice.
      int sum = die1Value + die2Value + die3Value + die4Value;
      
      // Return the result.
      return sum;
   }

   public int getDieValue(int dieNumber)
   {
      int value = 0;
      
      switch ( dieNumber )
      {
         case 1:
               value = die1Value;
               break;
         case 2:
               value = die2Value;
               break;
         case 3:
               value = die3Value;
               break;
         case 4:
               value = die4Value;
               break;
         default:
               value = 0;
      }  
      
      return value;
   }
   
   /**
      The addPoints method adds a specified number of
      points to the player's current balance.
      @newPoints The points to add.
   */
   
   public void addPoints(int newPoints)
   {
      points += newPoints;
   }
   
   /**
      The getName method returns the player's name.
      @return The value of the name field.
   */
   
   public String getName()
   {
      return name;
   }

   /**
      The getGuess method returns the player's guess.
      @return The value of the guess field.
   */
   
   public String getGuess()
   {
      return guess;
   }

   /**
      The getPoints method returns the player's points
      @return The value of the points field.
   */
   
   public int getPoints()
   {
      return points;
   }
}