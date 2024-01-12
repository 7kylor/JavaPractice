package Practice_Questions;
// 6.	Create a class named Mobile having 4 Instance variables Model, price , weight, color. The class should have a method   Display() which should display all the attributes of the class. The class should also have a one parameterized constructor to initialize all the attributes with values passed from main method.  Create a main class that contains the main method. Create 3 objects of the class Mobile using an array. Initialize all the objects. Display the details of the mobile with the lowest price.

class MobileESE {
    String model, color;
    double price, weight;

    MobileESE(String model, String color, double price, double weight) {
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
        MobileESE[] NewMobile = new MobileESE[3];
        NewMobile[0] = new MobileESE("Samsung", "Black", 5000, 100);
        NewMobile[1] = new MobileESE("Nokia", "Green", 2000, 200);
        NewMobile[2] = new MobileESE("Apple", "Red", 3000, 300);

        double min = NewMobile[0].price;
        int index = 0;
        for (int i = 0; i < NewMobile.length; i++) {
            if (NewMobile[i].price < min) {
                min = NewMobile[i].price;
                index = i;
            }
        }
        System.out.println("Details of the mobile with the lowest price: ");
        NewMobile[index].Display();
    }
}