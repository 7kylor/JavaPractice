// Q12: Design a Java program using the concept of method overloading in a class named Calculator.The class should have an attributes to store final calculation results. The class should have 4 multiply methods that can multiply two integer numbers, three integer numbers,2 double numbers and 3 double numbers respectively. A method to display the calculated result should also be available . In a separate class, create an instance of the Calculator class, perform various multiplication operations using the overloaded Multiply methods, and display the results.

class Calculator {
    double result;

    void multiply(int a, int b) {
        result = a * b;
    }

    void multiply(int a, int b, int c) {
        result = a * b * c;
    }

    void multiply(double a, double b) {
        result = a * b;
    }

    void multiply(double a, double b, double c) {
        result = a * b * c;
    }

    void display() {
        System.out.println("Result: " + result);
    }
}

class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.multiply(7, 3);
        c.display();

        c.multiply(1, 3, 7);
        c.display();

        c.multiply(1.0, 3.0);
        c.display();

        c.multiply(7.0, 9.0, 5.0);
        c.display();
    }
}