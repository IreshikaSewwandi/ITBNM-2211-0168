package Model;


import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ireshika
 */

public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    
    public ResultSet searchLoging(String ID){
    try{
        stmt = DBconnect.getStatementConnection();
        String User_Name = ID;//Execute Quary
        rs = stmt.executeQuery("SELECT * FROM sign_up WHERE User_Name='"+User_Name+"'");
    }
    catch (Exception e){
        e.printStackTrace();
    }return rs;
}
    
    public ResultSet searchstudent(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBconnect.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM addstudent");
        } catch (Exception e) {
        }
    return rs;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

    
