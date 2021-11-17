/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import java.sql.*;

public class AccessDB {
    
    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        /**
         * This method create the connection with the data base passed as parameter
         * the url of local data base host, the user and the password.
         */
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/Empresa";
            conn = DriverManager.getConnection(url,"empleado","empleado");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        
        return conn;
    } 
    
    public static void closeConnection() {
        /**
         * This method close the Connection with the DB.
         */
        try {
            conn.close();
        } catch (Exception ignored) {
        
        }
    } 
}
