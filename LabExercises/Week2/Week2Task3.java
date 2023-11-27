// Task 3 Write a Java program that contains a class named Rectangle with two instance 
//variables: length and width. The class should have the following methods:
// assignValues(double length, double width): This method assigns values to the
// length and width of the rectangle. 
// area(): This method calculates and returns the area of the rectangle.
// perimeter(): This method calculates and returns the perimeter of the
// rectangle. Additionally, create another class named RectangleOperations that contains
// the main method. Within the main method: Create an object of the Rectangle class.
// Use the object to call the assignValues method and assign sample values to the length and width.
// Calculate and display the area of the rectangle using the area method. Calculate and display the perimeter of the rectangle using the perimeter method.

class Rectangle {
    double length;
    double width;

    void assignValues(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    void printArea() {
        System.out.println("Area: " + area());
    }

    void printPerimeter() {
        System.out.println("Perimeter: " + perimeter());
    }
}

class RectangleOperations {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.assignValues(5.0, 10.0);
        r.printArea();
        r.printPerimeter();
    }
}
