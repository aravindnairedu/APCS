package edu.kyleknobloch.APCS.Students.Andrew;
/**
   Dealer class for the game of Cho-Han
*/
   
public class Dealer
{
   private int die1Value;  // The value of die #1
   private int die2Value;  // The value of die #2
   private int die3Value;  // The value of die #3
   private int die4Value;  // The value of die #4 


  
   
   /**
      Constructor
   */
   
   public Dealer()
   {
      die1Value = 0;
      die2Value = 0;
      die3Value = 0;
      die4Value = 0;
   }
   
   
   /**
      The rollDice method rolls the dice and saves
      their values.
   */
   
   
   /**
      The getChoOrHan method returns the result of
      the dice roll, Cho or Han.
      @return Either "Cho (even)" or "Han (odd)"
   */
   public int getChoOrHan()
   {
      // Return the sum of the dice values that the Dealer rolled.
      return die1Value + die2Value + die3Value + die4Value;
   }
   
   public int getChoOrHan(int s)
   {
      String result; // To hold the result
      
      // Get the sum of the dice.
      int sum = die1Value + die2Value + die3Value + die4Value;
      
      // Return the result.
      return sum;
   }
   
   /**
      The getDie1Value method returns the value of
      die #1.
      @return The die1Value field
   */
   
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

}