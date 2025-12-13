
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LabStudent
 */
public class ARRAY_IMPROVED {
      public static void main(String[] args){
          ArrayList<Integer> numbers=new ArrayList<>();
          
          numbers.add(20);
          numbers.add(5);
          numbers.add(1);
          numbers.add(100);
          numbers.add(5);
          System.out.println("Unsorted ArrayList:"+numbers);
          
          Collections.sort(numbers);
          System.out.println("Sorted ArrayList:"+numbers);
      }
    
}
