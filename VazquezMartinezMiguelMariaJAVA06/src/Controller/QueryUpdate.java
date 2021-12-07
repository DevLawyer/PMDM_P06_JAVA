/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import Errors.ErrorsSaveLogs;
import Model.Issue;
import Model.Lawyer;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class QueryUpdate {
    private static Statement stmt;
    private static PreparedStatement pstmt;
    private static ResultSet rset = null;
    
    public static void updateLawyer(Connection conn, Lawyer user){
        try {
            String query = "SELECT lawyer_nif, photo, entry_date FROM lawyer WHERE lawyer.cod_lawyer = "+user.getCodLawyer();
            stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            rset = stmt.executeQuery(query);
            while(rset.next()){
                rset.updateString(1, user.getLawyerNIF());
                rset.updateString(2, user.getLawyerPhoto());
                rset.updateDate(3, new java.sql.Date(user.getLawyerEntryDate().getTimeInMillis())); 
                rset.updateRow();
            }
            rset.close();
            stmt.close();
        } catch (SQLException ex) {
            ErrorsSaveLogs.saveLogError(ex.getMessage());
        }
    }
    
    public static void insertIssue(Connection conn, Issue issue){
        String query = "INSERT INTO issue VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            System.out.println(issue);
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, issue.getCodIssue());
            pstmt.setString(2, issue.getIssueDescription());
            pstmt.setDate(3, new java.sql.Date(issue.getEntryDate().getTimeInMillis()));
            if(issue.getEndDate() == null){
                pstmt.setDate(4, null);
            } else {
                pstmt.setDate(4, new java.sql.Date(issue.getEndDate().getTimeInMillis()));
            }
            pstmt.setInt(5, issue.getNumHours());
            pstmt.setInt(6, issue.getCodClient());
            pstmt.setInt(7, issue.getCodEntity());
            pstmt.setFloat(8, issue.getCost());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException ex) {
            ErrorsSaveLogs.saveLogError(ex.getMessage());
        }

    }
}
