public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien rut cua ban phai lon hon 0");
            return;
        }
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Rut tien thanh cong, so du con lai la: " + balance);
        } else {
            System.out.println("Rut tien khong thanh cong, so du khong du.");
        }
    }
}