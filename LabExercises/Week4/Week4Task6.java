// Write a Java program to implement the concept of polymorphism using
// constructor overloading in class called shape. The class should have 2 instance variables called
// length and breadth. Also one default constructor which should initialize the instance variables with
// some values. The class should also have a second parameterized constructor that initializes
// the instance variables with the parameter passed from the main method. The class should also have a
// method called as check which displays a message whether it is a square or a rectangle.
// Create another class that hosts the main method. Create an object of the shape class which invokes
// the first constructor and create another object that invokes the second constructor.Call the check
// method for all the objects.

class Shape {
    double length;
    double breadth;

    Shape() {
        length = 1;
        breadth = 1;
    }

    Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void check() {
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(2, 3);

        shape1.check();
        shape2.check();
    }
}