package edu.kyleknobloch.APCS.Classwork.January.TestScores;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 */
public class TestScores {

    private ArrayList<Integer> testScores;
    private int sizeOfArrayListWithOutBadData = 0;


    public TestScores (ArrayList<Integer> testScores) {
        this.testScores = testScores;
        sizeOfArrayListWithOutBadData = testScores.size();
    }


    public int calcAvg() {
        int avg;
        int addedScores = 0;
        int sizeOfArray = testScores.size();
        boolean showMessage = false;
        //System.out.println(sizeOfArray); //DEBUG

        //if -
        //if >100
            //throw IllegalArgumentException
            //catch by skipping that array element and moving on to the next one


        for (int i = 0; i < sizeOfArray; i++){

            try {
                if (testScores.get(i) < 0 || testScores.get(i) > 100){
                    throw new IllegalArgumentException();
                } else {
                    addedScores = addedScores + testScores.get(i);
                }
            }
            catch (IllegalArgumentException e){
                //skip this element
                if (!showMessage) {
                    JOptionPane.showMessageDialog(null, "Looks like there was some bad data!\nIf there was a negative or a score\ngreater than 100 it will be skipped.");
                    showMessage = true;
                }
                System.out.println("Skipped data (" + i +"): " + testScores.get(i));
                sizeOfArrayListWithOutBadData--;
            }

        }

        //get the avg.
        avg = addedScores / sizeOfArrayListWithOutBadData;


        return avg;
    }


}
