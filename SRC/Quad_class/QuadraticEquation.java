package com.mycompany.quadraticequation;

import java.util.Scanner;

/**
 *
 * @author npacc
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        System.out.println("Hello Student...!");
        // TODO code application logic here
        /*double a = 1;
        double b = -2;
        double c = 1;*/
        
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1,x2;
        System.out.println("ENTER THE VALUE OF A:");
        a = input.nextDouble();
        System.out.println("ENTER THE VALUE OF B:");
        b = input.nextDouble();
        System.out.println("ENTER THE VALUE OF C:");
        c = input.nextDouble();
        delta = b * b - 4 * c;
        if (delta >= 0){
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);
                    System.out.println("THE SOLUTION ARE:");
                    System.out.println("X1 =" +x1);
                    System.out.println("X2 =" +x2);
        }
        else {
            System.out.println("NO SOLUTION FOR THIS EQUATION");
        }
    }
}
