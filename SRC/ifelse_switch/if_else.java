/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author LabStudent
 */
public class exercise_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Scored marks:");
        int testscore=input.nextInt();
        char grade;
        if (testscore>=80){
           grade='A';
        }else if(testscore>=70){
                 grade='B';
        }else if(testscore>=60){
                 grade='C';
        }else if (testscore>=50){
               grade='D';
        }else{
              grade='F';
              
        
        
        
        }
       System.out.println("GRADE="+grade);
      
        
        

    
    
    }
}
