public abstract class Account {
    protected AccountType accountType;
    protected double balance;

    public Account(AccountType accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public double calculateInterest() {
        return accountType.calculateInterest(balance);
    }

    public void withdraw(double amount) {
        accountType.withdraw(amount, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("So tien gui vao ngan hang " + amount + ". So du moi: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}