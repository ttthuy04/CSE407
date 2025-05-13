public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Rút thành công. Số dư còn: " + balance);
        } else {
            System.out.println("Không được rút dưới hạn mức 100.");
        }
    }
}
