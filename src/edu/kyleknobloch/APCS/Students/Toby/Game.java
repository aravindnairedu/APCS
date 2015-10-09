package edu.kyleknobloch.APCS.Students.Toby;
import javax.swing.JOptionPane;


public class Game {
	int d1,d2,d3,d4,d5;
	int m1=0,m2=0,m3=0,m4=0,m5=0,m6=0;
	public Game(int dice1,int dice2, int dice3, int dice4, int dice5){
		d1=dice1;
		d2=dice2;
		d3=dice3;
		d4=dice4;
		d5=dice5;
			eval(d1);
			eval(d2);
			eval(d3);
			eval(d4);
			eval(d5);
			
	}
	public void eval(int d){
		
		switch(d){
		case 1:
			m1+=1;
			break;
		case 2:
			m2+=1;
			break;
		case 3:	
			m3+=1;
			break;
		case 4:
			m4+=1;
			break;
		case 5:
			m5+=1;
			break;
		case 6:
			m6+=1;
			break;
		}
		
		
	}
		public int check(){
			int Score=0;
			if(m1==4||m2==4||m3==4||m4==4||m5==4||m6==4){
				Score=30;
				JOptionPane.showMessageDialog(null,"Four of a kind!");
			}
			else if((m1==1&&m2==1&&m3==1&&m4==1&&m5==1)||(m2==1&&m3==1&&m4==1&&m5==1&&m6==1)){
				Score=40;
				JOptionPane.showMessageDialog(null,"Straight!");
			}
			else if((m1==3||m2==3||m3==3||m4==3||m5==3||m6==3)&&(m1==2||m2==2||m3==2||m4==2||m5==2||m6==2)){
				Score=35;
				JOptionPane.showMessageDialog(null,"Full House");
			}
			else if(m1==5||m2==5||m3==5||m4==5||m5==5||m6==5){
				JOptionPane.showMessageDialog(null,"YAHTEEZ");
				Score=50;
			}
			else
				JOptionPane.showMessageDialog(null,"Loser");
			return Score;
		}
}
