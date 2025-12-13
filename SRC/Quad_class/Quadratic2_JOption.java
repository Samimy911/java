/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.quadraticequation;

import javax.swing.JOptionPane;

/**
 *
 * @author npacc
 */
public class Quadratic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        JOptionPane.showMessageDialog(null, "SOLVING A QUADRATIC EQUATION");
        
        double a = Double.parseDouble(JOptionPane.showInputDialog("ENTER THE VALUE OF A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("ENTER THE VALUE OF B"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("ENTER THE VALUE OF C"));
        
        double delta = b * b - 4 * c;
        if (delta >= 0){
            double x1 = (-b + Math.sqrt(delta))/(2 * a);
            double x2 = (-b - Math.sqrt(delta))/(2 * a);
                    JOptionPane.showMessageDialog(null,"THE SOLUTION ARE: X1= "+x1 +" AND X2= "+x2);
        }
        
        else {
            JOptionPane.showMessageDialog(null,"NO SOLUTION FOR THIS EQUATION");
        }  
    }
    
}
