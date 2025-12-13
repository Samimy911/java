
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LabStudent
 */
public class two_dimensional_array_advanced {
    public static void main( String[] args){
        int data;
        int [][] m1=new int[2][2];
        int[][] m2=new int[2][2];
        int [][] sum=new int[2][2];
        Scanner input=new Scanner(System.in);
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++){
                System.out.println("ENTER VALUES......");
                input.nextInt();
                m1[i][j]=input.nextInt();
            }
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++){
                System.out.println("Enter values.........");
                
                m2[i][j]=input.nextInt();
            }
        for(int i=0; i<2; i++)
           for(int j=0; j<2; j++){
               sum[i][j]=m1[i][j]-m2[i][j];
           }
        System.out.println("Displaying The Resulting matrice");
        for (int i=0; i<2; i++){
             for(int j=0; j<2; j++){
                 System.out.print(sum[i][j]+" ");
             }
        }    System.out.println();
            
    
}
}
