public class VipAccount extends Account {
    public VipAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (balance - amount >= -500) {
            balance -= amount;
            System.out.println("Rút thành công (VIP). Số dư còn: " + balance);
        } else {
            System.out.println("Vượt hạn mức thấu chi.");
        }
    }
}
