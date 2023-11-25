// Q4:  Define a class called BankAccount with two data members: balance and Account Number .This class should also have the following. a) constructor to initialize the variables with values passed from main method using parameters. b) set()and get() methods for setting value and returning value for the class variables. c) method deposit() to add an amount to the balance. d) a method withdraw() to deduct an amount from the balance. Define another class that hosts the main method. Inside the main method: Create an instance/object of the BankAccount class. Call all the methods using the instance/object created to display their functionality.

class BankAccount {
    double balance;
    String accountNumber;

    BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000.0, "1234567890");
        System.out.println("Balance: " + b.getBalance());
        System.out.println("Account Number: " + b.getAccountNumber());
        b.deposit(100.0);
        System.out.println("Balance: " + b.getBalance());
        b.withdraw(50.0);
        System.out.println("Balance: " + b.getBalance());
    }
}