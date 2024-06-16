/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Ireshika
 */
public class User_Controller {
    public static void Add(String ID, String Name, String Father_name ,String Phone, String Father_Phone, String Class , String Roll_Number, String Address) {
        
       
            new Model.AddRecord().Add( ID, Name, Father_name , Phone, Father_Phone, Class , Roll_Number, Address);
            JOptionPane.showMessageDialog(null, " Data stores successfully ", "Successfull",JOptionPane.INFORMATION_MESSAGE);

        }
    
    public static void Add(String ID, String Name, String Specialization,String Subject_Assigned) {
        
       
            new Model.AddRecord().Add( ID, Name, Specialization, Subject_Assigned);
            JOptionPane.showMessageDialog(null, " Data stores successfully ", "Successfull",JOptionPane.INFORMATION_MESSAGE);

        }
    
    public static void Add(String ID, String Name, String Month_Name,String Annual_Fee, String Sport_Fee, String Library_Fee , String Monthi_Fee) {
        
       
            new Model.AddRecord().Add( ID, Name, Month_Name , Annual_Fee, Sport_Fee, Library_Fee , Monthi_Fee );
            JOptionPane.showMessageDialog(null, " Data stores successfully ", "Successfull",JOptionPane.INFORMATION_MESSAGE);

        }
    
/*    public static void Add(String User_Name, String Password, String Security_Question,String Answer) {
        
       
            new Model.AddRecord().Add( User_Name, Password,Security_Question, Answer );
            JOptionPane.showMessageDialog(null, " Data stores successfully ", "Successfull",JOptionPane.INFORMATION_MESSAGE);

        }
    

/*
    
    public static void Update(String ID, String Name, String NIC,String Address, String Contact, String Email) {
        if(ID.isEmpty() || Name.isEmpty() || NIC.isEmpty() || Address.isEmpty() || Contact.isEmpty() || Contact.isEmpty()){
            JOptionPane.showMessageDialog(null, " MIssing Details ", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else 
            new Model.AddRecord().Update(ID, Name, NIC, Address, Contact, Email);
            JOptionPane.showMessageDialog(null, "Product details has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            welcome refresh = new welcome();
           // refresh.bill(ID);
        }

*/

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
