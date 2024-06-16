/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author Ireshika
 */
public class DeleteRecord {
    
    Statement stmt;
    
    public void DeleteSDstud(String ID){
        
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("DELETE FROM addstudent WHERE ID='"+ID+"' ");
        }
        catch(Exception e){
        }
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
