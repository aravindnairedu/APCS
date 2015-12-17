package edu.kyleknobloch.APCS.Students.Toby;
import java.util.Random;


public class Die {
		int d;
		public Die(){
			Random rn=new Random();
			d=rn.nextInt(6)+1;
			
		}
		public int getDice(){
			return d;
	
}}
