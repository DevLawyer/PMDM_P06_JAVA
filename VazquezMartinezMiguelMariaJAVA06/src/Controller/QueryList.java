/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Controller;

import Model.Issue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryList {

    private static PreparedStatement pstmt;
    private static ResultSet rset = null;
    private static ArrayList list;
    
    public static ArrayList getClientIssues(Connection conn, int client){
        /**
         * This method receive as a parameter a query for the data base to create
         * an arraylist with the rows and return it.
         * 
         * @param query is the String which send as a query to the data base.
         * @return list with the content of the result of the query.
         */
        try{
            String query = "SELECT * FROM issue WHERE cod_client = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, String.valueOf(client));
            rset = pstmt.executeQuery();
            
            list = new ArrayList();
            
            while(rset.next()){
                    
                Issue issue = new Issue(rset.getInt(1),
                                        rset.getString(2),
                                        rset.getString(3),
                                        rset.getString(4),
                                        rset.getInt(5),
                                        rset.getInt(6),
                                        rset.getInt(7),
                                        rset.getFloat(8)
                );
                
                list.add(issue);
                
            }
            pstmt.close();
            rset.close();
        }catch(SQLException e){
            System.out.println("Error al conectar con la BBDD.");
        }  

        return list;
    }
    
    public static ArrayList getColumn(Connection conn, String columnReturn, String table){
        /**
         * This method recieve a query for obtain of the data base one and only one
         * field of a table.
         * 
         * @param query is the String which send as a query to the data base.
         * @return list with the content of the result of the query.
         */
        try{
            String query = "SELECT DISTINCT ? FROM * ORDER BY ?";
            query = query.replace("?", columnReturn);
            query = query.replace("*", table);

            pstmt = conn.prepareStatement(query);
            rset = pstmt.executeQuery();
            
            list = new ArrayList();

            while(rset.next()){
                list.add(rset.getString(1));
            }
            pstmt.close();
            rset.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
        
        return list;
    }
    
    public static String getValue(Connection conn,String cod){
        
        String value = "";
        try{
            String query = "SELECT COALESCE(MAX(cod_issue),0) FROM Issue WHERE cod_client = ?";
            query = query.replace("?", cod);

            pstmt = conn.prepareStatement(query);
            rset = pstmt.executeQuery();

            rset.next();
            value = rset.getString(1);

            pstmt.close();
            rset.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
        
        return value;
    }
    
    public static int getCodEntity(Connection conn, String entity_name){
        int value = 0;
        try{
            String query = "SELECT cod_entity FROM entity WHERE entity_name = ?";
            query = query.replace("?", entity_name);

            pstmt = conn.prepareStatement(query);
            rset = pstmt.executeQuery();

            rset.next();
            value = rset.getInt(1);

            pstmt.close();
            rset.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
        
        return value;
    }
}
