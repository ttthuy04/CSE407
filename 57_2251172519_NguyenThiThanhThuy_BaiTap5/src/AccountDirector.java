public class AccountDirector {
    private AccountBuilder builder;
    public AccountDirector(AccountBuilder builder) {
        this.builder = builder;
    }
    public void changeBuilder(AccountBuilder builder) {
        this.builder = builder;
    }
    public Account make(String type) {
        builder.reset();
        builder.buildBalance(1000.0);
        builder.buildWithdraw(200.0);
        return builder.getResult();
    }
}