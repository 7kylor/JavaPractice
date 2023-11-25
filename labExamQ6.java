// Q6: Define a class called Product with three data members: productId, name, and price. Appropriate data types are to be chosen. The class should also have the necessary set and get member functions to set the values for the data members and to return the values of the data members respectively. Define another class that hosts the main method. Inside the main method: Create two instances/objects of the Product class. Call the set and get methods using the instance/objects created to display their functionality.

class Product {
    int productId;
    String name;
    double price;

    void setProductId(int productId) {
        this.productId = productId;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getProductId() {
        return productId;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}

class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProductId(1);
        p1.setName("Product 1");
        p1.setPrice(100.0);

        Product p2 = new Product();
        p2.setProductId(2);
        p2.setName("Product 2");
        p2.setPrice(200.0);

        System.out.println("Product 1 ID: " + p1.getProductId());
        System.out.println("Product 1 Name: " + p1.getName());
        System.out.println("Product 1 Price: " + p1.getPrice());

        System.out.println("Product 2 ID: " + p2.getProductId());
        System.out.println("Product 2 Name: " + p2.getName());
        System.out.println("Product 2 Price: " + p2.getPrice());
    }
}
