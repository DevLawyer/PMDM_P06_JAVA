/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import Errors.*;
import java.sql.*;

public class AccessDB {
    
    private static Connection conn;

    public static Connection getConnection(){
        /**
         * This method create the connection with the data base passed as parameter
         * the url of local data base host, the user and the password.
         */
        try {
            String url = "jdbc:derby://localhost:1527/LawOffice";
            Class.forName("org.apache.derby.jdbc.ClientDriver");	
            conn = DriverManager.getConnection(url,"superAdmin","superAdmin");
        } catch (ClassNotFoundException ex) {
            ErrorsSaveLogs.saveLogError(ex.getMessage());
        } catch (SQLException ex) { 
            ErrorsSaveLogs.saveLogError(ex.getMessage());
        }
        return conn;
    } 
    
    public static void closeConnection(Connection conn) throws SQLException {
        /**
         * This method close the Connection with the DB.
         */
        if(conn != null){
            conn.close();
        }
    } 
}
