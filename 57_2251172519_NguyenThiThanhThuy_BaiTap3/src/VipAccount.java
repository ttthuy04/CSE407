public class VipAccount implements Account {
    private double balance;

    public VipAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        // Cho phép rút vượt số dư nhưng không vượt quá -200
        if (balance - amount >= -200) {
            balance -= amount;
            System.out.println("VipAccount: Rút thành công " + amount + ". Số dư còn lại: " + balance);
        } else {
            System.out.println("VipAccount: Rút thất bại. Không được vượt quá hạn mức tín dụng -200.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
