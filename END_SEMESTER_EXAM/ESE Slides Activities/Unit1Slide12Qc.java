// c. Create a class called Shape with instance variable color as well as
// methods to set and get the values of these variables. Then, create a subclass
// called Circle that adds an additional instance variable radius and methods to
// set and get its value, as well as a method to calculate the area of the
// circle. Create Main class, create object of Circle class and call all the
// methods.

class Shape_ESE_Slides {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}

class Circle_ESE extends Shape_ESE_Slides {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class ShapeMain_ESE_Slides {
    public static void main(String[] args) {
        Circle_ESE circle = new Circle_ESE();

        circle.setColor("Red");
        circle.setRadius(5);

        System.out.println("Circle");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
