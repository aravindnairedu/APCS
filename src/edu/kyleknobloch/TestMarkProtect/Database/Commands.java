package edu.kyleknobloch.TestMarkProtect.Database;

/**
 * Commands -- static as we can't really make an object of this.
 */
public class Commands {

    /**
     * Add user to the database.
     * @param fName first name
     * @param lName last name
     * @param color wristband color
     * @param date date of test
     * @param tester tester initials
     * @return true if success else false;
     */
    public static boolean add(String fName, String lName, String color, String date, String tester) {

        String command = "";
        Connection db = new Connection();

        /**
         * build command
         */


        /**
         * submit command to database, if false something has gone wrong -- tell the call this with false.
         */
        return db.submitMySQLCommand(command);
    }


    /**
     * Search for a user via Last Name
     * @param target peron's last name
     * @return //shit
     */
    public static boolean search(String target) {

        String command = "" + target;
        Connection db = new Connection();

        /**
         * build command
         */


        /**
         * submit command to database, if false something has gone wrong -- tell the call this with false.
         */
        return db.submitMySQLCommand(command);
    }


}
