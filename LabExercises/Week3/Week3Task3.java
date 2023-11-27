// 3. Define a class called Product with three data members: productId, name,
// and price. Appropriate data types are to be chosen. The class should also have the
// necessary set and get member functions to set the values for the data members and to return the
// values of the data members respectively. Define another class that hosts the main method. Inside
// the main method: Create two instances/objects of the Product class. Call the set and
// get methods using the instance/objects created to display their functionality.

class Product {
    String name;
    int productId;
    double price;

    void setName(String name) {
        this.name = name;
    }

    void setProductId(int productId) {
        this.productId = productId;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

}

class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();

        product1.setProductId(1);
        product1.setName("Product 1");
        product1.setPrice(100);

        product2.setProductId(2);
        product2.setName("Product 2");
        product2.setPrice(200);

        System.out.println("Product 1: " + product1.getProductId() + " " + product1.getName() + " "
                + product1.getPrice());
        System.out.println("Product 2: " + product2.getProductId() + " " + product2.getName() + " "
                + product2.getPrice());
    }
}