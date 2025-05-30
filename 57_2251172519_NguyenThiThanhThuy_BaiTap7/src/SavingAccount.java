public class SavingAccount implements AccountType {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.05; // Lãi suất 5% cho SavingAccount
    }

    @Override
    public void withdraw(double amount, double balance) {
        if (balance >= amount) {
            System.out.println("So tien rut la: " + amount + " tu tai khoan tiet kiem. So du moi la " + (balance - amount));
        } else {
            System.out.println("Khong du so du tu tai khoan tiet kiem voi so tien rut.");
        }
    }
}