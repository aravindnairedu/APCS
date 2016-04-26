package edu.kyleknobloch.APCS.Students.Andrew.FiveCARDSTUD;

/*Hi Mr Drugan, I apologize for the lack of anything going on in this code, but I was just genuinely confused by the challenge
I was hoping that I could possibly stay after sometime this week to do this with you, as I'm struggling a lot
Let me know if and when you are available
*/

import java.util.ArrayList;
public class FiveCardStud
{
   private ArrayList<Card> hand1 = new ArrayList<>();
   private ArrayList<Card> hand2 = new ArrayList<>();

   public FiveCardStud()
   {
      String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
      String[] ranks = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
      int[] values = {13,12,11,10,9,8,7,6,5,4,3,2,1};


      Deck deck = new Deck(ranks, suits, values);
      deck.shuffle();

      
      for (int i = 0; i < 5; i++)
      {
         hand1.add(deck.deal());
         hand2.add(deck.deal());
      }
      
      System.out.println("Hand 1:");
      for (int i = 0; i < hand1.size(); i++)
      {
         System.out.print("\n\t" + hand1.get(i).toString() + " ");
      }
            
      System.out.println("\nHand 2:");
      for (int i = 0; i < hand2.size(); i++)
      {
         System.out.print("\n\t" + hand2.get(i).toString() + " ");
      }     
      
      
      boolean hand1Pair = false;
      boolean hand2Pair = false;
      
      for (int i = 0; i < hand1.size()-1; i++)
      {
         if (hand1.get(i).pointValue() == hand1.get(i+1).pointValue())
         {
            hand1Pair = true;
         }
      } 
      
      for (int i = 0; i < hand2.size()-1; i++)
      {
         if (hand2.get(i).pointValue() == hand2.get(i+1).pointValue())
         {
            hand2Pair = true;
         }
      } 
      
      
      if (hand1Pair)
      {
         System.out.println("\nHand 1 has A pair!");
      }
      else 
      {
         System.out.println("\nHand 1 has NO pair!");
      }
      
      
      if (hand2Pair)
      {
         System.out.println("\nHand 2 has A pair!");
      }
      else 
      {
         System.out.println("\nHand 2 has NO pair!");
      }
    
   } //end constructor


} //end class