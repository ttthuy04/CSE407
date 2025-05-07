// Lớp SavingsAccount kế thừa Account
public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0.");
            return;
        }

        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Rút thành công (Tài khoản tiết kiệm). Số dư còn lại: " + balance);
        } else {
            System.out.println("Không thể rút. Số dư phải luôn lớn hơn hoặc bằng 100.");
        }
    }
}
