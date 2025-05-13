public class NormalAccount extends Account {
    public NormalAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút của bạn phải lớn hơn 0.");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rút tiền thành công. Số dư còn lại của bạn: " + balance);
        } else {
            System.out.println("Bạn không đủ tiền để rút.");
        }
    }
}
