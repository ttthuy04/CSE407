public abstract class AccountFactory {
    public abstract Account createAccount(double balance);
    public void withdraw(double amount, double initialBalance) {
        Account account = createAccount(initialBalance);
        account.withdraw(amount);
    }
}