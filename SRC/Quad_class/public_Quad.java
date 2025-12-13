/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import javax.swing.JOptionPane;

class Quad{
    
    public double a=1;
    public double b=2;
    public double c=1;
    
    
    
    
    public void readData(){
      
    }
    
    
    
}



/**
 *
 * @author LabStudent
 */
public class oop1  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quad q= new Quad();
        double delta=q.b *q.b-4*q.a*q.c;
        
        if(delta>=0){
            double x1=(-q.b+Math.sqrt(delta))/(q.a*2);
            double x2=(-q.b+Math.sqrt(delta))/(q.a*2);
            JOptionPane.showMessageDialog(null, "SOLUTIONS ARE"+x1+"AND"+x2);
              
        }
        
        else{
             System.out.println("No solution");
        }
        
        
        // TODO code application logic here
    }
    
}
