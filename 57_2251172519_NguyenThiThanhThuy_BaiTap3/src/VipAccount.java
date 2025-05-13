public class VipAccount extends Account {
    public VipAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút của bạn phải lớn hơn 0.");
            return;
        }
        if (balance - amount >= -400) {
            balance -= amount;
            System.out.println("Rút thành công (VIP). Số dư còn lại của bạn: " + balance);
        } else {
            System.out.println("Tài khoản VIP không thể rút quá giới hạn âm 400.");
        }
    }
}
