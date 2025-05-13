public class SavingsAccountFactory extends AccountFactory {
    public Account createAccount(double balance) {
        return new SavingsAccount(balance);
    }
}
