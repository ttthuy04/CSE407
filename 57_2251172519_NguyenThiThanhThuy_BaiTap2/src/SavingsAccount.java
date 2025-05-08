public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien rut phai lon hon 0");
            return;
        }
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Khong the rut tien, so du cua ban luon phai lon hon hoac bang 100");
        }
    }
}