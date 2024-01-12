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
        Mobile[] mobiles = new Mobile[4];
        mobiles[0] = new Mobile("Apple iPhone 15 Pro", 330, 111, "Blue");
        mobiles[1] = new Mobile("Samsung Galaxy S23+", 180, 122, "Black");
        mobiles[2] = new Mobile("Samsung Galaxy S23 Ultra", 230, 220, "Gray");
        mobiles[3] = new Mobile("Apple iPhone 14 Pro", 290, 120, "White");

        Mobile lowestPriceMobile = mobiles[0];
        for (int i = 0; i < mobiles.length; i++) {
            if (mobiles[i].price < lowestPriceMobile.price) {
                lowestPriceMobile = mobiles[i];
            }
        }

        lowestPriceMobile.display();

    }

}

// we have an array of mobile objects called mobiles. The goal is to find the
// mobile with the lowest price from this array.

// To achieve this, we initialize a variable called lowestPriceMobile with the
// first mobile in the array (mobiles[0]). This serves as our initial reference
// for the mobile with the lowest price.

// Next, we iterate over each mobile in the array using a for loop. The loop
// starts at index 0 and continues until it reaches the last index of the array
// (mobiles.length - 1).

// Inside the loop, we compare the price of the current mobile
// (mobiles[i].price) with the price of the lowestPriceMobile. If the price of
// the current mobile is lower than the price of the lowestPriceMobile, we
// update the lowestPriceMobile variable to reference the current mobile.

// By the end of the loop, the lowestPriceMobile variable will hold a reference
// to the mobile object with the lowest price in the mobiles array.

// This code snippet demonstrates a common pattern for finding the minimum value
// in an array. It can be used for various scenarios where you need to find the
// smallest or lowest value in a collection of objects.
