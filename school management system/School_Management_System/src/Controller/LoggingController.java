/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBSearch;
import View.Login;
import View.welcome;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ireshika
 */
public class LoggingController {
    
    public static void login(String ID, String pass){
        try{
            String username = null;
            String password = null;
            
            ResultSet rs = new DBSearch().searchLoging(ID);//proceess quary
            while (rs.next()){
                username = rs.getString("user_name");//assign database login nameto the variable
                password = rs.getString("Password");//assign data base password to te variable
            }
            if (username != null && password != null){
                if (password.equals(pass)){
                    System.out.println("Login Successfull");
                    welcome view = new welcome();
                    //view.bill(username);
                    //view.Latest(username);
                    Login.getFrames()[0].dispose();
                    view.setVisible(true);

                    
                }else {
                    JOptionPane.showMessageDialog(null,"Please check the Credentials","Error", 
                    JOptionPane.ERROR_MESSAGE);
                }
                }else {
                    JOptionPane.showMessageDialog(null,"Please check the Credentials","Error", 
                    JOptionPane.ERROR_MESSAGE);
                    }
                //DBconnect.closeConn();
            } 
        catch(SQLException ex){
            Logger.getLogger(LoggingController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
