// Q1: Write a Java program that contains a class named Circle with an instance variable: radius. The class should have the following methods: 1. assignRadius(): This method assigns a value to the radius of the circle using parameter passed from main method. 2. area(): This method calculates
// and returns the area of the circle(Use the formula 3.14 * radius * radius). 3. circumference(): This method calculates and returns the circumference of the circle( Use the formula 2 * 3.14 *radius). Additionally, create another class named CircleOperations that contains the main method. Within the main method: Create an object of the Circle class. Use the object to call the
// assignRadius method and assign a sample value to the radius. Calculate and display the area of the circle using the area method. Calculate and display the circumference of the circle using the
// circumference method

class Circle {
    double radius;

    double assignRadius(double r) {
        radius = r;
        return radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }
}

class CircleOperations {
    public static void main(String[] args) {
        Circle ci = new Circle();

        ci.assignRadius(33.5);
        System.out.println("The area of the circle is " + ci.area());
        System.out.println("The circumference of the circle is " + ci.circumference());
    }
}
