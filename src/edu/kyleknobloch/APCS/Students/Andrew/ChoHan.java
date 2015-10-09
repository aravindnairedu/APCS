package edu.kyleknobloch.APCS.Students.Andrew;
import java.util.Scanner;

public class ChoHan
{
   public static void main(String[] args)
   {
      final int MAX_ROUNDS = 1;  // Number of rounds
      String player1Name;        // First player's name
      String player2Name;        // Second player's name
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the player's names.
      System.out.print("Enter the first player's name: ");
      player1Name = keyboard.nextLine();
      System.out.print("Enter the second player's name: ");
      player2Name = keyboard.nextLine();
      
      // Create the dealer.
      Dealer dealer = new Dealer();
      
      // Create the two players.
      Player player1 = new Player(player1Name);
      Player player2 = new Player(player2Name);
      
      // Play the rounds.
      for (int round = 0; round < MAX_ROUNDS; round++)
      {
         System.out.println("----------------------------");
         System.out.printf("Now playing round %d.\n", round + 1);
         
         // Roll the dice.
         dealer.rollDice();
         player1.rollDice();
         player2.rollDice();
         
         // The players make their guesses.
         player1.makeGuess();
         player2.makeGuess();
         
         // Determine the winner of this round.
         roundResults(dealer, player1, player2);
      }
      
      // Display the grand winner.
      displayGrandWinner(player1, player2);
   }
   
   /**
      The roundResults method determines the results of
      the current round
      @param dealer The Dealer object
      @param player1 Player #1 object
      @param player2 Player #2 object
   */
   
   public static void roundResults(Dealer dealer, Player player1, Player player2)
   {
      // Show the dice values.
      System.out.printf("The dealer rolled: ");
      for ( int i = 1; i <=4; i++)
      {
         if ( i < 4 )
            System.out.print(" " + dealer.getDieValue(i) + " ,");
         else
            System.out.print(" " + dealer.getDieValue(i) + " \n");
      }
      
      System.out.println("Result: " + dealer.getChoOrHan(0));
      
      System.out.printf("The player " + player1.getName() + " rolled: ");
      for ( int i = 1; i <=4; i++)
      {
         if ( i < 4 )
            System.out.print(" " + player1.getDieValue(i) + " ,");
         else
            System.out.print(" " + player1.getDieValue(i) + " \n");
      }
                
      System.out.printf("Result: %s\n", player1.getChoOrHan());

      System.out.printf("The player" + player2.getName() + " rolled: ");
      for ( int i = 1; i <=4; i++)
      {
         if ( i < 4 )
            System.out.print(" " + player2.getDieValue(i) + " ,");
         else
            System.out.print(" " + player2.getDieValue(i) + " \n");
      }

      System.out.printf("Result: %s\n", player2.getChoOrHan());
      
      // Check each player's guess and award points.
      checkGuess(player1, dealer);
      checkGuess(player2, dealer);
      // checkGuess(player2, dealer);
   }
   
   /**
      The checkGuess method checks a player's guess against
      the dealer's result.
      @param player The Player obbject to check.
      @param dealer The Dealer object.
   */

   public static void checkGuess(Player player, Dealer dealer)
   {
      final int POINTS_TO_ADD = 1; // Points to award winner
      String guess = player.getGuess();           // Player's guess
      int choHanResult = dealer.getChoOrHan(); // Cho or Han
      
      // Display the player's guess.
      System.out.printf("The player %s guessed %s.\n", 
                        player.getName(), player.getGuess());
      
      // Award points if the player guessed correctly.
      if (player.getChoOrHan() > dealer.getChoOrHan() && player.getGuess() == "High")
      {
         player.addPoints(POINTS_TO_ADD);
         System.out.printf("Awarding %d point(s) to %s.\n",
                           POINTS_TO_ADD, player.getName());
      } 
      else if (player.getChoOrHan() < dealer.getChoOrHan() && player.getGuess() == "Low")
      {
         player.addPoints(POINTS_TO_ADD);
         System.out.printf("Awarding %d point(s) to %s.\n",
                 POINTS_TO_ADD, player.getName());
      }
      else {
         System.out.printf("No points were added! Try again!\n");
      }

   }

   /**
      The displayGrandWinner method displays the game's grand winner.
      @param player1 Player #1
      @param player2 Player #2
   */
   
   public static void displayGrandWinner(Player player1, Player player2)
   {
      System.out.println("----------------------------");
      System.out.println("Game over. Here are the results:");
      System.out.printf("%s: %d points.\n", player1.getName(), 
                        player1.getPoints());
      System.out.printf("%s: %d points.\n", player2.getName(),
                        player2.getPoints());
      
      if (player1.getPoints() > player2.getPoints())
         System.out.println(player1.getName() + " is the grand winner!");
      else if (player2.getPoints() > player1.getPoints())
         System.out.println(player2.getName() + " is the grand winner!");
      else
         System.out.println("Both players are tied!");
   }
}