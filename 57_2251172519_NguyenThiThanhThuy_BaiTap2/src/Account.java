// Lớp cha Account
public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rút thành công. Số dư còn lại: " + balance);
        } else {
            System.out.println("Số dư không đủ để rút.");
        }
    }
}
