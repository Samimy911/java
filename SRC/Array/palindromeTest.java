
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LabStudent
 */
public class palindromeTest {
     public static void main(String[] args){
         System.out.println("Enter Any Text");
         Scanner readme=new Scanner(System.in);
         String text=readme.nextLine();
         StringBuilder st=new StringBuilder(text);
         System.out.println(st.reverse());
         if(text.equals(st.reverse().toString())){
    JOptionPane.showMessageDialog(null, "The given test is a palinderom");
     }
         else{
              JOptionPane.showMessageDialog(null, "The given text not a palindrom");
     }
    
}
}