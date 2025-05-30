public interface AccountType {
    double calculateInterest(double balance); // Tính lãi suất
    void withdraw(double amount, double balance); // Rút tiền
}