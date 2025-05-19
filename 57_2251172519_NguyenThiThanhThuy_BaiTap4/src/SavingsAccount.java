public abstract class SavingsAccount {
    protected double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
