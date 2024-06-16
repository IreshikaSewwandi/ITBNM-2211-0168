/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ireshika
 */

public class DBconnect {   
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection() {
        try{
            //establish the connection
            String url = "jdbc:mysql://localhost:3306/school_management_system";
            conn = DriverManager.getConnection (url, "root", "");
            //Create the connection
            stat = conn.createStatement();
            
        }
            catch (Exception e){
            e.printStackTrace();
            }
        return stat;
        }
        
}
