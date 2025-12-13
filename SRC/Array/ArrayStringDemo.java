/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LabStudent
 */
public class ArrayStringDemo {
    public static void main(String[] args){
        String myname=
                
                
                
                
                "12345";
        StringBuilder s=new StringBuilder();
       // String myname="Iwagiraezu Innocent";
        System.out.println(s.reverse());
        System.out.println(myname.length());
        System.out.println(myname.charAt(4));
        System.out.println(myname.concat("HABARI"));
        System.out.println(myname.contains("okey"));
        System.out.println(myname.substring(5,10));
        
        String a="102667750100415061";
        System.out.println("The size of a is:"+a.length());
        //System.out.println("The size of a is:"+a.length());
        System.out.println(a.charAt(5));
        System.out.println(myname.equals(a));
        System.out.println(myname.equalsIgnoreCase(a));
        
        String conc="Hello" +" "+ "To"+" "+"kigali";    
        System.out.println(conc);
        System.out.println("SAMSON JOHN".toLowerCase());
        System.out.println("twahirwa".toUpperCase());
        System.out.println(myname.length());
        System.out.println(myname.concat("HABARI"));
}
}
