package edu.kyleknobloch.APCS.Classwork.October;

import java.util.ArrayList;

/**
 * Chapter 4
 * Excersie 12
 *
 * EXTRA CREDIT
 *
 *
 * Write A program that asks the user to enter today's sales for five stores. The program should display a bar chart
 * comparing each store's sales. Create each bar in the bar chart by displaying a row of asterisks. Each asterisk
 * should represent $100 of sales.
 *
 */

public class Chap4Ex12 {


    //store[0] is -1 because we do not use it.
    private ArrayList<Double> store = new ArrayList<>();

    //saleStore[0] is -1 because we don't use it.
    private ArrayList<Integer> saleStore = new ArrayList<>();


    /**
     * I am a default constructor. I do nothing.
     */
    public Chap4Ex12 () {
/*        _
         / \
        |_|_|
        |_|_|
*/
    }

    /**
     * Takes in all the store's sales and sets them.
     *
     * @param s1 Store 1's sales
     * @param s2 Store 2's sales
     * @param s3 Store 3's sales
     * @param s4 Store 4's sales
     * @param s5 Store 5's sales
     */
    public Chap4Ex12 (double s1, double s2, double s3, double s4, double s5) {
        store.add(0, -1.0);
        store.add(1, s1);
        store.add(2, s2);
        store.add(3, s3);
        store.add(4, s4);
        store.add(5, s5);

    }

    /**
     * Takes in all the store's sales and sets them.
     *
     * @param s1 Store 1's sales
     * @param s2 Store 2's sales
     * @param s3 Store 3's sales
     * @param s4 Store 4's sales
     * @param s5 Store 5's sales
     */
    public void setStores(double s1, double s2, double s3, double s4, double s5) {
        store.add(0, -1.0);
        store.add(1, s1);
        store.add(2, s2);
        store.add(3, s3);
        store.add(4, s4);
        store.add(5, s5);

    }

    /**
     * Calculate the numbers for the BarChart
     * @pre that the store sales have been set
     * @post the sales will be set
     */
    private void calcBarCharStats () {

        double theDouble;

        saleStore.add(0, -1); //we don't use index 0.

        for (int i = 1; i <= 5; i++) {
            theDouble = store.get(i) / 100;
            saleStore.add(i, (int) theDouble);
        }

    }

    /**
     * Returns the Bar Chart for the stores.
     * @return the bar chart
     */
    public String barChart () {
        calcBarCharStats(); //have to make the calculations

        String message = "";

        for (int i = 1; i <= 5; i++) {

            message = message + "Store " + i + ": ";


            if (saleStore.get(i) <= 0) {
                message = message + " Less than 100 sales. \n";

            } else {
                for (int j = 1; j <= saleStore.get(i); j++) {
                    message = message + "*";
                }
                message = message + "   - " + saleStore.get(i) + " sales\n";

            }
        }

        return message;
    }

    /**
     * @return barChart()
     */
    @Override
    public String toString() {
        return barChart();
    }


}
