/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.util.Scanner;
import javax.swing.JOptionPane;


class Quad1{
    
    private double a;
    private double b;
    private double c;
    
    
    
    
    public void SOLUTIONS(){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter Values OF a,b, and c respectively");
       
        
        
        a=read.nextDouble();
        b=read.nextDouble();
        c=read.nextDouble();
        
        double delta=b*b-4*a*c;
        if(delta>=0){
            double x1=(-b+Math.sqrt(delta))/(a*2);
            double x2=(-b+Math.sqrt(delta))/(a*2);
            JOptionPane.showMessageDialog(null, "SOLUTIONS ARE"+x1+"AND"+x2);
              
        }
        
        else{
             System.out.println("No solution");
        }
        
        
        // TODO code application logic here
    }
    
}

      
    
    
    
    




public class private_quad {
    public static void main(String[] args) {
        Quad1 q= new Quad1();
        q.SOLUTIONS();
}
}