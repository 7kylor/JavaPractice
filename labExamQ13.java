// Q13: Create an abstract class called Shape that contains one data member
// color, two abstract methods called calculateArea() and displayinfo(), which
// is implemented by Circle class and Rectangle class that extends from the
// Shape class. Circle class should have two variables radius, and area, one
// parameterized constructor to give values for the variables color and radius.
// It should also implement calculateArea() method using formula area = 3.14 *
// radius * radius. It shouldimplement displayinfo() to display , the color,
// radius and area. Rectangle class should have three variables width and height
// and area, one parameterized constructor to give values for thevariables color
// , width and height. It should also implement calculateArea() method using
// formula area = width * height. It should also implement displayinfo() to
// display all its data. Create a main class, create one object each for Circle
// and Rectangle classes and call the methods respectively

abstract class Shape {
    String color;

    abstract void calculateArea();

    abstract void displayInfo();
}

class Circle extends Shape {
    double radius, area;

    Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    void calculateArea() {
        area = 3.14 * radius * radius;
    }

    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    double width, height, area;

    Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    void calculateArea() {
        area = width * height;
    }

    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        c.calculateArea();
        c.displayInfo();

        Rectangle r = new Rectangle("Blue", 5.0, 7.0);
        r.calculateArea();
        r.displayInfo();
    }
}