// Q4:  Define a class called BankAccount with two data members: balance and Account Number .This class should also have the following. a) constructor to initialize the variables with values passed from main method using parameters. b) set()and get() methods for setting value and returning value for the class variables. c) method deposit() to add an amount to the balance. d) a method withdraw() to deduct an amount from the balance. Define another class that hosts the main method. Inside the main method: Create an instance/object of the BankAccount class. Call all the methods using the instance/object created to display their functionality.

class BankAccount {

    double balance;
    String accountNumber;

    // Constructor to initialize the variables with values passed from the main
    // method using parameters
    BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Set method to set the value of the balance
    void setBalance(double balance) {
        this.balance = balance;
    }

    // Get method to return the value of the balance
    double getBalance() {
        return balance;
    }

    // Method to deposit an amount to the balance
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw an amount from the balance
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display the balance and account number
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0, "1234567890"); // Creating an instance/object of the BankAccount
                                                                     // class

        account.display(); // Displaying initial balance and account number

        account.deposit(500.0); // Depositing 500.0
        account.display(); // Displaying updated balance

        account.withdraw(200.0); // Withdrawing 200.0
        account.display(); // Displaying updated balance

        account.setBalance(1500.0); // Setting balance to 1500.0
        account.display(); // Displaying updated balance
    }
}
