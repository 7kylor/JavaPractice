// 6.	Create a class named Mobile having 4 Instance variables Model, price , weight, color. The class should have a method   Display() which should display all the attributes of the class. The class should also have a one parameterized constructor to initialize all the attributes with values passed from main method.  Create a main class that contains the main method. Create 3 objects of the class Mobile using an array. Initialize all the objects. Display the details of the mobile with the lowest price.

class MobileESE_PQ {
    String model, color;
    double price, weight;

    MobileESE_PQ(String model, String color, double price, double weight) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    void Display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
    }

}

class MainMobile {
    public static void main(String[] args) {
        MobileESE_PQ[] NewMobile = new MobileESE_PQ[3];
        NewMobile[0] = new MobileESE_PQ("Samsung", "Black", 50600, 100);
        NewMobile[1] = new MobileESE_PQ("Nokia", "Green", 2040, 200);
        NewMobile[2] = new MobileESE_PQ("Apple", "Red", 80660, 300);

        int index = 0;
        for (int i = 1; i < NewMobile.length; i++) {
            if (NewMobile[0].price < NewMobile[i].price) {
                index = i;
            }
        }
        System.out.println("Details of the mobile with the lowest price: ");
        NewMobile[index].Display();
    }
}