package edu.kyleknobloch.APCS.Classwork.October.ChoHan;
import java.util.Random;

/**
   The ChoHanDie class simulates a six-sided die.
*/

public class ChoHanDie
{
   private int sides;   // Number of sides
   private int value;   // The die's value


   /**
      The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   
   public ChoHanDie(int numSides) {
      sides = numSides;
      roll();
   }
   
   /**
      The roll method simlates the rolling of
      the die.
   */
   
   public void roll() {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1;
   }

   /**
    * Get methods
    */
   
   public int getSides() {
       return sides;
   }

   public int getValue() {

      return value;
   }

}