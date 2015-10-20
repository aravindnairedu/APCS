package edu.kyleknobloch.APCS.Classwork.October.Medical;


public class MedicalStats {

    private int activeHR;
    private int restingHR;

    /**
     * Default Constructor
     * @PRE  that aHR and rHR have been created
     * @POST Will set aHR and rHR to -1
     */
    public MedicalStats () {
        //default constructor

        setActiveHR(-1);
        setRestingHR(-1);

    }

    /**
     * Takes
     * @param int Active HR
     * @param int Resting HR
     * @POST sets the aHR and rHR in the class to whatever you took in @pram
     */
    public MedicalStats (int aHR, int rHR) {
        //constructor with 2 ints to set to aHR and rHR

        setActiveHR(aHR);
        setRestingHR(rHR);

    }


    /**
     * toString
     * @PRE  ActiveHR and RestingHR are set
     * @post returns a string that has the Active and Resting heartrates in String format.
     */
    @Override
    public String toString () {
        return "Active Heart Rate: " + getActiveHR() + "\nResting Heart Rate: " + getRestingHR();
    }

    /**
     * get methods
     *
     * @pre  none
     * @post Returns that value.
     */

    public int getActiveHR() {
        return activeHR;
    }

    public int getRestingHR() {
        return restingHR;
    }


    /**
     * set methods
     *
     * @pram an int
     * @POST sets the values in the class
     */


    public void setActiveHR(int activeHR) {
        this.activeHR = activeHR;
    }

    public void setRestingHR(int restingHR) {
        this.restingHR = restingHR;
    }

}
