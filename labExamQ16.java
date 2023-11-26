// Q16: Write a Java program to implement the concept of polymorphism using
// method overloading in class called Box. The class should have 3 instance
// variables called length and breadth and height. Also three setValues()
// methods to set initial values to the variables. The first set method has no
// parameters and should initialize the instance variables with some values. The
// second set method should have three parameters to initialize the variables
// using the values passed from main method. The third method should have one
// parameter which should be used to set the values for all the three class
// variables. The class should also have a method called as display() which
// displays the length, breadth and height of the box and also a message whether
// it is a normal box or a cube. Create another class that hosts the main
// method. Create an object of the Box class which invokes the all the three
// setValues() methods. Call the display() method also.

class Box {
    double length, breadth, height;

    void setValues() {
        length = 1.0;
        breadth = 1.0;
        height = 1.0;
    }

    void setValues(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void setValues(double value) {
        length = value;
        breadth = value;
        height = value;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        if (length == breadth && breadth == height) {
            System.out.println("Cube");
        } else {
            System.out.println("Normal Box");
        }
    }
}

class BoxMain {
    public static void main(String[] args) {
        Box b = new Box();
        b.setValues();
        b.display();

        b.setValues(2.0, 2.0, 2.0);
        b.display();

        b.setValues(3.0);
        b.display();
    }
}
