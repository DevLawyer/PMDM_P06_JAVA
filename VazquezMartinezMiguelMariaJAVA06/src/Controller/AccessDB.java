/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import java.sql.*;


public class AccessDB {
    
    private static Connection conn;

    public static Connection getConnection() {
        /**
         * This method create the connection with the data base passed as parameter
         * the url of local data base host, the user and the password.
         */
        try {
            String url = "jdbc:derby://localhost:1527/LawOffice";
            Class.forName("org.apache.derby.jdbc.ClientDriver");	
            conn = DriverManager.getConnection(url,"superAdmin","superAdmin");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException ex) { 
            System.out.println("Error al conectar con la base de datos.");
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
