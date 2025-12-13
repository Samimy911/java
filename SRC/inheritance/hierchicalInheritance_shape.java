
//package hierchicalInheritanceexample;

class Shape{
        protected int side;
        protected int  width;
        protected int  Height;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }
        
}       

class square extends Shape {
    
     public int perimeter(){
         return side*4;
         
     }
     public int area(){
         return side*side;
     }
}

class rectangle extends Shape {
    
     public int perimeter(){
         return (width+Height)*2;
         
     }
     public int area(){
         return side*side;
     }
}


public class hierchicalInheritanceexampleshape {
    
    public static void main(String[] args) {
        square s=new square();
        s.setSide(10);
        System.out.println("The PERIMETER OF THE SQUARE IS"+s.perimeter());
        System.out.println("The Area OF THE SQUARE IS"+s.area());
        rectangle r=new rectangle();
        
        r.setHeight(10);
        r.setWidth(15);
         System.out.println("The PERIMETER OF THE RECTANGLEIS"+r.perimeter());
         System.out.println("The Area OF THE Rectangle IS"+ r.area());
        
        
        
    

    }
}


