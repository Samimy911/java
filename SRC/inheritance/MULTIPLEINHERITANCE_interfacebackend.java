/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
interface Backend{
    
    public void connectServer();
}


class Fronted{
    
  public void responsive(String str){
      System.out.println(str+" can also be used as fronted");
  }
}

abstract class Language extends Fronted implements Backend{
    String language="Java";
    
    @Override
    public void connectServer(){
        System.out.println (language+ " can be used as backend language " );
    }
}
public class MULTIPLEINHERITANCETEST {
    
    public static void main(String[] args) {
        Language java=new Language() {};
        java.connectServer();
        java.responsive(java.language);
        
   
    
}
}
