// Hàm kiểm thử
public class Main {
    public static void main(String[] args) {
        // Test với tài khoản thường
        Account acc = new Account(500);
        acc.withdraw(300); // Hợp lệ
        acc.withdraw(300); // Không hợp lệ (số dư không đủ)

        System.out.println();

        // Test với tài khoản tiết kiệm
        SavingsAccount savAcc = new SavingsAccount(500);
        savAcc.withdraw(300); // Hợp lệ (còn 200)
        savAcc.withdraw(150); // Không hợp lệ (còn dưới 100)
    }
}
