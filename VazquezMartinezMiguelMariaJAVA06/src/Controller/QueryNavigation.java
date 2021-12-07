/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import Model.Client;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class QueryNavigation {
    /**
     * This class is used for read one by one the rows of the query which passed
     * as a paremeter.
     */
    
    private static PreparedStatement pstmt = null;
    private static ResultSet rset = null;
        
    public static void startNavigation(Connection conn, int cod_lawyer){
        /**
         * This method create a statement to read one by one all the rows 
         * of the result of the query.
         */
        try {
            String query = "SELECT * FROM client WHERE cod_lawyer = ? ORDER BY cod_client";
            pstmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                        ResultSet.CONCUR_READ_ONLY);
            pstmt.setInt(1, cod_lawyer);
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void executeQuery(){
        /**
         * This method send a query receive as a parameter.
         * 
         * @param query which send in other part of the application.
         */
        try {
            
            rset = pstmt.executeQuery();
            if(rset.next()){
                rset.beforeFirst();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void moveForward(){
        /**
         * This method move the resultset to the next position in the cursor.
         */
        try {
            rset.next();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void goBack(){
        /**
         * This method move the resultset to the previous position in the cursor.
         */
        try {
            rset.previous();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void goFirst(){
        /**
         * This method move the resultset to the first position in the cursor.
         */
        try {
            rset.first();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void goLast(){
        /**
         * This method move the resultset to the last position in the cursor.
         */
        try {
            rset.last();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static Client getCurrent(){
        /**
         * This method return the current resultset packed as
         * client object.
         */
        Client client = new Client();
        if(rset != null){
            try{
                client = new Client( rset.getInt(1),
                                    rset.getString(2),
                                    rset.getString(3),
                                    rset.getString(4),
                                    rset.getString(5),
                                    rset.getString(6),
                                    rset.getString(7));
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }  
        }  
        
        return client;            
    } 
    
    public static boolean isFirst(){
        /**
         * This method return true or false if the resultset is in the first position
         * of the cursor.
         * 
         * @return first boolean variable. True if the resultset is in the first position.
         */
        boolean first = false;
        
        try {
            first = rset.isFirst();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return first;
    }
    
    public static boolean isLast(){
        /**
         * This method return true or false if the resultset is in the last position
         * of the cursor.
         * 
         * @return first boolean variable. True if the resultset is in the last position.
         */
        boolean last = false;
        
        try {
            last = rset.isLast();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return last;
    }

    public static void close(){
        /**
         * This method close resultset and statement with the data base.
         */
        try {
            pstmt.close();
            rset.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryNavigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
