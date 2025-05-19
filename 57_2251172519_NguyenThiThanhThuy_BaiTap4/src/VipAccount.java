public abstract class VipAccount {
    protected double balance;

    public VipAccount(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
