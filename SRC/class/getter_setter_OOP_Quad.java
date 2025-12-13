/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;



import javax.swing.JOptionPane;

// Renamed Quad2 to Quad for simplicity and consistency with variable 'q'
class Quad2 {
    
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    // FIXED: Ensure setter method name matches case used in main method (setC)
    public void setC(double c) {
        this.c = c;
    }
    
    public void SOLUTIONS(){
       // This method is empty, but can contain the quadratic logic if you move it here
    }
}
        

public class getter_setter_OOP {
    public static void main(String[] args) {
        
        // FIXED: Use the correct class name Quad
        Quad2 q = new Quad2(); 
        q.setA(1);
        q.setB(-2);
        // FIXED: Corrected capitalization to setC (lowercase 's')
        q.setC(1); 
        
        double delta=q.getB() *q.getB()-4 *q.getA()*q.getC();
        if(delta>=0){
            double x1=(-q.getB()+Math.sqrt(delta))/(q.getA()*2);
            double x2=(-q.getB()-Math.sqrt(delta))/(q.getA()*2);
            JOptionPane.showMessageDialog(null, "SOLUTIONS ARE"+x1+"AND"+x2);
              
        }
        
          else{
             System.out.println("No solution");
        }   
    }
}
