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

public class AddRecord {
    Statement stmt;
    
    public void Add(String ID, String Name, String Father_Name ,String Phone, String Father_Phone, String Class , String Roll_Number , String Address){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("INSERT INTO addstudent VALUES('"+ID+"', '"+Name+"', '"+Father_Name+"', '"+Phone+"', '"+Father_Phone+"', '"+Class+"', '"+Roll_Number+"','"+Address+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }  
        
    }
    
    public void Add(String ID, String Name, String Specialization ,String Subject_Assigned){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("INSERT INTO addteacher VALUES('"+ID+"', '"+Name+"', '"+Specialization+"','"+Subject_Assigned+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }  
        
    }
    
    public void Add(String ID, String Name, String Month_Name,String Annual_Fee, String Sport_Fee, String Library_Fee , String Monthi_Fee){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("INSERT INTO feesubmit VALUES('"+ID+"', '"+Name+"', '"+Month_Name+"', '"+Annual_Fee+"', '"+Sport_Fee+"', '"+Library_Fee+"', '"+Monthi_Fee+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }  
        
    }
    
/*   
    public void Add(String User_Name, String Password, String Security_Question,String Answer){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("INSERT INTO sign_up VALUES('"+User_Name+"', '"+Password+"', '"+Security_Question+"', '"+Answer+"')");
        }
        catch (Exception e){
            e.printStackTrace();
        }  
        
   }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
    
    
 /*   
    public void Update(String ID, String Name, String NIC,String Address, String Contact, String Email){
        try{
            stmt = DBconnect.getStatementConnection();
            stmt.executeUpdate("Update useraccount SET F_Name='"+Name+"',NIC='"+NIC+"',Contact='"+Contact+"',State='"+Address+"',Email='"+Email+"' WHERE  User_ID='"+ID+"' ");
             
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }*/
    
