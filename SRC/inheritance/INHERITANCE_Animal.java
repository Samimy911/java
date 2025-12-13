/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
class Animal{
    
    
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    
    public void display(){
        System.out.println("My name is "+name);
    
    
}

}
/**
 *
 * @author LabStudent
 */
public class INHERITANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Dog labrador =new Dog();
            
            labrador.name="Rohu";
            labrador.display();
            
            labrador.eat();
        
        
        // TODO code application logic here
    }
    
}
