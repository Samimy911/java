class Car{
    
    public String color;
    public String brand;
    public String model;
    
    
    public void display(){
        
        
    }
}
   


/**
 *
 * @author LabStudent
 */
public class OOPEXAMPLE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Car  mycar=new Car();
            Car helenscar=new Car();
            mycar.color="RED";
            mycar.model="CHARGER";
            helenscar.color="BLUE";
            helenscar.brand="NISSAN";
            helenscar.model="ULTIME";
            System.out.println("DISPLAYING MY CAR ATTRIBUTES");
            System.out.println("========================================");
            System.out.println(mycar.color+"-->"+mycar.brand+"--->"+mycar.model);
            System.out.println("========================================");
            System.out.println(helenscar.color+"-->"+helenscar.brand+"--->"+helenscar.model);
       
    }
    
}
