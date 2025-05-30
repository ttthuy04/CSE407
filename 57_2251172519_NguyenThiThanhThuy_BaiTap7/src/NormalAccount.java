public class NormalAccount implements AccountType {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.01; // Lãi suất 1% cho NormalAccount
    }

    @Override
    public void withdraw(double amount, double balance) {
        if (balance >= amount + 10) { // Phí rút tiền 10 đơn vị
            System.out.println("So tien rut la: " + amount + " tu tai khoan thuong voi phi la 10. So du moi la: " + (balance - amount - 10));
        } else {
            System.out.println("Khong du so du tu tai khoan thuong voi so tien rut(bao gom ca phi)");
        }
    }
}