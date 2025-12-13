
import java.util.Scanner;
import javax.swing.JOptionPane;
public class AVERAGE10ITEMS {
    
 
  public static void main(String[] args){
      double total=0;
      double [] a=new double[10];
      Scanner read=new Scanner(System.in);
      System.out.println("This is the program to calculater average of 10 items");
      for(int i=0; i<10; i++){
          System.out.println("Enter any value............");
          a[i]=read.nextDouble();
          total=total+a[i];
      }
       double average=total/10;
       JOptionPane.showMessageDialog(null, average);
  }

  
}

    

