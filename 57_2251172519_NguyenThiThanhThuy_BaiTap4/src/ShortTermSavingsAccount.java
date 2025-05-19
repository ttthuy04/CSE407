public class ShortTermSavingsAccount extends SavingsAccount {

    public ShortTermSavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Tai khoan ngan han rut tien thanh cong. So dư moi la: " + balance);
        } else {
            System.out.println("Rut tien khong thanh cong. So du toi thieu la 100 nghin");
        }
    }
}
