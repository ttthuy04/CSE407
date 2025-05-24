public class SavingsAccountBuilder implements AccountBuilder {
    private SavingsAccount account;

    @Override
    public void reset() {
        account = new SavingsAccount();
    }

    @Override
    public void buildBalance(double amount) {
        account.setBalance(amount);
    }

    @Override
    public void buildWithdraw(double amount) {
        account.withdraw(amount);
    }

    @Override
    public Account getResult() {
        return account;
    }
}