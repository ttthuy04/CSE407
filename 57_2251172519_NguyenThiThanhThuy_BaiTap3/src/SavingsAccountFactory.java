public class SavingsAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new SavingsAccount(500);
    }
}
