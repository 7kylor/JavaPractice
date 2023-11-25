// Q10 Design a Java program using the concept of method overloading in a class
// named Shape. The class should have: an attribute to store volume. The class
// also should have three overloaded volume() methods and one display method
// volume(double length, double breadth, double height) : To calculate volume
// for cuboid using formula, volume =( length* breadthheight), volume(double
// side) : To calculate volume for cube using formula, volume =( side sideside)
// volume(double radius, double height) : To calculate volume for cylinder using
// formula, volume =3.14 radius* radius* height display() to print the
// calculated volume. In a separate class ShapeMain, create an instance of the Shape class,
// calculate volume for various shapes using the overloaded volume() methods,
// and display the results.

class Shape {
    double volume;

    void volume(double length, double breadth, double height) {
        volume = length * breadth * height;
    }

    void volume(double side) {
        volume = side * side * side;
    }

    void volume(double radius, double height) {
        volume = 3.14 * radius * radius * height;
    }

    void display() {
        System.out.println("Volume: " + volume);
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.volume(17.0, 7.0, 11.0);
        s.display();

        s.volume(17.0);
        s.display();

        s.volume(23.0, 17.0);
        s.display();
    }
}