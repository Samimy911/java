/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

class Animal1{
    public void eat(){
        System.out.println("I can eat");

 
}
}
class Dog1 extends Animal1{
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
     
   public void bark(){
       System.out.println("I can bark");
       
   }
    
    
    
}

public class method_overiding {
    
     public static void main(String[] args) {
         
         
            Dog1 labrador =new Dog1();
            
           
            
            
            labrador.eat();
            labrador.bark();
        

        
        
        // TODO code application logic here
    }

    
}
