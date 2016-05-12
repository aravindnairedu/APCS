package edu.kyleknobloch.TestMarkProtect.Database;


/**
 * Connection to the MySQL Database
 */
public class Connection {

    private String address;
    private String username;
    private String password;
    private String database;


    /**
     * Start the connection to the database
     */
    public Connection() {

        address = "192.168.1.89";
        username = "root";
        password = "password";
        database = "TMP_Emilision_SSYMCA";


    }


    /**
     * Submit a command to the MySQL Database
     * @param command the command for the database
     * @return true if successful else false;
     */
    public boolean submitMySQLCommand(String command) {





        return true;
    }



}
