class Car1 {
    
    private String color;
    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Car1{" + "color=" + color + ", brand=" + brand + ", model=" + model + '}';
    }
    
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
    
    
    
    
    
    public void mycardetails(){
        color="RED";
        brand="doge";
        model="CHARGER";
        System.out.println("DISPLAYING MY CAR ATTRIBUTES");
        System.out.println("========================================");
        System.out.println(color+"-->"+brand+"--->"+model);
        
        
    }
    public void helenscardetails(){
        
        color="BLUE";
        brand="NISSAN";
        model="CHARGER";
        System.out.println("DISPLAYING HELENSCAR ATTRIBUTES");
        System.out.println("========================================");
        System.out.println(color+"-->"+brand+"--->"+model);
        
        
    }
    

}

/**
 *
 * @author LabStudent
 */
public class PRIVATE_CLASS {
    public static void main(String[] args) {
       Car1 mycar=new Car1();
       Car1 helenscar=new Car1();
       mycar.setColor("UMTUU");
       mycar.setBrand("Toyota");
       mycar.setModel("HILUX");
       helenscar.setColor("YELLOW");
       helenscar.setBrand("BEN2");
       helenscar.setModel("Mercedes");
       System.out.println("DISPLAYING MY CAR ATTRIBUTES");
       System.out.println("========================================");
       System.out.println(mycar.toString());
       System.out.println("DISPLAYING HElENS CAR ATTRIBUTES");
       System.out.println("========================================");
       System.out.println(helenscar.toString());
       
       
       //  System.out.println(mycar.getColor()+"-->"+mycar.getBrand()+"--->"+mycar.getModel());
       //  System.out.println("========================================");
      //   System.out.println(helenscar.getColor()+"-->"+helenscar.getBrand()+"--->"+helenscar.getModel());
       
       
       mycar.mycardetails();
       helenscar.helenscardetails();
    }
    
    
    
}





// Assume this is the start of a file named Car1.java (or included above your main class)
