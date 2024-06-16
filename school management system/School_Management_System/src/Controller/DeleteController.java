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
public class DeleteController {
   
    
    public static void DeleteSDstud(String ID){
                  
        new Model.DeleteRecord().DeleteSDstud(ID);
        JOptionPane.showMessageDialog(null, "Student has been deleted", "Successful",JOptionPane.INFORMATION_MESSAGE);

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
