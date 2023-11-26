// Q2 Write a program in Java to demonstrate the concept of constructor  overloading. The program should 
// have comments regarding the same. 

class Computer {
    String brand;
    int ram;
    double price;

    // default constructor (no args) or (non-parameterized constructor)
    Computer() {
        brand = "Dell";
        ram = 8;
        price = 50000.0;
    }

    // overloaded constructor (parameterized constructor)
    Computer(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("Price: " + price);
    }
}

class ComputerMain {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.display();

        Computer c2 = new Computer("Apple", 16, 100000.0);
        c2.display();
    }
}