public class NormalAccount implements Account {
    private double balance;

    public NormalAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("NormalAccount: Rút thành công " + amount + ", số dư còn lại của bạn là: " + balance);
        } else {
            System.out.println("NormalAccount: Rút thất bại, không đủ tiền trong tài khoản.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}