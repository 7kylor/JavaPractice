// 14. Create an abstract class called BankAccount that provides a common structure for all types of
// bank accounts. It should have the data members, account id and account type, balance
// amount.It should have two methods to initialize the values of data members and display the
// value of data members. It should also include an abstract method calculateIntereset() to
// calculate and display the interest, which is specific to each account type.
// Create subclasses SavingsAccount and CurrentAccount that extends BankAccount. They should
// provide implementations for the calculateIntereset() method, tailored to the specific account
// types using the formula given below SavingsAccountInterest = 2% of balance amount , CurrentAccountInterest = 0% of balance amount. In the Main class, create Objects of SavingsAccount and CurrentAccount, and call the get and set methods and calculateInterest() method to calculate the interest for each account type.

abstract class BankAccount {
    String accountId, accountType;
    double balance;

    void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    String getAccountId() {
        return accountId;
    }

    String getAccountType() {
        return accountType;
    }

    double getBalance() {
        return balance;
    }

    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest: " + (balance * 0.02));
    }
}

class CurrentAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest: " + (balance * 0.0));
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.setAccountId("111111111190");
        s.setAccountType("Savings");
        s.setBalance(70000.0);
        System.out.println("Account ID: " + s.getAccountId());
        System.out.println("Account Type: " + s.getAccountType());
        System.out.println("Balance: " + s.getBalance());
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount();
        c.setAccountId("09800000000001");
        c.setAccountType("Current");
        c.setBalance(100000.0);
        System.out.println("Account ID: " + c.getAccountId());
        System.out.println("Account Type: " + c.getAccountType());
        System.out.println("Balance: " + c.getBalance());
        c.calculateInterest();
    }
}