package edu.kyleknobloch.APCS.Classwork.Febuary.APExam;

/**
 * Created by kyleknobloch on 2/4/16,
 * For
 * *
 * Actions:
 */
public class TempGrid {

    private double[][] temp;

    public TempGrid (double[][] temp) {
        this.temp = temp;
    }

    public double computeTemp(int row, int col) {

        if ((row == 0 || row == temp.length - 1) || (col == 0 || col == temp.length - 1)) {
            return temp[row][col];
        }
        else {
            return (temp[row - 1][col - 1] + temp[row][col - 1] + temp[row + 1][col] + temp[row][col + 1]) / 4.0;
        }
    }

    public boolean updateAllTemps(double tolerance) {
        double[][] newTemp;
        boolean isTolerence = true;


        /*for (int row = 0; row < temp.length; row++) {
            for (int col = 0; col < temp[row].length; col++) {
                newTemp[row][col] = computeTemp(row, col); //elements unchanged
                if (Math.abs(temp[row][col] - newTemp[row][col]) >= tolerance) {
                    isTolerence = false;
                }
            }
        }
        */
        newTemp =  temp;
        return true;
    }
}
