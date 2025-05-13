public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút của bạn phải lớn hơn 0.");
            return;
        }
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Rút thành công. Số dư còn lại của bạn: " + balance);
        } else {
            System.out.println("Số dư tối thiểu phải là 100. Không thể rút.");
        }
    }
}
