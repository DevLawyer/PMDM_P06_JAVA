/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QueryUserAccess {
    private static PreparedStatement pstmt;
    private static ResultSet rset;
    
    public static boolean getAccess(Connection conn, String user, String password){
        //By default the access is false to prevent an unauthorised access.
        boolean access = false; 
        int rows = 0;
        try {
            String query = "SELECT * FROM lawyer WHERE user_name = ? AND user_password = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            rset = pstmt.executeQuery();
            
            //At first, this while loop count the number of rows that contains the previous resultSet.
            while(rset.next()){
                rows++;
            }
            
            //If the rows count is equals one meaning that que query has returned one and only one correct row.
            if(rows == 1){
                access = true;
            }
            
            pstmt.close();
            rset.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryUserAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return access;
    }
}
