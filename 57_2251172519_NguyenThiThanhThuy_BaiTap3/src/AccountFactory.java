public abstract class AccountFactory {
    public abstract Account createAccount();
    public void withdraw(double amount) {
        Account account = createAccount();
        account.withdraw(amount);
    }
}
