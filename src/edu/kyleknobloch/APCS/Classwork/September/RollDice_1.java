package edu.kyleknobloch.APCS.Classwork.September;
import java.util.Scanner;
import java.util.Random;

/**
   This program simulates the rolling of dice.
*/

public class RollDice_1
{
   public static void main(String[] args)
   {
      String again = "y";  // To control the loop
      int die1;            // To hold the value of die #1
      int die2;            // to hold the value of die #2
      int roll1, roll2, roll3, roll4, roll5, roll6;

      roll1 = roll2 = roll3 = roll4 = roll5 = roll6 = 0;
      
      
      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object to generate random numbers.
      Random rand = new Random();
      
      // Simulate rolling the dice.
      for ( int i = 0; i < 100000000; i++)
      {
      //while (again.equalsIgnoreCase("y"))
      //{
         //System.out.println("Rolling the dice...");
         die1 = rand.nextInt(6) + 1;
	if ( die1 == 1 )
		roll1++;
	else if (die1 == 2 )
		roll2++;
	else if (die1 == 3 )
		roll3++;
	else if (die1 == 4 )
		roll4++;
	else if (die1 == 5 )	
		roll5++;
	else if (die1 == 6 )
		roll6++;
         //die2 = rand.nextInt(6) + 1;
         //System.out.println("Their values are:");
         //System.out.println(die1 + " " + die2);
         
         //System.out.print("Roll them again (y = yes)? ");
         //again = keyboard.nextLine();
      //}
     }
	System.out.println("Values are: " + roll1 + " " + roll2 + " " +
			    roll3 + " " + roll4 + " " + roll5 + " " + roll6);
   }
}