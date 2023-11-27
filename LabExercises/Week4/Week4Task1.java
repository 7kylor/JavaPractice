// Create a class called Box having variables length , L, breadth,B and height,H. Also the following
// methods i. Method giveValues() to assign values to the variables with the values passed as parameter from the main method ii. Method calcArea() to calculate the area of the box and display all the area. The formula to calculate the area of the box is 2(LB + LH + BH) iii. Method calcVolume() to calculate the volume of the box and display all the volume. The formula to calculate the volume of the box is L* B* H Create another class that hosts the main method. And create 3 objects of the Box class. Call all the methods to check their functionality

class Box {
    double length;
    double breadth;
    double height;

    void giveValues(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void calcArea() {
        double area = 2 * (length * breadth + length * height + breadth * height);
        System.out.println("Area: " + area);
    }

    void calcVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }
}

class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.giveValues(1, 2, 3);
        box2.giveValues(4, 5, 6);
        box3.giveValues(7, 8, 9);

        box1.calcArea();
        box2.calcArea();
        box3.calcArea();

        box1.calcVolume();
        box2.calcVolume();
        box3.calcVolume();
    }
}