/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
class shape{
    
    
    protected double width;
    protected double hight;
    protected double side;
}
class square extends shape{

    String area;
    
    public double area(double side){
        this.side=side;
        return this.side*this.side;
    }
    public double area(){
        return side*side;
        
        
    
}
public double perimeter(double side){
    
    this.side=side;
    return this.side*4;
    
}

public double perimeter(){
    return side*4;
}
}




public class overloadingfunction {
    
     public static void main(String[] args) {
         
         square aq=new square();
         System.out.println("The area of given square is....."+aq.area());
         System.out.println("The area of given square is....."+aq.area(10));
   
        
    }
}
    

