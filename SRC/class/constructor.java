
import javax.swing.JOptionPane;




class Car2 {
    
    private String color;
    private String brand;
    private String model;

    public Car2(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car2{" + "color=" + color + ", brand=" + brand + ", model=" + model + '}';
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

}


/**
 *
 * @author LabStudent
 */
public class constructor {
    public static void main(String[] args) {
     Car2 mycar=new Car2("UMUTUKU","TOYOTA","HILLUX");
     Car2 helenscar=new Car2("YELLOW","BENZ","MERCEDES");
    // System.out.println(mycar.tostring());
    // System.out.println(helenscar.tostring());
    JOptionPane.showMessageDialog(null, mycar.toString());
    JOptionPane.showMessageDialog(null, helenscar.toString());
    
  }
}

   
    



