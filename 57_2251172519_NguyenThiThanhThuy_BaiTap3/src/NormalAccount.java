public class NormalAccount extends Account {
    public NormalAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rút thành công. Số dư còn: " + balance);
        } else {
            System.out.println("Không đủ tiền.");
        }
    }
}
