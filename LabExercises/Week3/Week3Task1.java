// 1. Define a class called BankAccount with two data members: balance and
// Account Number .This
// class should also have the following. a) constructor to initialize the
// variables with values passed
// from main method using parameters. b) set()and get() methods for setting
// value and returning
// value for the class variables. c) method deposit() to add an amount to the
// balance. d) a method
// withdraw() to deduct an amount from the balance. Define another class that
// hosts the main
// method. Inside the main method: Create an instance/object of the BankAccount
// class. Call all
// the methods using the instance/object created to display their functionality.

class BankAccount {

    double balance;
    int accountNumber;

    BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    double getBalance() {
        return balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

class BankAccountOperations {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000.0, 1245489);
        b.display();
        b.deposit(100.0);
        b.display();
        b.withdraw(50.0);
        b.display();
    }
}