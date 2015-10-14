package edu.kyleknobloch.APCS.Classwork.October.Medical;

/**
 * Created by kyleknobloch on 10/14/15,
 * For
 * *
 * Actions:
 */
public class MedicalStats {

    private int activeHR;
    private int restingHR;


    public MedicalStats () {
        //default constructor

        setActiveHR(-1);
        setRestingHR(-1);

    }

    public MedicalStats (int aHR, int rHR) {
        //constructor with 2 ints to set to aHR and rHR

        setActiveHR(aHR);
        setRestingHR(rHR);

    }


    /**
     * toString
     */
    public String toString () {
        return "Active Heart Rate: " + getActiveHR() + "\nResting Heart Rate: " + getRestingHR();
    }

    /**
     * get methods
     */

    public int getActiveHR() {
        return activeHR;
    }

    public int getRestingHR() {
        return restingHR;
    }


    /**
     * set methods
     */

    public void setActiveHR(int activeHR) {
        this.activeHR = activeHR;
    }

    public void setRestingHR(int restingHR) {
        this.restingHR = restingHR;
    }

}
