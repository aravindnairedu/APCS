package edu.kyleknobloch.APCS.Classwork.January.TestScores;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by kyleknobloch on 1/8/16,
 * For
 * *
 * Actions:
 */
public class TestScoresTester {

    public static void main (String args[]) {

        ArrayList<Integer> ts1 = new ArrayList<>();

        ts1.add(32);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(45);
        ts1.add(70);
        ts1.add(50);
        ts1.add(1);
        ts1.add(-3000000);
        ts1.add(1000);
        ts1.add(100);
        ts1.add(88);
        ts1.add(99);
        ts1.add(75);
        ts1.add(90);
        ts1.add(45);
        ts1.add(100);
        ts1.add(3234);
        ts1.add(34);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);
        ts1.add(100);

        TestScores ts = new TestScores(ts1);

        JOptionPane.showMessageDialog(null, "Avg score is " + ts.calcAvg());
    }


}
