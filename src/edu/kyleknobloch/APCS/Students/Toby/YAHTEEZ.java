package edu.kyleknobloch.APCS.Students.Toby;

import javax.swing.*;
public class YAHTEEZ {

	public static void main(String[] args) {
		int Score=0;
		String again;
		JOptionPane.showMessageDialog(null,"Yo");
		JOptionPane.showMessageDialog(null,"You gonna be playin Yahteez");
		JOptionPane.showMessageDialog(null,"Four of a kind is 30 points\nA straight is 40 points\nA full house is 35 points\nYou get the sum of all dice as points\nYAHTEEZ is 50 points");
		do{
		
		Die die1=new Die();
		Die die2=new Die();
		Die die3=new Die();
		Die die4=new Die();
		Die die5=new Die();
		JOptionPane.showMessageDialog(null,"You roll the dice.");
		JOptionPane.showMessageDialog(null,"You got "+die1.getDice()+","+die2.getDice()+","+die3.getDice()+","+die4.getDice()+","+die5.getDice());
		Game g=new Game(die1.getDice(),die2.getDice(),die3.getDice(),die4.getDice(),die5.getDice());
		Score+=g.check();
		JOptionPane.showMessageDialog(null,"Your score is "+Score+"!");
		again=JOptionPane.showInputDialog("Again? Y/N");
	}while((again.equalsIgnoreCase("yes"))||((again.equalsIgnoreCase("y"))));
		
	}

}
