public class NormalAccountBuilder implements AccountBuilder {
    private NormalAccount account;

    @Override
    public void reset() {
        account = new NormalAccount();
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
    public Object getResult() {
        return account;
    }
}