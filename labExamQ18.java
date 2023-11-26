// Q18: Create an interface called Bill with three member functions:

// 1. Create an interface called Bill . It has three member functions
// 2. calcTax () to return calculated tax (tax = Price* taxrate)
// 3. calcDiscount() return calculated discount (discount = Price* discountrate)
// 4. calcTotalPrice () to calculate and return Total Price( TotalPrice= Price
// +tax-discount),
// Display() to display Price, Tax, Discount and TotalPrice.

// Create two classes IndustryProduct and HouseHoldProduct that implements
// interface Bill. This
// class has two data members for Price and DiscountRate . One method
// assignvalue to assign
// value to the data members using parameter. Implement the 4 methods of the
// interface in these
// two classes.
// Create a main class which has main method. Create an object of
// IndustryProduct and
// HouseHoldProdcut class. Call the methods display to display Price, Tax,
// Discount and
// TotalPrice.

interface Bill {
    double taxRate = 0.5;
    double discountRate = 0.1;

    double calcTax(double price);

    double calcDiscount(double price);

    double calcTotalPrice(double price);

    void display(double price);
}

class IndustryProduct implements Bill {
    double price, discountRate;

    IndustryProduct(double price, double discountRate) {
        this.price = price;
        this.discountRate = discountRate;
    }

    public double calcTax(double price) {
        return price * taxRate;
    }

    public double calcDiscount(double price) {
        return price * discountRate;
    }

    public double calcTotalPrice(double price) {
        return price + calcTax(price) - calcDiscount(price);
    }

    public void display(double price) {
        System.out.println("Price: " + price);
        System.out.println("Tax: " + calcTax(price));
        System.out.println("Discount: " + calcDiscount(price));
        System.out.println("Total Price: " + calcTotalPrice(price));
    }
}

class HouseHoldProduct implements Bill {
    double price, discountRate;

    HouseHoldProduct(double price, double discountRate) {
        this.price = price;
        this.discountRate = discountRate;
    }

    public double calcTax(double price) {
        return price * taxRate;
    }

    public double calcDiscount(double price) {
        return price * discountRate;
    }

    public double calcTotalPrice(double price) {
        return price + calcTax(price) - calcDiscount(price);
    }

    public void display(double price) {
        System.out.println("Price: " + price);
        System.out.println("Tax: " + calcTax(price));
        System.out.println("Discount: " + calcDiscount(price));
        System.out.println("Total Price: " + calcTotalPrice(price));
    }
}

class BillMain {
    public static void main(String[] args) {
        IndustryProduct i = new IndustryProduct(100.0, 0.1);
        i.display(i.price);
        System.out.println("----------");

        HouseHoldProduct h = new HouseHoldProduct(100.0, 0.1);
        h.display(h.price);
        System.out.println("----------");
    }
}
