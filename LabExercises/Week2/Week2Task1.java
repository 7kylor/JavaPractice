// Task 1 Circle Calculation Program:
// Write a Java program that contains a class named Circle with an instance variable: radius. The class
// should have the following methods:
// 1. assignRadius(double radius): This method assigns a value to the radius of
// the circle.
// 2. area(): This method calculates and returns the area of the circle.
// 3. circumference(): This method calculates and returns the circumference of
// the circle.
// Additionally, create another class named CircleOperations that contains the main method. Within the main method:
// Create an object of the Circle class. Use the object to call the assignRadius method and assign a sample value to
// the radius. Calculate and display the area of the circle using the area method. Calculate and display the circumference of the circle using the circumference method.

class Circle {
    double radius;

    void assignRadius(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

class CircleOperations {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.assignRadius(5.0);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}