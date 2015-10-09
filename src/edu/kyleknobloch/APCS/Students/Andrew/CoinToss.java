/*
* Author: Andrew Brook 
* Class: AP Computer Science P5
* Teacher: Mr. Drugan
* Date: October 6, 2015 
*/


import java.util.Random;
import javax.swing.*;

public class CoinToss 
{
   public String result;
   public String sideUp;
   
   
   public CoinToss() 
   {
      toss();
      JOptionPane.showMessageDialog(null,"The coin landed on..." + getSideUp() +"!");
   }

    private void toss() 
    {
        Random rand = new Random();
        int result =  rand.nextInt(2) + 1;

        switch (result) 
        {
            case 1:
                sideUp = "Heads";
                break;
            case 2:
                sideUp = "Tails";
                break;
            default:
                sideUp = "It landed on it's side!";
                break;
        }
    }

//Getters
    public String getResult() 
    {
        return result;
    }
    
    public String getSideUp()
    {
      return sideUp;
    }

} //end class