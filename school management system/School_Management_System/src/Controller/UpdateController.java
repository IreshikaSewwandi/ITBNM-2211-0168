/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Nishan Fernando
 */
public class UpdateController {
    
    public static void Updateaddstudent(String ID, String Name, String Father_Name ,String Phone, String Father_Phone, String Class , String Roll_Number , String Address){
        
       // int Tele = Integer.parseInt(Contact);
        new Model.UpdateRecord().Updateaddstudent(ID, Name, Father_Name , Phone,Father_Phone, Class ,Roll_Number , Address);
        JOptionPane.showMessageDialog(null, "Details has been updated", "Successful",JOptionPane.INFORMATION_MESSAGE);
          
    }
    
    public static void Updateaddteacher(String ID, String Name, String specialization ,String Subject_Assigned){
        
       // int Tele = Integer.parseInt(Contact);
        new Model.UpdateRecord().Updateaddteacher(ID, Name, specialization, Subject_Assigned);
        JOptionPane.showMessageDialog(null, "Details has been updated", "Successful",JOptionPane.INFORMATION_MESSAGE);
          
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
