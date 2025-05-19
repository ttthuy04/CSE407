public class GoldVipAccount extends VipAccount {

    public GoldVipAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rut tien goi VIP thanh cong. So du moi la: " + balance);
        } else {
            System.out.println("Rut tien khong thanh cong. Khong du tien");
        }
    }
}
