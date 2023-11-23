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
