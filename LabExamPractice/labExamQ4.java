// Q4:  Define a class called BankAccount with two data members: balance and Account Number .This class should also have the following. a) constructor to initialize the variables with values passed from main method using parameters. b) set()and get() methods for setting value and returning value for the class variables. c) method deposit() to add an amount to the balance. d) a method withdraw() to deduct an amount from the balance. Define another class that hosts the main method. Inside the main method: Create an instance/object of the BankAccount class. Call all the methods using the instance/object created to display their functionality.

class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // the setters are not necessary for this problem, but I added them but the
    // question is dubious
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, 123456789);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        account.deposit(100);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(50);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}
