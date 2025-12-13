/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_case;
import java.util.Scanner;

/**
 *
 * @author LabStudent
 */
public class switch_case {
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Scored marks:");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("It IS Monday");
                break;
                
            case 2:
                System.out.println("It IS Tuesday");
                break;
                
                 
                
            case 3:
                System.out.println("It IS wensday");
                break;
                
                
            case 4:
                System.out.println("It IS Thursday");
                break;
                
            case 5:
                System.out.println("It IS Friday");
                break;
                
                
             case 6:
                System.out.println("It IS Saturday");
                break;
                
                
             case 7:
                    System.out.println("It is Sunday");
                    break;

             default:
                 System.out.println("Bad choice try again");
                   
        
        }
        
    
}

}