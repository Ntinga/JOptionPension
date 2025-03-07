/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpension;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class JOptionPension {

    public static void main(String[] args) {
        
        String Name;
        
        String EmployeeID;
        
        String Age;
        
        Name = JOptionPane.showInputDialog(null, "Enter your Name and Surname: ");

        Age = JOptionPane.showInputDialog(null, "Enter your Age: ");
        
        EmployeeID = JOptionPane.showInputDialog(null, "Enter your Employee ID: ");
        
        int No01 = Integer.parseInt(Age);
        
        if (No01 >= 50){
        
            JOptionPane.showMessageDialog(null, "My Name is: " + Name + "\n My Age is: " + Age + "\n My Employee ID is: " + EmployeeID + "\n I am allowed to take pension. ");
        }else{
            
            JOptionPane.showMessageDialog(null, "My Name is: " + Name + "\n My Age is: " + Age + "\n My Employee ID is: " + EmployeeID + "\n I am not allowed to take pension. ");
        }
    }
}
