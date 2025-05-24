public abstract class Account {
    protected double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);
}