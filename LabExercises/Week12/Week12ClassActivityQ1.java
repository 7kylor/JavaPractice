// 1. Create a class named Mobile having 4 Instance variables Model, price , weight, color. The class should have a method Display() which should display all the attributes of the class. The class should also have a one parameterized constructor to initialize all the attributes with values passed from main method. Create a main class that contains the main method. Create 3 objects of the class Mobile using an array. Initialize all the objects. Display the details of the mobile with the lowest price.

class Mobile {
    String model;
    int price;
    int weight;
    String color;

    Mobile(String model, int price, int weight, String color) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}

class Week12ClassActivityQ1 {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[3];
        mobiles[0] = new Mobile("Apple iPhone 15 Pro", 30, 111, "Blue");
        mobiles[1] = new Mobile("Samsung Galaxy S23+", 180, 122, "Black");
        mobiles[2] = new Mobile("Samsung Galaxy S23 Ultra", 830, 220, "Gray");

        Mobile lowestPriceMobile = mobiles[0];
        for (int i = 1; i < mobiles.length; i++) {
            if (mobiles[i].price < lowestPriceMobile.price) {
                lowestPriceMobile = mobiles[i];
            }
        }

        lowestPriceMobile.display();

    }

}

