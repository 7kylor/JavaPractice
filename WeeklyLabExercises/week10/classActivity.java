// write a proj in java that has two methods too add and subtract 2 numbers and display them 

class Add {
    int add(int a, int b) {
        return a + b;
    }
}

class Subtract {
    int subtract(int a, int b) {
        return a - b;
    }
}

class Display {
    void display(int a, int b) {
        System.out.println("First Number: " + a + " Second Number: " + b);
    }
}

class AddSubtract {
    public static void main(String[] args) {
        Add add = new Add();
        Subtract subtract = new Subtract();
        Display display = new Display();

        int a = 10;
        int b = 5;

        display.display(a, b);
        System.out.println("Add: " + add.add(a, b));
        System.out.println("Subtract: " + subtract.subtract(a, b));
    }
}