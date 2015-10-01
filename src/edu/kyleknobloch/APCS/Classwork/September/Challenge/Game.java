package edu.kyleknobloch.APCS.Classwork.September.Challenge;
import javax.swing.*;


public class Game {

    private int score;
    private int count1, count2, count3, count4, count5, count6;
    private boolean usedChance = false;

    public Game() {

        int dice1, dice2, dice3, dice4, dice5, sum, turnsLeft;
        int turn = 0;
        boolean scored = false;
        String message = "";
        JOptionPane JO = new JOptionPane();


        do {
            //Calculate dice information & run evaluations
            dice1 = Die.roll();
            dice2 = Die.roll();
            dice3 = Die.roll();
            dice4 = Die.roll();
            dice5 = Die.roll();
            sum  = dice1 + dice2 + dice3 + dice4 + dice5;
            eval(dice1);
            eval(dice2);
            eval(dice3);
            eval(dice4);
            eval(dice5);


            //JO.showMessageDialog(null, "Your dice are: \n" + dice1 + "\n" + dice2 + "\n" + dice3 + "\n" + dice4 + "\n" + dice5 + "\n\nCalculating your score for this turn now!");
            

            //Check for a straight
            if((count1 == 1 && count2 == 1 && count3 == 1 && count4 == 1 && count5 == 1)||(count2 == 1 && count3 == 1 && count4 == 1 && count5 == 1 && count6 == 1)){
                addScore(40);
                message = "You got a straight! Add 40 points.";
                scored = true;
            }
            
            //Check for Full house
            if((count1 == 3 || count2 == 3 || count3 == 3 || count4 == 3 || count5 == 3 || count6 == 3 ) && (count1 == 2 || count2 == 2 || count3 == 2 || count4 == 2 || count5 == 2 || count6 == 2)){
                addScore(35);
                message = "You got a Full house! Add 35 points ";
                scored = true;
            }
            
            //Check for YAHTEEZ!
            if(count1 == 5 || count2 == 5 || count3 == 5 || count4 == 5 || count5 == 5 || count6 == 5){
                message = "YAHTEEZ!!!!!!!!!";
                addScore(50);
                scored = true;
            }

            
            //Check for 4 of a kind
            if(count1 == 4 || count2 == 4 || count3 == 4 || count4 == 4 || count5 == 4 || count6 == 4){
                addScore(30);
                message = "You got 4 of a kind!";
                scored = true;
            }

            //Run some calculations and background items that need to be ran before we display the final message.
            //turn++;
            turnsLeft = 5 - turn;

            //Calculate chance and apply only if you did not get anything else.
            //Also this now displays the final message before the next roll.
            if (scored) {
                JO.showMessageDialog(null, "Your dice are: \n" + dice1 + "\n" + dice2 + "\n" + dice3 + "\n" + dice4 + "\n" + dice5 + "\n\n" + message + "\n\nYour score is currently " + getScore() + ". \nYou now have " + turnsLeft + " turns left.");
            }

            if (!scored && !usedChance){
                message = "The total of the dice was " + sum + "." + "\nWould you like to use your chance?";
                int use = JO.showConfirmDialog(null, "Your dice are: \n" + dice1 + "\n" + dice2 + "\n" + dice3 + "\n" + dice4 + "\n" + dice5 + "\n\nYour score is currently " + getScore() + ". \nYou now have " + turnsLeft + " turns left."  + "\n\n" + message);
                if (use == 0) {
                    message = "Chance, we summed up the dice for you and added it to your score. It was " + sum + ".";
                    addScore(sum);
                    usedChance = true;
                }
            }

            if (usedChance && !scored) {
                message = "You've already used your chance. Better luck next roll!";
                JO.showMessageDialog(null, "Your dice are: \n" + dice1 + "\n" + dice2 + "\n" + dice3 + "\n" + dice4 + "\n" + dice5 + "\n\n" + message + "\n\nYour score is currently " + getScore() + ". \nYou now have " + turnsLeft + " turns left.");
            }

            //this had to be run at the end
            scored = false; //reset the fact that there was a score added.

            //reset the count
            count1 = count2 = count3 = count4 = count5 = count6 = 0;

        } while (true); //only 5 turns.

        //JO.showMessageDialog(null, "This round has ended! Your final score was " + getScore() + "! Hope to see you again.");
    }

    public void eval(int dice) {
        switch (dice) {
            case 1:
                count1++;
                break;
            case 2:
                count2++;
                break;
            case 3:
                count3++;
                break;
            case 4:
                count4++;
                break;
            case 5:
                count5++;
                break;
            case 6:
                count6++;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Something went wrong!");
                break;
        }
    }

    /**
     * Get methods
     */

    public int getScore() {
        return score;
    }

    /**
     * Add methods
     */

    public void addScore(int addition) {
        score = score + addition;
    }
}
