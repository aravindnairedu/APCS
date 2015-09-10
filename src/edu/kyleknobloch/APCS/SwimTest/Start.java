package edu.kyleknobloch.APCS.SwimTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by kyleknobloch on 9/8/15,
 * For The Y @ Aquatics
 **
 * Actions:
 * N/a
 *
 *
 $mysql_host = "mysql6.000webhost.com";
 $mysql_database = "a7604661_Emil";
 $mysql_user = "a7604661_emil";
 $mysql_password = "12345Dog";
 */


public class Start {
    public static void main(String args[]) {

        Connection con = null;
        Statement  st  = null;
        ResultSet  rs  = null;

        String url      = "jdbc:mysql://mysql6.000webhost.com:3306/a7604661_Emil";
        String user     = "a7604661_emil";
        String password = "12345Dog";

        try {
            con = DriverManager.getConnection(url, user, password);
            st  = con.createStatement();
            rs  = st.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }


    }
}
