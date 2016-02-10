package edu.kyleknobloch.APCS.Classwork.Febuary.APExam;

import java.util.ArrayList;

/**
 * Created by kyleknobloch on 2/4/16,
 * For
 * *
 * Actions:
 */
public class Stats {

    public static void main(String args[]) {
        ArrayList<ScoreInfo> si = new ArrayList<>();
        si.add(new ScoreInfo(12345678));
        si.add(new ScoreInfo(44339587));
        si.add(new ScoreInfo(84827892));

        Stats stats = new Stats(si);

        System.out.println(stats.record(8420));
    }

    private ArrayList<ScoreInfo> scoreList;
        //no two indexs can contain the same score

    public Stats (ArrayList<ScoreInfo> scoreList) {
        this.scoreList = scoreList;
    }

    public boolean record(int score) {

        for (int i = 0; i < scoreList.size(); i++) {
            if (scoreList.get(i).getScore() == score) {
                scoreList.get(i).increment(); //done
                return true;
            } else if (scoreList.get(i).getScore() < score) {
                if (scoreList.get(i + 1).getScore() > score)
                    scoreList.add(i + 1, new ScoreInfo(score)); //done
                return true;
            }
        }

        return false;
    }

    public void recordScores(int[] stuScores){
        for (int i = 0; i < stuScores.length; i++){
            record(stuScores[i]);
        }

    }


}




















