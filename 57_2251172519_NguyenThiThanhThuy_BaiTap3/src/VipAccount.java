public class VipAccount implements Account {
    private double balance;

    public VipAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0.");
            return;
        }
        if (balance - amount >= -400) {
            balance -= amount;
            System.out.println("VipAccount: Rút thành công " + amount + ", số dư còn lại của bạn là: " + balance);
        } else {
            System.out.println("VipAccount: Không thể rút quá giới hạn âm 400. Số dư hiện tại: " + balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
