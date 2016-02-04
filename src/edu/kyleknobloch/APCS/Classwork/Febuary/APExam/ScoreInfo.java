package edu.kyleknobloch.APCS.Classwork.Febuary.APExam;

/**
 * Created by kyleknobloch on 2/4/16,
 * For
 * *
 * Actions:
 */
public class ScoreInfo {

    private int score;
    private int numStudents;

    public ScoreInfo(int aScore) {
        score = aScore;
        numStudents = 1;
    }

    public void increment() {
        numStudents++;
    }

    public int getScore() {
        return score;
    }

    public int getFrequencey() {
        return numStudents;
    }

}
