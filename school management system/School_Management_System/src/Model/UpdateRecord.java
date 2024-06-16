/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nishan Fernando
 */
public class UpdateRecord {
    
    Statement stmt;
    
    public void Updateaddstudent(String ID, String Name, String Father_Name ,String Phone, String Father_Phone, String Class , String Roll_Number , String Address){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("Update addstudent SET,Name='"+Name+"',Father_Name='"+Father_Name+"',Phone='"+Phone+"',Father_Phone='"+Father_Phone+"',Class='"+Class+"',Roll_Number='"+Roll_Number+"',Address='"+Address+"' WHERE ID='"+ID+"' ");
        }
        catch(SQLException e){
        } 
        
    }
    
    public void Updateaddteacher(String ID, String Name, String specialization ,String Subject_Assigned){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("Update addteacher SET , Name='"+Name+"',Father_Name='"+specialization+"',Phone='"+Subject_Assigned+"' WHERE ID='"+ID+"' ");
        }
        catch(SQLException e){
        } 
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
