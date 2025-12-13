. Conceptual differences between Object-Oriented Programming (OOP) and other programming techniques
Object-Oriented Programming (OOP)
	•	Organizes programs around objects and classes.
	•	Data and behavior are bundled together.
	•	Promotes encapsulation, inheritance, polymorphism, and abstraction.
	•	Simpler maintenance through modularity and reusability.
	•	Models real-world entities directly.
Procedural Programming (e.g., C)
	•	Organizes programs around functions (procedures).
	•	Data is usually separate from functions.
	•	Harder to maintain as program size grows.
	•	No built-in mechanisms for modeling real-world entities.
Functional Programming (e.g., Haskell)
	•	Focuses on mathematical functions.
	•	Avoids mutable state.
	•	No objects or classes.
In summary:OOP focuses on objects, while procedural programming focuses on functions, and functional programming focuses on expressions.

2. Define the terms object and class. Show how to declare a class
Object
An object is an instance of a class. It represents a real-world entity with state (data) and behavior (methods).
Class
A class is a blueprint or template for creating objects. It defines the attributes and methods the object will have.
Example of declaring a class

class Car {
    String model;
    int year;

    // Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println(model + " - " + year);
    }
}

3. Contrast with examples at least four inheritance concepts
(a) Single Inheritance
One child class inherits from one parent class.

class Animal {}
class Dog extends Animal {}
(b) Multilevel Inheritance
A chain of inheritance.

class Animal {}
class Mammal extends Animal {}
class Dog extends Mammal {}
(c) Hierarchical Inheritance
Multiple child classes inherit from one parent.

class Shape {}
class Circle extends Shape {}
class Square extends Shape {}
(d) Multiple Inheritance (Not directly supported in Java through classes)
Achieved using interfaces.

interface A { void show(); }
interface B { void display(); }

class Demo implements A, B {
    public void show() {}
    public void display() {}
}

4. Inheritance graph: Point, Circle, Rectangle, Sphere
A possible interpretation:

            Point
           /     \
       Circle   Rectangle
          |
       Sphere
Explanation:
	•	Point is the base for 2D shapes.
	•	Circle and Rectangle are 2D shapes extending Point.
	•	Sphere is a 3D extension of Circle (since a sphere is essentially a 3D circle).


class Base {
    double height;
    double width;

    // Base class constructor
    Base(double height, double width) {
        this.height = height;
        this.width = width;
    }
}

// Square class inheriting Base
class Square extends Base {

    // A square has equal height and width (side)
    Square(double side) {
        super(side, side);
    }

    double perimeter() {
        return 4 * height;
    }

    double area() {
        return height * height;
    }
}

// Rectangle class inheriting Base
class Rectangle extends Base {

    Rectangle(double height, double width) {
        super(height, width);
    }

    double perimeter() {
        return 2 * (height + width);
    }

    double area() {
        return height * width;
    }
}

// Main class to test the program
public class ShapesDemo {
    public static void main(String[] args) {

        // Create a square
        Square square = new Square(5);
        System.out.println("Square:");
        System.out.println("Side: " + square.height);
        System.out.println("Perimeter: " + square.perimeter());
        System.out.println("Area: " + square.area());

        // Create a rectangle
        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("\nRectangle:");
        System.out.println("Height: " + rectangle.height);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Area: " + rectangle.area());
    }
}
6. Console vs Dialog I/O in Java
Console I/O
	•	Uses the terminal (text-based).
	•	Uses System.out.println and Scanner.
	•	Fast and useful for development, debugging, and simple programs.
	•	Example:

Scanner input = new Scanner(System.in);
System.out.print("Enter name: ");
String name = input.nextLine();
Dialog I/O (GUI-based)
	•	Uses pop-up dialog boxes via JOptionPane.
	•	More user-friendly for desktop GUI applications.
	•	Example:

String name = JOptionPane.showInputDialog("Enter name:");
Key difference:Console = command lineDialog = graphical pop-up

7. Difference between an Interface and an Abstract Class
Interface
	•	Contains abstract methods (Java 8+: static and default methods allowed).
	•	A class can implement many interfaces.
	•	No instance fields except constants.
Abstract Class
	•	Can contain both abstract and non-abstract methods.
	•	Can have instance variables.
	•	A class can extend only one abstract class.
When to use each
	•	Use interfaces when you need a contract that many unrelated classes can follow.
	•	Use an abstract class when creating a base class with shared code for related classes.

8. What is an exception? Types of exceptions? How to handle them? When does NullPointerException happen?
Exception
An event that disrupts the normal flow of a program.
Types
	1	Checked ExceptionsMust be handled using try-catch or throws.Example: IOException, SQLException.
	2	Unchecked Exceptions (Runtime Exceptions)Occur during execution.Example: NullPointerException, ArithmeticException.
	3	ErrorsSerious problems not meant to be handled.Example: OutOfMemoryError.
Handling an exception

try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
NullPointerException
Occurs when you call a method or access a field on a variable that refers to null.
Example:

String s = null;
s.length();    // Causes NullPointerException

9. Difference between instance method and static method. Why should fields generally be private?
Instance method
	•	Belongs to an object.
	•	Requires an instance.
	•	Can access instance variables.
Static method
	•	Belongs to the class.
	•	Called without creating an object.
	•	Cannot access instance variables directly.
Why fields should be private
	•	Ensures encapsulation.
	•	Protects the internal state of an object.
	•	Prevents unauthorized or accidental modification.
	•	Allows controlled access through getter/setter methods.

10. Naming conventions and data types
Naming Conventions
	•	Variables: camelCaseExample: studentName
	•	Method names: camelCaseExample: calculateTotal()
	•	Class names: PascalCaseExample: StudentRecord
Primitive Data Types
	•	byte
	•	short
	•	int
	•	long
	•	float
	•	double
	•	char
	•	boolean
Non-primitive Data Types
	•	Classes (e.g., String, Scanner)
	•	Arrays
	•	Interfaces
	•	Enums
	•	Objects created from user-defined classes

