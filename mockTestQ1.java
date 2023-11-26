// Q1. Write a program in Java to define a class Triangle having 3 instance
// variables namely base, height ,area
// and 2 methods namely Assign() to assign values to the instance variables by
// getting it from main class and
// calcarea() to calculate and return the result to main class . Call all the
// methods of class Triangle using the
// object created from main class. The objects should pass parameters required
// to triangle class.

class Triangle {
    double base, height, area;

    void assign(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calcarea() {
        return 0.5 * base * height;
    }
}

class TriangleMain {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.assign(5.0, 3.0);
        System.out.println("Area: " + t.calcarea());
    }
}