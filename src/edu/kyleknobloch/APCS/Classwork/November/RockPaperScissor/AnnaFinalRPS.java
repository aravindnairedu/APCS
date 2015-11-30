package edu.kyleknobloch.APCS.Classwork.November.RockPaperScissor;

import java.util.Scanner;


/**
 * Anna Brown's Fianl Rock Paper Sizor extra credit project.
 */

public class AnnaFinalRPS
{
	public static void main(String[] args) 
	{
		int initial = (int) (Math.random()*3);
		int rounds;
		String input, ai = "";
		Scanner get = new Scanner(System.in);
		
		System.out.print("How many rounds would you like to play? (2 or more) ");
		rounds = get.nextInt();
		if (rounds <2)
			rounds = 2+rounds;
		input = getPlay();
		ai = round1(input, initial);
		
		for (int i=0; i<(rounds-1); i++)
		{
			input = getPlay();
			ai = eval(input, ai);
		}
		System.out.println("\nThanks for playing!");
	}
	
	public static String getPlay()
	{
		String play;
		Scanner get = new Scanner (System.in);
		System.out.print("Enter R, P, or S: ");
		play = get.nextLine().toUpperCase();
		
		return play;
	}
	
	public static String eval(String input, String ai)
	{
		if (input.equals("R") || input.equals("P") || input.equals("S"))
		{
			if (ai.equals("R"))
			{
				System.out.println("Computer has chosen R...");
				
				if (input.equals(ai)) // user: R , computer: R
				{
					System.out.println("And the result is a DRAW! Luck be with you in the rounds to come.");
					return "S";
				}
				else if (input.compareTo(ai)>0) // user: S , computer: R
				{	
					System.out.println("You have been bested! Your loss will not be forgotten.");
					return "P";
				}
				else if (input.compareTo(ai)<0) // user: P , computer: R
				{	
					System.out.println("The foe has been defeated! May your luck continue in your favor.");
					return "S";
				}
				else
				{
					System.exit(0);
					return "";
				}
			}
			else if (ai.equals("P"))
			{
				System.out.println("Computer has chosen P...");
				
				if (input.equals(ai))  // user P , computer P
				{
					System.out.println("And the result is a DRAW! Luck be with you in the rounds to come.");	
					return "R";
				}
				else if (input.compareTo(ai)==2)  // user R , computer P
				{	
					System.out.println("You have been bested! Your loss will not be forgotten.");
					return "S";
				}
				else if (input.compareTo(ai)==3)  // user S , computer P
				{	
					System.out.println("The foe has been defeated! May your luck continue in your favor.");
					return "R";
				}
				else
				{
					System.exit(0);
					return "";
				}
			}
			else if (ai.equals("S"))
			{
				System.out.println("Computer has chosen S...");
				
				if (input.equals(ai)) // user S , computer S
				{
					System.out.println("And the result is a DRAW! Luck be with you in the rounds to come.");
					return "P";
				}
				else if (input.compareTo(ai)==-3) // user P , computer S
				{	
					System.out.println("You have been bested! Your loss will not be forgotten.");
					return "R";
				}
				else if (input.compareTo(ai)==-1)   // user R , computer S
				{	
					System.out.println("The foe has been defeated! May your luck continue in your favor.");
					return "P";
				}
				else
				{
					System.exit(0);
					return "";
				}
			}
			else
			{
				System.out.println("ERROR: aiInt invalid");
				System.exit(0);
				return "";
			}
		}
		else if (input.equals("EXIT") || input.equals("QUIT"))
		{
			System.out.println("Thanks for playing!");
			System.exit(0);
			return "";
		}
		else
		{
			System.out.println("Stop being silly and play the game.");
			System.exit(0);
			return "";
		}	
	}
	
	public static String round1(String input, int aiInt)
	{
		if (input.equals("R") || input.equals("P") || input.equals("S"))
		{
			if (aiInt==0)
			{
				System.out.println("Computer has chosen R...");
				String computerPlay="R";
				
				if (input.equals(computerPlay)) // user: R , computer: R
				{
					System.out.println("And the result is a DRAW! Luck be with you in the rounds to come.");
					return "S";
				}
				else if (input.compareTo(computerPlay)>0) // user: S , computer: R
				{	
					System.out.println("You have been bested! Your loss will not be forgotten.");
					return "P";
				}
				else if (input.compareTo(computerPlay)<0) // user: P , computer: R
				{	
					System.out.println("The foe has been defeated! May your luck continue in your favor.");
					return "S";
				}
				else
				{
					System.exit(0);
					return "";
				}
			}
			else if (aiInt==1)
			{
				System.out.println("Computer has chosen P...");
				String computerPlay="P";
				
				if (input.equals(computerPlay))  // user P , computer P
				{
					System.out.println("And the result is a DRAW! Luck be with you in the rounds to come.");	
					return "R";
				}
				else if (input.compareTo(computerPlay)==2)  // user R , computer P
				{	
					System.out.println("You have been bested! Your loss will not be forgotten.");
					return "S";
				}
				else if (input.compareTo(computerPlay)==3)  // user S , computer P
				{	
					System.out.println("The foe has been defeated! May your luck continue in your favor.");
					return "R";
				}
				else
				{
					System.exit(0);
					return "";
				}
			}
			else if (aiInt==2)
			{
				System.out.println("Computer has chosen S...");
				String computerPlay="S";
				
				if (input.equals(computerPlay)) // user S , computer S
				{
					System.out.println("And the result is a DRAW! Luck be with you in the rounds to come.");
					return "P";
				}
				else if (input.compareTo(computerPlay)==-3) // user P , computer S
				{	
					System.out.println("You have been bested! Your loss will not be forgotten.");
					return "R";
				}
				else if (input.compareTo(computerPlay)==-1)   // user R , computer S
				{	
					System.out.println("The foe has been defeated! May your luck continue in your favor.");
					return "P";
				}
				else
				{
					System.exit(0);
					return "";
				}
			}
			else
			{
				System.out.println("ERROR: aiInt invalid");
				System.exit(0);
				return "";
			}
		}
		else if (input.equals("EXIT") || input.equals("QUIT"))
		{
			System.out.println("Thanks for playing!");
			System.exit(0);
			return "";
		}
		else
		{
			System.out.println("Stop being silly and play the game.");
			System.exit(0);
			return "";
		}	
	}
}
