public class SavingsAccountFactory extends AccountFactory {
    @Override
    public Account createAccount(double balance) {
        return new SavingsAccount(balance);
    }
}