// Design a Java program using the concept of method overloading in a class named
// Calculator. The class should have: Attributes to store calculation results. Multiple
// multiply methods that can multiply two numbers, three numbers, integer numbers and
// floating point numbers. A method to display the calculated result.
// In a separate class, create an instance of the Calculator class, perform various addition
// operations using the overloaded add methods, and display the results.

class Calculator {
    double result;

    void multiply(double a, double b) {
        result = a * b;
    }

    void multiply(double a, double b, double c) {
        result = a * b * c;
    }

    void multiply(int a, int b) {
        result = a * b;
    }

    void multiply(float a, float b) {
        result = a * b;
    }

    void display() {
        System.out.println("Result: " + result);
    }

}

class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.multiply(1.0, 2.0);
        c.display();
        c.multiply(1.0, 2.0, 3.0);
        c.display();
        c.multiply(1, 2);
        c.display();
        c.multiply(1.0f, 2.0f);
        c.display();
    }
}