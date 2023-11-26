// Q18: Create an interface called Bill with three member functions:
// 1. `calcTax()` to return the calculated tax (tax = Price * taxrate)
// 2. `calcDiscount()` to return the calculated discount (discount = Price *
// discountrate)
// 3. `calcTotalPrice()` to calculate and return the total price (TotalPrice =
// Price + tax - discount)
// 4. `Display()` to display the Price, Tax, Discount, and TotalPrice.

interface Bill {
    double taxRate = 0.05;
    double discountRate = 0.1;

    double calcTax(double price);

    double calcDiscount(double price);

    double calcTotalPrice(double price);

    void display(double price);
}

class BillMain implements Bill {
    public static void main(String[] args) {
        BillMain b = new BillMain();
        b.display(100.0);
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