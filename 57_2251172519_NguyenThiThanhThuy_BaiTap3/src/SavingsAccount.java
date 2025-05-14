public class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SavingsAccount: Rút thành công " + amount + ". Số dư còn lại: " + balance);
        } else {
            System.out.println("SavingsAccount: Rút thất bại. Không đủ tiền.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
