public interface AccountBuilder {
    void reset();
    void buildBalance(double amount);
    void buildWithdraw(double amount);
    Account getResult();
}