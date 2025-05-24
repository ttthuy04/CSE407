public class SavingsAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("So tien tai khoan tiet kien rut: " + amount);
        } else {
            System.out.println("Tai khoan tiet kiem khong du tien.");
        }
    }
}
