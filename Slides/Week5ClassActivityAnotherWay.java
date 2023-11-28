//  structure for all types of bank accounts. It should have the data members, account id and account type , balance amount.It should have
// set and get methods to set and get the values of data members. It should also include an abstract method calculateIntereset() to calculate
// Interest, which is specific to each account type.
// • Create subclasses SavingsAccount and CurrentAccount that extends
// BankAccount. They should provide implementations for the calculateIntereset() method, tailored to the specific account types using the formula given below
// • SavingsAccountInterest = 2% of balance amount. ,
// CurrentAccountInterest = 0% of balance amount.
// • In the Main class, create Objects of SavingsAccount and
// CurrentAccount, and call the get and set methods and calculateInterest() method to calculate the interest for each account
// type.

// this is another way of doing the same thing but with abstract class and abstract method of type void
abstract class BankAccount {
    int accountId;
    String accountType;
    double balance;

    BankAccount(int accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    int getAccountId() {
        return accountId;
    }

    String getAccountType() {
        return accountType;
    }

    double getBalance() {
        return balance;
    }

    abstract void calcInterest();

}

class SavingAccount extends BankAccount {
    double interestRate;

    SavingAccount(int accountId, String accountType, double balance) {
        super(accountId, accountType, balance);
        this.interestRate = 0.02;
    }

    @Override // used to override the method from the parent class
    void calcInterest() {
        interestRate = 0.02;
        System.out.println("Interest: " + (balance * interestRate));
    }
}

class CurrentAccount extends BankAccount {
    double interestRate;

    CurrentAccount(int accountId, String accountType, double balance) {
        super(accountId, accountType, balance);
        this.interestRate = 0.0;
    }

    @Override // used to override the method from the parent class
    void calcInterest() {
        interestRate = 0.0;
        System.out.println("Interest: " + (balance * interestRate));
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1, "Saving", 1000.0);
        CurrentAccount currentAccount = new CurrentAccount(2, "Current", 1000.0);

        savingAccount.calcInterest();
        currentAccount.calcInterest();
    }
}
