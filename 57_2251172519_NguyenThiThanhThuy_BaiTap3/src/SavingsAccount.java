public class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount: Rút thành công " + amount + ", số dư còn lại của bạn là: " + balance);
        } else {
            System.out.println("SavingsAccount: Rút thất bại, không đủ tiền trong tài khoản.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}