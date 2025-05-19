public class PlatinumVipAccount extends VipAccount {

    public PlatinumVipAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Tai khoam Platinum rut tien thanh cong. So du moi la: " + balance);
        } else {
            System.out.println("Rut tien khong thanh cong. Khong du tien");
        }
    }
}
