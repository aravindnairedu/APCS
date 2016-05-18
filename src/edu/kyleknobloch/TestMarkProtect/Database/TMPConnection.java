package edu.kyleknobloch.TestMarkProtect.Database;

import java.sql.*;
import java.util.Date;


/**
 * Connection to the MySQL Database
 */
public class TMPConnection {

    private String address;
    private String username;
    private String password;
    private String database;


    private Connection connect;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;


    /**
     * Start the connection to the database
     * @throws Exception
     */
    public TMPConnection() throws Exception {

        address = "192.168.1.89";
        username = "root";
        password = "password";
        database = "TMP_Emilision_SSYMCA";

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?user=sqluser&password=sqluserpw");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from feedback.comments");
            writeResultSet(resultSet);

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect.prepareStatement("insert into  feedback.comments values (default, ?, ?, ?, ? , ?, ?)");
            // "myuser, webpage, datum, summery, COMMENTS from feedback.comments");
            // Parameters start with 1
            preparedStatement.setString(1, "Test");
            preparedStatement.setString(2, "TestEmail");
            preparedStatement.setString(3, "TestWebpage");
            //preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11)); //yr, mo, day
            preparedStatement.setString(5, "TestSummary");
            preparedStatement.setString(6, "TestComment");
            preparedStatement.executeUpdate();

            preparedStatement = connect.prepareStatement("SELECT myuser, webpage, datum, summery, COMMENTS from feedback.comments");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);

            // Remove again the insert comment
            preparedStatement = connect.prepareStatement("delete from feedback.comments where myuser= ? ; ");
            preparedStatement.setString(1, "Test");
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("select * from feedback.comments");
            writeMetaData(resultSet);

        } catch (Exception e) {
            System.out.println(e);
            //throw e;
        } finally {
            close();
        }


    }


    /**
     * Submit a command to the MySQL Database
     * @param command the command for the database
     * @return true if successful else false;
     */
    public boolean submitMySQLCommand(String command) {





        return true;
    }


    /**
     *
     * @param resultSet
     * @throws SQLException
     */
    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //   Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }


    /**
     *
     * @param resultSet
     * @throws SQLException
     */
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String user = resultSet.getString("myuser");
            String website = resultSet.getString("webpage");
            String summery = resultSet.getString("summery");
            Date date = resultSet.getDate("datum");
            String comment = resultSet.getString("comments");
            System.out.println("User: " + user);
            System.out.println("Website: " + website);
            System.out.println("Summery: " + summery);
            System.out.println("Date: " + date);
            System.out.println("Comment: " + comment);
        }
    }


    /**
     * Close the connection
     */
    private void close() {
        try {
            if (resultSet != null)
                resultSet.close();

            if (statement != null)
                statement.close();

            if (connect != null)
                connect.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
