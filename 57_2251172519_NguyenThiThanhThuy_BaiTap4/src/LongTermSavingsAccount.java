public class LongTermSavingsAccount extends SavingsAccount {

    public LongTermSavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Tai khoan dai han rut tien thanh cong. So du moi la: " + balance);
        } else {
            System.out.println("Rut tien khong thanh cong. So du toi thieu la 100 nghin");
        }
    }
}
