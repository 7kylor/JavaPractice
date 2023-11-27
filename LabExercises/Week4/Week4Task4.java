// q4. Design a Java program using the concept of method overloading in a class
// named Calculator.
// The class should have an attributes to store final calculation results. The
// class should have 4
// multiply methods that can multiply two integer numbers, three integer
// numbers,2 double
// numbers and 3 double numbers respectively. A method to display the calculated
// result should
// also be available . In a separate class, create an instance of the Calculator
// class, perform various
// multiplication operations using the overloaded Multiply methods, and display
// the results.

class Calculator {
    int result;

    void multiply(int a, int b) {
        result = a * b;
    }

    void multiply(int a, int b, int c) {
        result = a * b * c;
    }

    void multiply(double a, double b) {
        result = (int) (a * b);
    }

    void multiply(double a, double b, double c) {
        result = (int) (a * b * c);
    }

    void display() {
        System.out.println("Result: " + result);
    }
}

class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.multiply(1, 2);
        calculator.display();

        calculator.multiply(1, 2, 3);
        calculator.display();

        calculator.multiply(1.0, 2.0);
        calculator.display();

        calculator.multiply(1.0, 2.0, 3.0);
        calculator.display();
    }
}