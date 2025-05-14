public class NormalAccount implements Account {
    private double balance;
    public NormalAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("NormalAccount: Rút thành công " + amount + ". Số dư còn lại: " + balance);
        } else {
            System.out.println("NormalAccount: Rút thất bại. Không đủ tiền.");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
