//  Create an abstract class called BankAccount that provides a common structure for all types of bank accounts. It should have the data members, account id and account type , balance amount.It should have
// set and get methods to set and get the values of data members. It should also include an abstract method calculateIntereset() to calculate
// Interest, which is specific to each account type.
// • Create subclasses SavingsAccount and CurrentAccount that extends
// BankAccount. They should provide implementations for the calculateIntereset() method, tailored to the specific account types using the formula given below
// • SavingsAccountInterest = 2% of balance amount. ,
// CurrentAccountInterest = 0% of balance amount.
// • In the Main class, create Objects of SavingsAccount and
// CurrentAccount, and call the get and set methods and calculateInterest() method to calculate the interest for each account
// type.

abstract class BankAccount {
    private int accountId;
    private String accountType;
    private double balanceAmount;

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    @Override // check if the method is actually overriding the parent method or not
    public double calculateInterest() {
        return getBalanceAmount() * 0.02;
    }
}

class CurrentAccount extends BankAccount {
    @Override // check if the method is actually overriding the parent method or not
    public double calculateInterest() {
        return getBalanceAmount() * 0.0;
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingsAccount.setAccountId(1);
        savingsAccount.setAccountType("Savings");
        savingsAccount.setBalanceAmount(1000.0);

        currentAccount.setAccountId(2);
        currentAccount.setAccountType("Current");
        currentAccount.setBalanceAmount(1000.0);

        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());
    }
}