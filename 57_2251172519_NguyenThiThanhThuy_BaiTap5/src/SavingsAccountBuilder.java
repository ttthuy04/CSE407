public class AccountDirector {
    private AccountBuilder builder;

    public AccountDirector(AccountBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(AccountBuilder builder) {
        this.builder = builder;
    }

    public Object make(String type) {
        builder.reset();
        if (type.equalsIgnoreCase("normal")) {
            builder.buildBalance(1000);
            builder.buildWithdraw(100);
        } else if (type.equalsIgnoreCase("savings")) {
            builder.buildBalance(1500);
            builder.buildWithdraw(300);
        }
        return builder.getResult();
    }
}